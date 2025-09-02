package br.com.jujulioed.simple_login_system.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("test")
    public String TestGet() {
        return "Testing Get API";
    }

    @PostMapping("test")
    public String TestPost(@RequestBody String body) {
        return "Testing Post API with body message: " + body;
    }
}
