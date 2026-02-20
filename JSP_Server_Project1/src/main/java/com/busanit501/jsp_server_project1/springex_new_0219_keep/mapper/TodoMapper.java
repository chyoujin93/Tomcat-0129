package com.busanit501.jsp_server_project1.springex_new_0219_keep.mapper;

import com.busanit501.jsp_server_project1.springex_new_0219_keep.domain.TodoVO;
import java.util.List;

public interface TodoMapper {
    String getTime();

    // 0220_추가
    // 화면에서, 입력된 정보를 받기 -> DTO담기 -> VO변환 -> DB에 전달
    void insert(TodoVO tOdoVO);

    // 전체 목록 조회
    List<TodoVO> selectAll();

}
