package com.busanit501.jsp_server_project1._0202_todo;


import com.busanit501.jsp_server_project1._0202_todo.dto._3_TodoDTO;
import com.busanit501.jsp_server_project1._0202_todo.service._4_TodoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name="_3_TodoReadController_0202", urlPatterns = "/todo/read_0202")
public class _3_TodoReadController extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // 현재 작업하는 파일이 어디인지 서버 콘솔에 출력
        System.out.println("/todo/read_0202, get으로 요청 처리함. ");
        // 임시로 하나 조회할 더미 데이터를 지정
        // 웹브라우저에서 주소 요청: http://localhost:8080/todo/read_0202?tno=100
        // 서버는 웹에서 전달한 데이터를 가져오기.
        // req.getParameter("tno") => 문자열이기 때문에 파싱해서 숫자 형태로 변경
        // Long.parseLong(문자열) -> 문자열 -> 숫자 변경
        Long tno = Long.parseLong(req.getParameter("tno"));

        // 서비스에서 만들었던 get 메서드에 tno 번호를 전달해서 임시 데이터를 가져오기
        _3_TodoDTO dto = _4_TodoService.INSTANCE.get(tno);

        // 데이터를 전달 준비1
        req.setAttribute("dto", dto);

        // 화면에 전달
        req.getRequestDispatcher
                ("/WEB-INF/_0202_todo/_3_todoRead.jsp").forward(req,resp);

    }


}
