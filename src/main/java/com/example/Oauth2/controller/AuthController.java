package com.example.Oauth2.controller;

import com.example.Oauth2.dto.LoginRequest;
import com.example.Oauth2.dto.LoginResponse;
import com.example.Oauth2.dto.RegisterRequest;
import com.example.Oauth2.dto.RegisterResponse;
import com.example.Oauth2.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public LoginResponse login(@RequestBody LoginRequest request){
        return authService.login(request);
    }

    @PostMapping("/register")
    public RegisterResponse register(@RequestBody RegisterRequest request){
        return authService.register(request);
    }

}
