package com.orsi.demo.controller.Main;

import com.orsi.demo.domain.appenda;
import com.orsi.demo.domain.doubling;
import com.orsi.demo.domain.greeter;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ResponseEntity<doubling> doubling(@RequestParam (required = false) Integer input){
        if (input == null){
            return ResponseEntity.ok()
                    .body(new doubling());
        }
        return ResponseEntity.ok()
                .body(new doubling(input, input * 2));
    }

    @GetMapping("/greeter")
    @ResponseBody
    public ResponseEntity<greeter> greeter(@RequestParam (required = false) String name, String title){
        if (name == null && title == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new greeter());
        }else if (title == null){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new greeter("Please provide a title!"));
        }
        return ResponseEntity.ok()
                .body(new greeter(name, title));
    }

    @GetMapping("/appenda/{appendable}")
    @ResponseBody
    public ResponseEntity<appenda> appenda(@PathVariable String appendable){
        /*if (appendable == null){
            return  ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new appenda());
        }*/
        return ResponseEntity.ok()
                .body(new appenda(appendable));
    }
}
