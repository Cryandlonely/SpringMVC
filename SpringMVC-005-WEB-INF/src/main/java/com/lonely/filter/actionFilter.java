package com.lonely.filter;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class actionFilter implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getSession().getAttribute("user")==null){
            request.setAttribute("msg","登录！！！");
            request.getRequestDispatcher("/WEB-INF/admin/login.jsp").forward(request,response);
            return false; //不放行
        }
        return true; //放行请求
    }
}
