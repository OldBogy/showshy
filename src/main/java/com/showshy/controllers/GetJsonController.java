package com.showshy.controllers;
import com.showshy.spat.SpatMain;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017-04-07.
 */
@Controller
public class GetJsonController {
    @ResponseBody
    @RequestMapping(value = "/getJson", method = RequestMethod.GET)
    public String getJson(){
        String s;
        s = new SpatMain().loadFormUrl();
        return s;
    }
}
