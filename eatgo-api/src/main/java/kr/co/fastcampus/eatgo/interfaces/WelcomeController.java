package kr.co.fastcampus.eatgo.interfaces;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// 웹에서 접속 가능한 컨트롤러
@RestController
public class WelcomeController {

    @GetMapping("/")
    public String hello(){
        return "Hello world";
    }
}
