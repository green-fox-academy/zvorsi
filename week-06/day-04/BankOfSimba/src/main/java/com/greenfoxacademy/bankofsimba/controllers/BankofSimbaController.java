package com.greenfoxacademy.bankofsimba.controllers;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BankofSimbaController {

    List<BankAccount> bankAccounts = new ArrayList<>();

    public BankofSimbaController(){
        bankAccounts.add(new BankAccount("Simba", 2000, "zebra", "lion"));
        bankAccounts.add(new BankAccount("Nala", 2005, "Grant", "lioness"));
        bankAccounts.add(new BankAccount("Pumba", 20, "bug", "ngiri"));
        bankAccounts.add(new BankAccount("Mufasa", 5000, "gnu", "lionking"));
    }

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("bankAccounts",bankAccounts);

        return "show";
    }

    @GetMapping("/page")
    public String page(Model model){
        model.addAttribute("text", "This is an <em>HTML</em> text. <b>Enjoy yourself!</b>");
        return "page";
    }
}
