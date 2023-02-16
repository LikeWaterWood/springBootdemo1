package com.example.springbootdemo1.dataObject;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
/**
 * @Description: 用户实体类
 **/

@Entity
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String loginName;
    private String password;
    private String userName;
    private String sex;
    private String email;
    private String address;
}
