package com.hjh001.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {

    @RequestMapping(value = "/hi")
    public String helloController(){
        System.out.println("cccccccccc");
        return "login";

    }


}
