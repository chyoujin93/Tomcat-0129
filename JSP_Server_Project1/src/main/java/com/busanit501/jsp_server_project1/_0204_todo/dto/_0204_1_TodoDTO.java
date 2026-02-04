// 0203 → 롬복 스타일로 변경
package com.busanit501.jsp_server_project1._0204_todo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data               // 복합 어노테이션
@Builder            // 객체 생성을 체인 기법을 이용하여, 편하게 작업하기 위해서 사용함
@NoArgsConstructor  // 기본 생성자를 생성함
@AllArgsConstructor // 모든 멤버를 매개변후로 가지는 생성자를 생성함
public class _0204_1_TodoDTO {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private  boolean finished;


}
