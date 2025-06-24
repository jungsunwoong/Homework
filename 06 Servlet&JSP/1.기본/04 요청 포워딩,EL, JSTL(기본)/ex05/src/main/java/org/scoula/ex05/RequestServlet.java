package org.scoula.ex05;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("username","홍길동");
        req.setAttribute("useraddress","서울");

        //foword
        RequestDispatcher rd = req.getRequestDispatcher("/response.jsp");
        rd.forward(req,resp);
    }
}
