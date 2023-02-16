package com.example.springbootdemo1.repository;

import com.example.springbootdemo1.dataObject.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author: luyingjie01
 * @description: 用户业务实际处理
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    User findById(int id);
    User findByLoginName(String loginName);
}
