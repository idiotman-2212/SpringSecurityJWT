package com.springsecurityjwt.springsecurityjwt.controller;

import com.springsecurityjwt.springsecurityjwt.jwt.JwtAuthenticationFilter;
import com.springsecurityjwt.springsecurityjwt.payload.request.AuthRequest;
import com.springsecurityjwt.springsecurityjwt.payload.response.AuthResponse;
import com.springsecurityjwt.springsecurityjwt.service.AuthenticationService;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.naming.AuthenticationException;

@RestController
@RequestMapping("/api")
public class AuthenticationContronller {

    @Autowired
    private AuthenticationService authenticationService;

    @PostMapping("/auth/login")
    public ResponseEntity<?> login (@RequestBody AuthRequest authRequest){
        String token = authenticationService.login(authRequest);
        AuthResponse authResponse = new AuthResponse();
        authResponse.setToken(token);
        return ResponseEntity.ok(authResponse);

    }
}
