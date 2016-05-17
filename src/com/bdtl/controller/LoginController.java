package com.bdtl.controller;

//import org.springframework.stereotype.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bdtl.bean.User;
import com.bdtl.service.UserService;

@Controller
public class LoginController extends BaseController
{

     @Autowired
     UserService userService;

    @RequestMapping(value = "/login.do")
    public ModelAndView login(User user)
    {
        //设置view对象
        mv.setViewName("login");
        
        User user2 = userService.findUserByUsername("1");
        
        //组装model对象
        modelMap.put("user", user);
        modelMap.put("msg", "user: " + user.getUsername());
        
        //加载modelMap
        mv.addAllObjects(modelMap);
        
        return mv;
    }

}
