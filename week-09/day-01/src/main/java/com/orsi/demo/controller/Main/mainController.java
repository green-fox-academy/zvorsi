package com.orsi.demo.controller.Main;

import com.orsi.demo.domain.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
            return ResponseEntity.badRequest()
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
        } nem kell a null, mert ugysem talalja meg, ha nem adom meg*/

        return ResponseEntity.ok()
                .body(new appenda(appendable));
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity<dountil> dountil(@PathVariable String action, @RequestBody (required = false) dountil until){
        if (until.getUntil() == null) {
            return ResponseEntity.badRequest()
                    .body(new dountil());
        }
        return ResponseEntity.ok()
                .body(new dountil(until.getUntil(), action));
    }


    @PostMapping("/arrays")
    @ResponseBody
    public ResponseEntity<arrayHandler> arrays(@RequestBody arrayHandler handler){
        if (handler.getWhat() == null && handler.getNumbers() == null){
            return ResponseEntity.badRequest()
                    .body(new arrayHandler(handler.getWhat(), handler.getNumbers()));
        }else if (handler.getWhat().equals("double")){
            return ResponseEntity.ok()
                    .body(new arrayHandler(handler.getWhat(), handler.getNumbers()));
        }
        return ResponseEntity.ok()
                .body(new arrayHandler(handler.getWhat(), handler.getNumbers()));
    }
}
