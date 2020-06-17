package com.interception;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Flash gems
 * @create 2020-06-10 1:13
 */
public class LoginInterception implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("拦截器执行了...");
        Object user = request.getSession().getAttribute("user");
        if(user==null){
            return false;
        }
        return true;
    }
}
