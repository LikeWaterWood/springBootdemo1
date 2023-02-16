package com.example.springbootdemo1.DTO;

import lombok.Data;

/**
 * @Description: 登录业务实体类
 **/
@Data
public class LoginDTO {
    private String loginName;
    private String password;
}
