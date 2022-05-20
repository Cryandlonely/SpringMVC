package com.lonely.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class WebInfAction {
    @RequestMapping("/showLogin1")
    public String showLogin() {
        return "login";
    }
    @RequestMapping("/showMain")
    public String showMain(){
        return "/main";
    }

    // 不使用拦截器
    /*
        @RequestMapping("/showLogin2")
        public String login(String name, String password, HttpServletRequest request) {
            if (name.equals("李兴源") && password.equals("123456")) {
                return "main";
            } else {
                request.setAttribute("msg", "账号密码错误！！！！");
                return "login";
            }
        }
    */

    //使用拦截器
    @RequestMapping("/showLogin2")
    public String login(String name, String password, HttpServletRequest request) {
        if (name.equals("李兴源") && password.equals("123456")) {
            request.getSession().setAttribute("user",name);
            return "main";
        } else {
            request.setAttribute("msg", "账号密码错误！！！！");
            return "login";
        }
    }
}
