package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Login {
    @RequestMapping("/login")
    @ResponseBody
    public String login(){
        return "111";
    }
}
