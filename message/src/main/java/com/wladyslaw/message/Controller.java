package com.wladyslaw.message;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class Controller {

    private final AnotherMessageClient anotherMessageClient;

    @GetMapping("/another-message")
    public String getMessage() {
        return anotherMessageClient.getMessage();
    }
}
