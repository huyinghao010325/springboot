package com.example.command_dispatcher_system.controller;


import com.example.command_dispatcher_system.entity.Department;
import com.example.command_dispatcher_system.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;


    @GetMapping("/department/queryAll")
    public List<Department> queryAllDepartment(){
        //        Department department = new Department();
//        department.setId(1L);
//        department.setDepartmentName("企业部门");
//        department.setDesc("asjhdajshdbajs");
//        departments.add(department);

        return this.departmentService.queryAllDepts();
    }
}
