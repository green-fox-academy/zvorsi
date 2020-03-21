package com.orsi.foxclub.controllers;

import com.orsi.foxclub.Service.FoxService;
import com.orsi.foxclub.models.Fox;
import com.orsi.foxclub.models.FoxDrink;
import com.orsi.foxclub.models.FoxFood;
import com.orsi.foxclub.models.FoxTrick;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class foxClubController {
    FoxService foxService;

    @Autowired
    public foxClubController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/index")
    public String index(@RequestParam(value = "name", required = false) String name, Model model) {
        model.addAttribute("fox", foxService.findByName(name));
        model.addAttribute("foxes", foxService.returnAll());
        return "index";
    }

    @GetMapping("/login")
    public String getLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String receiveName(@RequestParam("name") String name) {

        foxService.addFox(new Fox(name));
        return "redirect:/index?name=" + name;
    }

    @GetMapping("/nutrition-store")
    public String getNutritionStore(Model model){
        model.addAttribute("foxFoods", FoxFood.values());
        model.addAttribute("foxDrinks", FoxDrink.values());
        return "nutrition-store";
    }

    @PostMapping("/nutrition-store")
    public String nutritionStore(@RequestParam ("foxFoods") FoxFood foxFoods, @RequestParam ("foxDrinks") FoxDrink foxDrinks, Model model){
        System.out.println();

        return "nutrition-store";
    }

    @GetMapping("/trick-center")
    public String getTrickCenter(Model model){
        model.addAttribute("tricks", FoxTrick.values());
        return "trick-center";
    }

    @PostMapping("/trick-center")
    public String trickCenter(){
        return "trick-center";
    }
}
