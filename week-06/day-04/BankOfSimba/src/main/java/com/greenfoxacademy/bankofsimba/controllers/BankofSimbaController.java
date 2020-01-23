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
        bankAccounts.add(new BankAccount("Simba", 2000, "lion"));
    }

    @GetMapping("/show")
    public String show(Model model){
        model.addAttribute("bankAccounts",bankAccounts);

        return "show";
    }

   /* public BankAccount newAccount (String name, int balance, String animalType){
        return newAccount(name, balance, animalType);
    }*/
}
