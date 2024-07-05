package com.example.command_dispatcher_system.mapper;

import com.example.command_dispatcher_system.entity.Department;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

/**
 * 部门持久化操作mybatis映射接口
 *
 * @author songdi
 * @version 1.0
 * @Description command_dispatcher_system TODO
 * @className DepartmentMapper
 * @packageName com.example.command_dispatcher_system.mapper
 * @date 2024/7/4 10:40
 */



public interface DepartmentMapper {
    /**
     * 全表查询部门记录
     * @return
     */
    public List<Department> selectAll();
}
