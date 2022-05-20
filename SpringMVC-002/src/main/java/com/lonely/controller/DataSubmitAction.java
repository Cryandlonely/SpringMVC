package com.lonely.controller;

import com.lonely.controller.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    /*
        @PathVariable("name")用来解析路径的请求参数
     */
    public String three(@PathVariable("name") String name, @PathVariable("age") int age) {
        System.out.println(name+","+age);
        return "main";
    }
    /*
        @RequestParam("name") 用来解决名称不一致问题 ---> 将路径的name的value值赋给uname
     */
    @RequestMapping("/four")
    public String four(@RequestParam("name") String uname,@RequestParam("age") int uage){
        System.out.println(uname+","+uage);
        return "main";
    }
}
