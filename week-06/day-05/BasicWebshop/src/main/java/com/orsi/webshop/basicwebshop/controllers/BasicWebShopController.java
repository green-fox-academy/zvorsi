package com.orsi.webshop.basicwebshop.controllers;

import com.orsi.webshop.basicwebshop.models.shopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;
import java.util.stream.Collectors;

@Controller
public class BasicWebShopController {

    private List<shopItem> shopItems = new ArrayList<>();

    public BasicWebShopController() {
        shopItems.add(new shopItem("running shoes", "Nike shoe for everyday sport", 1000, "Kč", 5));
        shopItems.add(new shopItem("printer", "HP printer for printing pages", 3000, "Kč", 2));
        shopItems.add(new shopItem("necklace", "14 karat gold plated", 3000, "Kč", 0));
        shopItems.add(new shopItem("coca cola", "0.5 l", 25, "Kč", 0));
        shopItems.add(new shopItem("T-shirt", "Green with a fox on a bike", 300, "Kč", 1));
        shopItems.add(new shopItem("Nike shirt", "tennis shirt", 2500, "Kč", 3));
    }

    @GetMapping("/webshop")
    public String webshop(Model model) {
        model.addAttribute("shopItems", shopItems);
        return "webshop";
    }

    @GetMapping("/onlyavailable")
    public String available(Model model) {

        List<shopItem> availableItems = shopItems.stream().filter(item -> item.getQuantityOfStock() > 0)
                .collect(Collectors.toList());

        model.addAttribute("shopItems", availableItems);

        return "onlyavailable";
    }

    @GetMapping("/priceOrder")
    public String priceOrder(Model model) {

        List<shopItem> priceOrder = shopItems.stream().sorted((Comparator.comparing(shopItem::getPrice)))
                .collect(Collectors.toList());

        model.addAttribute("shopItems", priceOrder);

        return "priceOrder";
    }

    @GetMapping("/contains")
    public String contains(Model model) {

        List<shopItem> contains = shopItems.stream()
                .filter(value -> value.getDescription().toUpperCase().contains("NIKE") || value.getName().toUpperCase().contains("NIKE"))
                .collect(Collectors.toList());

        model.addAttribute("shopItems", contains);

        return "contains";
    }

    @GetMapping("/averagestock")
    public String stock(Model model) {

        double stock = shopItems.stream()
                .mapToInt(shopItem::getQuantityOfStock)
                //.mapToInt(shopItem::getQuantityOfStock)
                .average()
                .orElse(Double.NaN);

        model.addAttribute("stock", stock);

        return "averagestock";
    }

    @GetMapping("/highestprice")
    public String highestPrice(Model model) {

        List<shopItem> availableItems = shopItems.stream().filter(item -> item.getQuantityOfStock() > 0)
                .collect(Collectors.toList());

        Optional<shopItem> mostExpensiveItemOptional = availableItems.stream()
                .max(shopItem::compareTo);

        if(mostExpensiveItemOptional.isPresent()){
            model.addAttribute("mostExpensiveItem", mostExpensiveItemOptional.get());
            return "highestprice";
        }

        return "redirect:/webshop";
    }
}
