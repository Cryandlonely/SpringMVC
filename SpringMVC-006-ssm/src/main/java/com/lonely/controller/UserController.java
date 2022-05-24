package com.lonely.controller;

import com.lonely.pojo.User;
import com.lonely.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin //在服务器端支持跨域访问
@RestController //如果本类中全部都是Ajax请求可以使用此注解，方法上的@ResponseBody
@RequestMapping("/user")
public class UserController {
    ///user/selectUserPage?userName=z&userSex=男&page=null
    public static final int PAG_SIZE = 5;
    @Autowired
    UserService userService;

    @RequestMapping("/selectUserPage")
    public List<User> selectUserPage(String userName, String userSex, Integer page) {
        int startRow = 0;
        if (page != null) {
            startRow = (page - 1) * PAG_SIZE;
        }
        return userService.selectUserPage(userName, userSex, startRow);
    }

    ///user/getRowCount?userName=z&userSex=男
    @RequestMapping("/getRowCount")
    public int getRowCount(String userName, String userSex) {
        return userService.getRowCount(userName, userSex);
    }

    ///user/ deleteUserById?userId= 15968162087363060
    @RequestMapping("/deleteUserById")
    public int deleteUserById(String userId) {
        return userService.deleteUserById(userId);
    }

    ///user/createUser(参数见下面)
    @RequestMapping("/createUser")
    public int createUser(User user) {
        String userId = System.currentTimeMillis() + "";
        user.setUserId(userId);
        return userService.createUser(user);
    }
}
