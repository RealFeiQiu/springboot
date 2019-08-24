package com.niqi.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 */
@Controller
public class Helloworld {
    @GetMapping("/hello")
    public String helloworld(@RequestParam(name = "name",required = false,defaultValue = "world")String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }
}
