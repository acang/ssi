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
        //����view����
        mv.setViewName("login");
        
        User user2 = userService.findUserByUsername("1");
        
        //��װmodel����
        modelMap.put("user", user);
        modelMap.put("msg", "user: " + user.getUsername());
        
        //����modelMap
        mv.addAllObjects(modelMap);
        
        return mv;
    }

}
