package com.eszigeti.userTodoApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World";
    }
}
