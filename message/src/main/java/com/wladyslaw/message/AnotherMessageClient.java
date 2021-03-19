package com.wladyslaw.message;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "another-message-service", path = "/another-message")
public interface AnotherMessageClient {
    @GetMapping
    String getMessage();
}

