package com.example.command_dispatcher_system.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/*
* 部门（持久化实体）
*
*
*
* */

//通过lombom简化实体类
@Getter
@Setter
@ToString
public class Department {

    private Long id;
    private String departmentName;
    private String description; //部门描述

}
