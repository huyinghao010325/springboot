package com.example.command_dispatcher_system.service;

import com.example.command_dispatcher_system.entity.User;
import com.example.command_dispatcher_system.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User saveUser(User user){
        log.info("新增一个用户！");
        this.userMapper.insertOneUser(user);
        User resultUser = this.userMapper.selectUserByPhone(user.getPhone());
        return resultUser;
    }


    public User login(String username, String password) {
        log.info("用户登入！");
        User user = this.userMapper.selectUserByNameAndPassword(username, password);
        if (user != null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }
}
