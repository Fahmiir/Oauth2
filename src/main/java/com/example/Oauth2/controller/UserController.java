package com.example.Oauth2.controller;

import com.example.Oauth2.entity.User;
import com.example.Oauth2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {

    UserService userService;

    @GetMapping
    public List<User> getUSers() {

        return userService.findall();

    }

}
