package com.example.springbootdemo1.Enum;

import lombok.Getter;

/**
 * @Description: 统一结果封装
 **/

@Getter
public enum ResultEnum {
    ERROR_LOGIN_MESSAGE(01, "请输入正确的账号或密码"),
    EMPTY_LOGIN_NAME(02, "登录账号不能为空"),
    EMPTY_LOGIN_PASSWORD(03, "登陆密码不能为空"),
    SUCCESS_LOGIN(04, "登录成功");
    private Integer code;
    private String message;

    ResultEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }
}
