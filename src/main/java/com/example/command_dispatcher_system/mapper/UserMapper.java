package com.example.command_dispatcher_system.mapper;


import com.example.command_dispatcher_system.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    User selectUserByPhone(String phone);

    int insertOneUser(User user);


    @Select("<script>" +
            "select uid,user_name,did,phone,state from user_info " +
            "<where>" +
            "<if test = 'username != null and username != \"\"'> " +
            "and username like '%${username}%' " +
            "</if>" +
            "<if test = 'phone != null and phone != \"\"'> " +
            "or phone like '%${phone}%' " +
            "</if>" +
            "and did = #{did}" +
            "</where>" +
            "</script>")


    List<User> selectDepartmentUserList(Long did, String userName, String phone);

//    String getGroupNameById(Long creator);

    User selectUserByNameAndPassword(String username, String password);
}
