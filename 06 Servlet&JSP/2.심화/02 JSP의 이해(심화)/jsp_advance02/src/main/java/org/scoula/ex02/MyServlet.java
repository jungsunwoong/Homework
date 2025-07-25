package org.scoula.ex02;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "my",value = "/my")
public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get 요청됨.");
    }
    // post 요청 시 자동 호출 되는 메소드
    // doGet(),doPost() 는 service() 가 판단하여 호출함
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post 요청됨.");
    }

    // get 요청 시 자동 호출 되는 메소드
    @Override
    public void init() throws ServletException {
        System.out.println("서블릿 객체생성시 초기화할 내용... 한번만 호출");
    }

    @Override
    public void destroy() {
        System.out.println("서블릿 객체소멸시 정리할 내용... 한번만 호출");
    }
}
