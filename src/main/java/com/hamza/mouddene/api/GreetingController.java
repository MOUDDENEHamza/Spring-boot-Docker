package com.hamza.mouddene.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class GreetingController {

    @GetMapping("/greetingMessage")
    public String greetingMessage() {
        return "Hello world !";
    }

}
