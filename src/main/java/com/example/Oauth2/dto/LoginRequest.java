package com.example.Oauth2.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
public class LoginRequest {

    private String username;
    private String password;

}
