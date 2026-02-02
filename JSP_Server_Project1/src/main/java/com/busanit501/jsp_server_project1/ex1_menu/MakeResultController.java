package com.busanit501.jsp_server_project1.ex1_menu;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="makeResultController", urlPatterns = "/menu/result")
public class MakeResultController extends HttpServlet {
    // post 처리 담당.
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // 받을 때 한글 설정,
        req.setCharacterEncoding("UTF-8");
        // 클씨한테 숫자를 전달 받아서, 꺼내서 사용하기.
        // 서블릿에서는(자바파일), 받는 방법이
        //req 객체에서 꺼내서 사용하빈다.
        String menu = req.getParameter("menu");
        // 보낼 때 한글 설정.
        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");


        System.out.println("전달 받은 메뉴 menu : " + menu);

    }

}
