package com.showshy.controllers;

import com.showshy.models.User;
import com.showshy.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by Administrator on 2017-03-28.
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/getAllUser", method = RequestMethod.GET)
    public String getUserList(Model model){
        List<User> list = userService.getUserList();
        model.addAttribute("list",list);
        return "showUsers";
    }
}
