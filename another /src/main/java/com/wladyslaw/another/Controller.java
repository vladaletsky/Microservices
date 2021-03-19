package com.wladyslaw.another;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/")
public class Controller {
    @GetMapping("/another-message")
    String getMessage(){
        return "Hello World!!!";
    };
}
