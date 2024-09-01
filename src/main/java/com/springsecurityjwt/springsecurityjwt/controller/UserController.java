package com.springsecurityjwt.springsecurityjwt.controller;

import com.springsecurityjwt.springsecurityjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/all")
    public ResponseEntity<?> getAllUser (){
        return ResponseEntity.ok(userService.getAllUser());
    }
}
