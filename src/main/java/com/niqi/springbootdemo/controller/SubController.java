package com.niqi.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 *用户控制层
 */
@Controller
public class SubController {
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}
