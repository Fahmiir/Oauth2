package com.example.Oauth2.service.impl;

import com.example.Oauth2.entity.User;
import com.example.Oauth2.repository.UserRepository;
import com.example.Oauth2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Override
    public List<User> findall() {
        return userRepository.findAll();
    }
}
