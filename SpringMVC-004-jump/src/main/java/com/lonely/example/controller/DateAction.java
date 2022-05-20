package com.lonely.example.controller;

import com.lonely.example.pojo.Student;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class DateAction {

    SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");

    //@DateTimeFormat 前提：必须springmvc.xml中必须含有<mvc:annotation-driven></mvc:annotation-driven>
    /*
        @RequestMapping("/date")
        public String date(@DateTimeFormat(pattern = "yyyy-MM-dd") Date mydate) {
            System.out.println(mydate);
            System.out.println(sf.format(mydate));
            return "show";
        }
    */

    //注册全局日期处理注解 可以没有<mvc:annotation-driven></mvc:annotation-driven>
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {
        webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(sf, true));
    }

    @RequestMapping("/date")
    public String date(Date mydate, HttpServletRequest request) {
        System.out.println(mydate);
        System.out.println(sf.format(mydate));
        request.setAttribute("mydate", sf.format(mydate));
        return "show";
    }

    @RequestMapping("/list")
    public String list(HttpServletRequest request) throws ParseException {
        Student s = new Student("张三", sf.parse("2000-02-03"));
        Student s1 = new Student("张三", sf.parse("2000-02-03"));
        Student s2 = new Student("张三", sf.parse("2000-02-03"));
        List<Student> list = new ArrayList<Student>();
        list.add(s);
        list.add(s2);
        list.add(s1);
        request.setAttribute("list",list);
        return "show";
    }
}
