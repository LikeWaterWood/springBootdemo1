package com.example.springbootdemo1.controller;

import com.example.springbootdemo1.DTO.LoginDTO;
import com.example.springbootdemo1.exception.LoginException;
import com.example.springbootdemo1.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @projectName: springBootdemo1
 * @package: com.example.springbootdemo1.controller
 * @className: LoginController
 * @author: luyingjie01
 * @description: 进行登录业务相应
 * @date: 2023/2/15 11:01
 * @version: 1.0
 */
@RestController
public class LoginController {
    @Autowired
    LoginService loginService;
    //@PostMapping(value = "/api/login")
    @PostMapping(value = "/api/login")
    @CrossOrigin//后端跨域
    public LoginException login(@RequestBody LoginDTO loginDTO){
        return loginService.login(loginDTO);
    }
}
