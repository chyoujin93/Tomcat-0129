package com.busanit501.jsp_server_project1.springex_new_0219_keep.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;

@Controller
@Log4j2
public class SampleController {

    // 화면 연결이 없는데, 어떻게 화면으로 이동하나요?
    // 스프링 내부구조에 담당자 이름 : 뷰 리졸버
    // http://localhost:8080/hello2
    // 서버에서, /WEB-INF/views/hello2.jsp
    // hello2 (접미어)
    @GetMapping("/hello2")
    public void hello() {
        log.info(" hello spring mvc ~~~ ");
    }

    // 화면에서 get 데이터를 서버에게 전달하는 방법
    // 쿼리 스트링 이용하기.
    // http://localhost:8080/ex1?name=최유진&age=32
    // 화면 제공x 로그에 표시 -> 화면 제공 원하면 만들면 됨 -> ex1.jsp 생성완료
    @GetMapping("/ex1")
    public void ex1(String name, int age) {
        log.info(" ex1 ~~~ ");
        log.info(" 데이터 수집 : name : " + name);
        log.info(" 데이터 수집 : age : " + age);
    }

    // http://localhost:8080/ex2?name=최유진&age=34
    // http://localhost:8080/ex2
    @GetMapping("/ex2")
    public void ex2(@RequestParam(name = "name", defaultValue = "이름을 입력해주세요") String name,
                    @RequestParam(name = "age", defaultValue = "20") int age) {
        log.info(" ex2 ~~~ ");
        log.info(" 데이터 수집 : name : " + name);
        log.info(" 데이터 수집 : age : " + age);
    }

    // http://localhost:8080/ex3?dueDate=2026-02-19
    // 화면에서, dueDate=2026-02-13 : 문자열 타입.
    // 서버에서 받는 타입은 : LocalDate
    // 도대체 누가 중간에서 변환했지? -> servlet-context에 있는 Bean(객체이름: conversionService)이 변환해줌.
    @GetMapping("/ex3")
    public void ex3(LocalDate dueDate) {
        log.info(" ex3 ~~~ ");
        log.info(" 데이터 수집 : dueDate : " + dueDate);
    }

    // http://localhost:8080/ex4
    @GetMapping("/ex4")
    public void ex4(Model model) {
        log.info(" ex4 ~~~ ");
        log.info(" 데이터 받아서 화면에 전달하자 ");
        // 화면에 데이터 전달하기. model을 이용해서.
        model.addAttribute("msg", "hello~~"); // 박스에 라벨링(Key), 내용물(Value) 작업.
    }

    // 사용자가 브라우저에 요청 -> http://localhost:8080/ex5
    // 서버가 응답 -> http://localhost:8080/ex6?name=Test+EX5
    @GetMapping("/ex5")
    public String ex6(RedirectAttributes redirectAttributes) {
        log.info(" ex5 ~~~ ");
        log.info(" 데이터 받아서 화면에 전달하자. 1) 쿼리 스트링으로 전달. 2) 1회용으로도 ");
        // 화면에 데이터 전달하기. model을 이용해서.
        // 1) 쿼리 스트링으로 전달 (URL 주소창에 보임. 공백은 +로 인코딩됨)
        redirectAttributes.addAttribute("name", "Test EX5"); // 주소창 URL에 붙음. 새로고침해도 유지됨.
        // 2) 1회용 -> 새로고침하면 success 사라짐 (서버가 몰래 1회용으로 들고감. URL에는 안보임)
        redirectAttributes.addFlashAttribute("result", "success"); // URL에 안보임. 서버 내부 세션에 잠간 저장. 딱 한번만 사용 가능 (새로고침하면 사라짐)
        // 리다이렉트. 화면에 데이터 전달하기.
        return "redirect:/ex6";
    }

    @GetMapping("/ex6")
    public void ex6() {
        log.info(" ex6 ~~~ ");
    }

    // http://localhost:8080/ex7?p1=ABC&p2=DEF
    @GetMapping("/ex7")
    // 화면에서 전달하는 값은 기본 무조건 문자열임.
    // 그런데 받을때는 임의로 숫자타입으로 받고있음
    // 예외가 발생되는 부분. (강제로 예외 발생시킴)
    public void ex7(String p1, int p2) {
        log.info(" p1 : " + p1);
        log.info(" p2 : " + p2);
    }

}
