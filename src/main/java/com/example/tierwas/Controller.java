package com.example.tierwas;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    TestService testService;

    //------------------------실행 테스트-----------------------
    @GetMapping(value = "3tier/test")
    public String test() {
        return testService.test();
    }


    
    
}
