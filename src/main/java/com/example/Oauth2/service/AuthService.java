package com.example.Oauth2.service;

import com.example.Oauth2.dto.LoginRequest;
import com.example.Oauth2.dto.LoginResponse;
import com.example.Oauth2.dto.RegisterRequest;
import com.example.Oauth2.dto.RegisterResponse;

public interface AuthService {

    public LoginResponse login(LoginRequest request);

    public RegisterResponse register(RegisterRequest request);

}
