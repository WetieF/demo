package com.example.demo.controller;

import com.example.demo.user.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/users")
public class demoControlller {
    @GetMapping()
    public ResponseEntity<User> sayHello() {
        return ResponseEntity.accepted()
                .body(new User("Watie", "Mensih"));
    }
}



