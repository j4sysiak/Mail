package com.example.springbootmailer;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {


    @GetMapping("/hello")
    public String get(@RequestParam String name) {
        if (name.length() <= 1) {
            throw new IllegalArgumentException();
        }
        return "Hello " + name;
    }

}
