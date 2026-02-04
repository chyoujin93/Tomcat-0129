package com.busanit501.jsp_server_project1._0204_todo.controller;

import com.busanit501.jsp_server_project1._0204_todo.dto._0204_1_TodoDTO;
import com.busanit501.jsp_server_project1._0204_todo.service._0204_4_TodoService;
import lombok.extern.log4j.Log4j2;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Log4j2
@WebServlet(name="_0204_8_TodoRegController", urlPatterns = "/todo/register_0204")
public class _0204_8_TodoRegController extends HttpServlet {

    //
    private _0204_4_TodoService todoService = _0204_4_TodoService.INSTANCE;

    //
    // private final DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private final DateTimeFormatter DATEFORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

       log.info("/todo/register, 글작성 폼 임시화면 get으로 요청 처리함. ");
        req.getRequestDispatcher("/WEB-INF/_0204_todo/todoReg.jsp").forward(req,resp);
    }


    //순서4, 글쓰기 로직 처리.
    // post 처리 담당.
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        log.info("todo/register 글쓰기 로직 처리하는 곳입니다.");
        log.info("PRG 패턴으로 글쓰기 post 작업 후, 리다이렉트 목록 화면으로 이동하기.");

        //
        _0204_1_TodoDTO todoDTO = _0204_1_TodoDTO.builder()
                        .title(req.getParameter("title"))
                        .dueDate(LocalDate.parse(req.getParameter("dueDate"),DATEFORMATTER))
                                .build();

        try {
            todoService.register(todoDTO);
        } catch (Exception e) {
            e.printStackTrace();
        }


        resp.sendRedirect("/todo/list_0204");

    }

}
