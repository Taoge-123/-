package com.controller;

import com.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * @author Flash gems
 * @create 2020-06-10 0:17
 */

@Controller
public class UserController {

    //去登陆
    @RequestMapping("/tologin")
    public String tologin(){
        return "login";
    }

    @RequestMapping("/login")
    public String success(User user, HttpSession session, Model model){
        String username = user.getUsername();
        String password = user.getPassword();
        if (username.equals("1234")&&password.equals("5678")){
            session.setAttribute("user",user);
            model.addAttribute("user",user);
            return "success";
        }
        model.addAttribute("msg","登录失败");
        return "login";
    }
    @RequestMapping("/success")
    public String ll(){
        return "success";
    }

}
