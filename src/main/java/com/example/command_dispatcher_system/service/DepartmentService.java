package com.example.command_dispatcher_system.service;

import com.example.command_dispatcher_system.entity.Department;
import com.example.command_dispatcher_system.mapper.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;


@Service //将当前service对象纳入spring boot 环境中去（spring容器）
public class DepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;

    public List<Department> queryAllDepts() {
        System.out.println("部门查询逻辑...........");
        return this.departmentMapper.selectAll();
    }
}
