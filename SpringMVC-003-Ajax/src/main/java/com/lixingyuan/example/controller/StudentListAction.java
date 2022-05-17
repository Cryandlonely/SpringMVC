package com.lixingyuan.example.controller;

import com.lixingyuan.example.pojo.Student;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
/*@Component
@RequestMapping("/ac")*/
public class StudentListAction {
    @ResponseBody
    @RequestMapping("/list")
    public List<Student> list(){
        List<Student> list = new ArrayList<Student>();
        Student stu = new Student("张三",789);
        Student stu1 = new Student("李四",456);
        Student stu2 = new Student("王五",123);
        list.add(stu);
        list.add(stu1);
        list.add(stu2);
        System.out.println(list);
        return list;
    }
}
