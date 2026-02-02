package com.busanit501.jsp_server_project1.ex1_menu;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="menuInputController", urlPatterns = "/menu/input")
public class MenuInputController extends HttpServlet {

    @Override // doGet, 화면을 제공함.
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {


        resp.setContentType("text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        // 순서1, 요청이 잘 왔는지 확인.
        System.out.println("MenuInputController doGet  메서드, 요청이 잘 도착했습니다. ");
        // 순서2, 실제로, 어느 화면으로 갈지를 정해주는 기능.
        RequestDispatcher dispatcher =
                req.getRequestDispatcher("/WEB-INF/_0130_1_menu/menuInput.jsp");
        // 순서3, dispatcher(비유, 공항의 관제탑, 비행기 착륙시 어디 활주로로 갈까요?
        // 네, 8번 활주로 오세요 응답)
        // dispatcher -> 여기 화면으로 이동하세요.
        dispatcher.forward(req,resp);

        // 확인.
        // 웹브라우저에서,
//        http://localhost:8080/menu/input
        // 서버, 자바 코드 작업 후, 반드시 모두 배포 해주세요.,
        // 나중에, 자동 리로드가 됩니다. 일단, 지금은 수동으로.,


    }

}
