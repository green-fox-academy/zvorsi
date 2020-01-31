package com.orsi.week7day4.controller;

import com.orsi.week7day4.models.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilitiesController {
    UtilityService utilityService;

    @Autowired
    public UsefulUtilitiesController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String ShowUsefulUtilities(Model model) {
        model.addAttribute("useful utility", utilityService);
        return "useful";
    }

    @GetMapping("/useful/colored")
    public String colored(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }


    @GetMapping("/caesarencode")
        public String caesar(@RequestParam String text, @RequestParam int number, Model model){
        model.addAttribute("encode", utilityService.caesar(text, number));
        return "caesarencode";
    }
}
