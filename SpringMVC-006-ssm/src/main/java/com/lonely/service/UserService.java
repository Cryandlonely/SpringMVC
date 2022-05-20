package com.lonely.service;

import com.lonely.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    List<User> selectUserPage(@Param("userName") String userName, @Param("userSex") String userSex, @Param("startRows") Integer startRows);

    int createUser(User user);

    int deleteUserById(String userId);

    int getRowCount(@Param("userName") String userName, @Param("userSex") String userSex);
}
