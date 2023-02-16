package com.example.springbootdemo1.service.impl;

import com.example.springbootdemo1.DTO.LoginDTO;
import com.example.springbootdemo1.Enum.ResultEnum;
import com.example.springbootdemo1.dataObject.User;
import com.example.springbootdemo1.exception.LoginException;
import com.example.springbootdemo1.repository.UserRepository;
import com.example.springbootdemo1.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @projectName: springBootdemo1
 * @package: com.example.springbootdemo1.service.impl
 * @className: LoginServiceImpl
 * @author: luyingjie01
 * @description: TODO
 * @date: 2023/2/15 11:10
 * @version: 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public LoginException login(LoginDTO loginDTO) {
        if (StringUtils.isEmpty(loginDTO.getLoginName())) {
            return new LoginException(ResultEnum.EMPTY_LOGIN_NAME);
        }
        if (StringUtils.isEmpty(loginDTO.getPassword())) {
            return new LoginException(ResultEnum.EMPTY_LOGIN_PASSWORD);
        }
        //通过登录名查询用户
        User user = userRepository.findByLoginName(loginDTO.getLoginName());
        //比较密码
        if (user!=null&&user.getPassword().equals(loginDTO.getPassword())){
            return new LoginException(ResultEnum.SUCCESS_LOGIN);
        }
        return new LoginException(ResultEnum.ERROR_LOGIN_MESSAGE);
    }
}
