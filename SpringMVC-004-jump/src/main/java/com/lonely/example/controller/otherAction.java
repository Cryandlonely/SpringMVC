package com.lonely.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class otherAction {
    @RequestMapping("/other")
    public String other(){
        System.out.println("other......");
        return "main";
    }
}
