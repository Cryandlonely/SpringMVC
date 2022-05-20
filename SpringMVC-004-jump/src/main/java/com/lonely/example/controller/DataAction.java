package com.lonely.example.controller;

import com.lonely.example.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class DataAction {
    @RequestMapping("/data")
    public String data(HttpServletRequest request,
                       HttpServletResponse response,
                       HttpSession session,
                       Model model,
                       Map map,
                       ModelMap modelMap) {
        Users users = new Users("张三", 789);
        /*
            可携带数据的5大作用域
         */
        request.setAttribute("requestUser", users);
        session.setAttribute("sessionUser", users);
        model.addAttribute("modelUser", users);
        map.put("mapUser", users);
        modelMap.addAttribute("modelMapUser", users);
        System.out.println("data.............");
        //return "main";
        /*
            重定向数据传递： 只有session作用域才能携带
         */
        return "redirect:/admin/main.jsp";
    }
}
