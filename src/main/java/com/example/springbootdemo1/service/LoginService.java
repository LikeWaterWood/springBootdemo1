package com.example.springbootdemo1.service;

import com.example.springbootdemo1.DTO.LoginDTO;
import com.example.springbootdemo1.exception.LoginException;

public interface LoginService {
    public LoginException login(LoginDTO loginDTO);
}
