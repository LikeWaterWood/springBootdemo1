package com.example.springbootdemo1.exception;

import com.example.springbootdemo1.Enum.ResultEnum;
import lombok.Getter;

/**
 * @projectName: springBootdemo1
 * @package: com.example.springbootdemo1.exception
 * @className: LoginException
 * @author: luyingjie01
 * @description: 登录报错信息调用
 * @date: 2023/2/15 15:01
 * @version: 1.0
 */
@Getter
public class LoginException extends RuntimeException {
    private Integer code;

    public LoginException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }
    public LoginException(Integer code,String message) {
        super(message);
        this.code = code;
    }
}
