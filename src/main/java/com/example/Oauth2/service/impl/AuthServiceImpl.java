package com.example.Oauth2.service.impl;

import com.example.Oauth2.dto.LoginRequest;
import com.example.Oauth2.dto.LoginResponse;
import com.example.Oauth2.dto.RegisterRequest;
import com.example.Oauth2.dto.RegisterResponse;
import com.example.Oauth2.entity.User;
import com.example.Oauth2.repository.UserRepository;
import com.example.Oauth2.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final UserRepository userRepository;

    private final AuthenticationManager authenticationManager;

    private final PasswordEncoder passwordEncoder;


    @Override
    public LoginResponse login(LoginRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getUsername(),
                        request.getPassword()
                )
        );
        return new LoginResponse();
    }

    @Override
    public RegisterResponse register(RegisterRequest request) {

        if(userRepository.findByUsername(request.getUsername()).isPresent()){
            throw new RuntimeException("Username already exists");
        }

        User user = new User();

        user.setUsername(request.getUsername());

        user.setPassword(passwordEncoder.encode(request.getPassword()));

        user.setRole("ROLE_USER");

        user.setEnabled(true);

        userRepository.save(user);

        return new RegisterResponse("Register Success");
    }
}
