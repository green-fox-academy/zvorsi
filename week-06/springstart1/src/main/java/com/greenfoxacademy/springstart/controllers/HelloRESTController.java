package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class HelloRESTController {

    private int counter = 1;
    private HashMap<String, Integer> prevName = new HashMap<String, Integer>();

    @RequestMapping(value = "/greeting")
    public Greeting hello(@RequestParam String name) {
        if (prevName.containsKey(name)) {
            prevName.put(name, prevName.get(name) + 1);
        } else {
            counter = 1;
            prevName.put(name, counter);
        }

        return new Greeting(prevName.get(name), "hello " + name);
    }

}

