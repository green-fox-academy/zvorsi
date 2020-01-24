package com.orsi.webshop.basicwebshop.controllers;

import com.orsi.webshop.basicwebshop.models.shopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Controller
public class BasicWebShopController {

    private List<shopItem> shopItems =new ArrayList<>();

    public BasicWebShopController(){
        shopItems.add(new shopItem("running shoes", "Nike sho for everyday sport", 1000, "Kč",5));
        shopItems.add(new shopItem("printer", "HP printer for printing pages", 3000,"Kč", 2));
        shopItems.add(new shopItem("coca cola", "0.5 l", 25,"Kč", 0));
        shopItems.add(new shopItem("T-shirt", "Green with a fox on a bike", 300,"Kč", 1));
    }



    @GetMapping("/webshop")
    public String webshop(Model model){
        model.addAttribute("shopItems", shopItems );
        return "webshop";
    }

    @GetMapping("/onlyavailable")
    public String available(Model model){

        List<shopItem> availableItems = shopItems.stream().filter(item -> item.getQuantityOfStock() > 0)
                .collect(Collectors.toList());

        model.addAttribute("shopItems", shopItems );
        
        return "onlyavailable";
    }
}
