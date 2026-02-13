package com.busanit501.jsp_server_project1._0209_todo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor // 매개변수가 모두 있는 생성자
@NoArgsConstructor // 기본 생성자
public class _0209_18_MemberDTO {
    // 데이터베이스의 컬럼과 동일하게 작업.
    private String mid;
    private String mpw;
    private String mname;
    // 자동로그인 기능 추가 0209, 순서3
    private String uuid;
}