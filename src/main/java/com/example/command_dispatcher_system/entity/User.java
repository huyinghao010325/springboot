package com.example.command_dispatcher_system.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class User {
    private int uid;
    private String username;
    private int did;
    private String phone;
    private String password;
    private String salt;
    private String state;


}
