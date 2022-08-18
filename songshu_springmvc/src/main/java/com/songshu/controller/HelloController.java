package com.songshu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/SpringMvcTest")
public class HelloController {

    @RequestMapping(path = "/hello.do")
    public String sayHello(Model model){
        System.out.println("入门方法执行222");
        model.addAttribute("msg","hello,Springmvc");
        return "springmvc";
    }
}
