package com.orsi.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TodoController {

    @GetMapping("/todo")
    public String todo(){
        return "todo";
    }

    @GetMapping({"/list", "/"})
    @ResponseBody
    public String list(){
        return "this is my first Todo";
    }


}
