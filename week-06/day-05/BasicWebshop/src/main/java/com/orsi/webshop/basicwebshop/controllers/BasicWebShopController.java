package com.orsi.webshop.basicwebshop.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BasicWebShopController {

    @GetMapping("/webshop")
    public String webshop(Model model){
        model.addAttribute("");
        return "webshop";
    }
}
