package com.lonely.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class action {
    @RequestMapping("/action")
    public String action(){
        return "js";    //在WEB-INF中文件，只能通过转发或者重定向进行访问
    }
}
