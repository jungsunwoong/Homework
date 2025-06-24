package org.scoula.ex06;

import org.scoula.ex06.command.Command;
import org.scoula.ex06.controller.HomeController;
import org.scoula.ex06.controller.TodoController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "frontControllerServlet", value = "/")
public class FrontControllerServlet extends DispatcherServlet {
    Map<String, Command> getMap;
    Map<String, Command> postMap;

    String prefix = "/WEB-INF/views/";
    String suffix = ".jsp";
    HomeController homeController = new HomeController();
    TodoController todoController = new TodoController();

    public void init() {
        getMap = new HashMap<>();
        postMap = new HashMap<>();
        getMap.put("/", homeController::getIndex);

        getMap.put("/todo/list", todoController::getList);
        getMap.put("/todo/view", todoController::getView);
        getMap.put("/todo/create", todoController::getCreate);
        getMap.put("/todo/update", todoController::getUpdate);
        postMap.put("/todo/create", todoController::postCreate);
        postMap.put("/todo/update", todoController::postUpdate);
        postMap.put("/todo/delete", todoController::postDelete);


    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Command command = getCommand(request);
        if(command != null) {
            execute(command, request, response);
        } else { // 404 에러 처리
            String view = prefix + "404" + suffix;
            RequestDispatcher dis = request.getRequestDispatcher(view);
            dis.forward(request, response);
        }

    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doGet(request, response);
    }

    private String getCommandName(HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        String contextPath = request.getContextPath();
        return requestURI.substring(contextPath.length());
    }

    private Command getCommand(HttpServletRequest request) {
        String commandName = getCommandName(request);
        Command command;
        if (request.getMethod().equalsIgnoreCase("GET")) {
            command = getMap.get(commandName);
        } else {
            command = postMap.get(commandName);
        }
        return command;
    }
    private void execute(Command command, HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        String viewName = command.execute(request, response);
        if(viewName.startsWith("redirect:")) { // redirect 처리
            response.sendRedirect(viewName.substring("redirect:".length()));
        } else { // forward 처리
            String view = prefix + viewName + suffix;
            RequestDispatcher dis = request.getRequestDispatcher(view);
            dis.forward(request, response);
        }
    }
}

