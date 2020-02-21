package com.orsi.w9d5.controller;

import com.orsi.w9d5.domain.Error;
import com.orsi.w9d5.domain.Groot;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GuardianController {

    @GetMapping("/groot")
    @ResponseBody
    public ResponseEntity groot(@RequestParam (required = false) String message){
        if (message == null || message.equals("")){
            return ResponseEntity.badRequest()
                    .body(new Error());
        }
        return ResponseEntity.ok()
                .body(new Groot(message));
    }
}
