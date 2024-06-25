package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
// Controller를 구성하는 class는 @Controller가 필요
public class HelloController {
    // hellospring 패키지 내부의 controller이기 때문에 'localhost8080/hello'를 주소로 갖는다.
    // GetPost할 때 Get으로 서버가 켜진 상태에서 url에 위 주소를 입력 시 해당 메소드로 매핑을 해준다.
    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!");
        return "hello";
        // "hello"는 templates의 hello.html
        // Controller에서 리턴값을 문자로 반환하면 뷰 리졸버 (`viewResolver`)가 화면을 찾아서 처리한다.
        // spring boot 템플릿엔진 기본 viewName 매핑
        // `resources:templates/` + {ViewName} + `.html`
    }
}