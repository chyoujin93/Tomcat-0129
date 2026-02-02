package com.busanit501.jsp_server_project1._0130_1_calc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="calcController", urlPatterns = "/calc/makeResult")
public class CalcController extends HttpServlet {
    // post 처리 담당.
    @Override
     protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // 클씨한테 숫자를 전달 받아서, 꺼내서 사용하기.
        // 서블릿에서는(자바파일), 받는 방법이
        //req 객체에서 꺼내서 사용하빈다.
        String num1 = req.getParameter("num1");
        String num2 = req.getParameter("num2");

        System.out.println("num1 : " + num1);
        System.out.println("num2 : " + num2);

    }
}
