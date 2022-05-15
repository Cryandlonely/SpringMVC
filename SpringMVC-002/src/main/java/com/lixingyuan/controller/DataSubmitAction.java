package com.lixingyuan.controller;

import com.lixingyuan.controller.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DataSubmitAction {
    @RequestMapping("/one")
    public String one(String name, int age) {
        System.out.println(name + "," + age);
        return "main";
    }

    @RequestMapping("/two")
    public String two(Users user) {
        System.out.println(user);
        return "main";
    }

    @RequestMapping("/three/{name}/{age}")
    public String three(@PathVariable("name") String name, @PathVariable("age") int age) {
        System.out.println(name+","+age);
        return "main";
    }
}
