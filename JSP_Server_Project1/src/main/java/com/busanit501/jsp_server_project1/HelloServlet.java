package com.busanit501.jsp_server_project1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    @Override
    public void init() {
        message = "오늘 점심 뭐 먹지?";
        System.out.println("### init() 실행됨: " + message);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("### doGet() 실행됨 ###");

        response.setContentType("text/html; charset=UTF-8");

        PrintWriter out = response.getWriter(); // ✅ 먼저 생성
        out.println("<html><body>");
        out.println("<h2>time: " + System.currentTimeMillis() + "</h2>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }
}
