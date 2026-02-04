package com.busanit501.jsp_server_project1._0204_todo.domain;

import lombok.*;

import java.time.LocalDate;

// lombok 라이브러리 사용 -> @게터 @세터 @투스트링 (코드가 훨씬 간결)
@Getter // getter 직접 생성 안하고, 어노테이션 이용하면 메모리상에 다 만들어진다.
@Builder // 객체를 생성시 A a = new A();, 계속 객체를 생성하면서 이어서 작업합니다.
@ToString // ToString 직접 생성 안하고, 어노테이션 이용하면 메모리상에 다 만들어진다.

// 0204 -> 어노테이션 추가
@NoArgsConstructor  // 기본 생성자를 생성함
@AllArgsConstructor // 모든 멤버를 매개변후로 가지는 생성자를 생성함

public class _0204_2_TodoVO {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private  boolean finished;



}
