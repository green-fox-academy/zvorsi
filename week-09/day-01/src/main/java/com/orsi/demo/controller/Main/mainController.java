package com.orsi.demo.controller.Main;

import com.orsi.demo.domain.Doubling;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mainController {

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/doubling")
    @ResponseBody
    public ResponseEntity<Doubling> doubling(@RequestParam (required = false) Integer input){
        if (input == null){
            return ResponseEntity.ok()
                    .body(new Doubling());
        }

        return ResponseEntity.ok()
                .body(new Doubling(input, input * 2));
    }

}
