package com.lixingyuan.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JumpAction {
    @RequestMapping("/one")
    public String one(){
        System.out.println("success--1");
        return "main"; //默认是请求转发，使用视图解析器拼接前缀后缀进行页面跳转
    }
    @RequestMapping("/two")
    public String two(){
        System.out.println("success--2");
        return "forward:/other.action";  //forward: --->可以屏蔽前缀和后缀的拼接
    }
    @RequestMapping("/three")
    public String three(){
        System.out.println("success--3");
        return "redirect:/admin/main.jsp";  //redirect: --->可以屏蔽前缀和后缀的拼接
    }
    @RequestMapping("/four")
    public String four(){
        System.out.println("success--4");
        return "redirect:/other.action";  //redirect: --->可以屏蔽前缀和后缀的拼接
    }
    @RequestMapping("/five")
    public String five(){
        System.out.println("success--5");
        return "forward:/user/login.jsp";
    }
}
