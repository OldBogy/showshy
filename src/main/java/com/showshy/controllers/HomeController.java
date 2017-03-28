package com.showshy.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017-03-28.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/" ,method = RequestMethod.GET)
    public String home(){
        return "home";
    }
}
