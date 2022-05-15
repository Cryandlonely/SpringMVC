package com.cj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
/*
    交给spring去创建对象
    @Component注解只是将类加载到spring容器中
    @Controller可以处理url地址映射请求
 */
@RequestMapping("/zar")
public class DemoAction {
    /*
        之前的servlet规范
        protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{}
        action中所有的功能实现都是由方法来完成的
        action方法的规范
        1.访问权限是public
        2.方法的返回值是任意的
        3.方法名称任意
        4.方法可以没有参数，如果有，则可以是任意类型
        5.要使用@RequestMapping注解来声明一个访问路径（名称）
     */
    @RequestMapping("/demo")
    public String demo() {
        System.out.println("zar服务器被访问......");
        return "main"; //直接跳到admin/main.jsp页面
    }
}
