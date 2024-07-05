package com.example.command_dispatcher_system.controller;


import com.example.command_dispatcher_system.entity.User;
import com.example.command_dispatcher_system.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("regUser")
    public User regUser(@RequestBody User user){
        System.out.println("1");
        return this.userService.saveUser(user);

    }

    @PostMapping("login")
    public User login(String username, String password) throws Exception {
        log.info("用户名为："+username+"密码为："+password);
        User resultUser = this.userService.login(username, password);
        if (resultUser == null){
            log.info("登入失败！");
            throw new Exception("用户名或密码错误");
        }else {
            return resultUser;
        }

    }

    @PostMapping("reg")
    public String ref(@RequestBody User user){
        return "sb";
    }
}
