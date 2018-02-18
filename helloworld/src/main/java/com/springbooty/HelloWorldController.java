package com.springbooty;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/")	
    String home() {
        return "<h1>Desi Weed!</h1>";
    }
    
    @RequestMapping("/header/parm={id}&parm1={name}")	
    String home1(@PathVariable String id,@PathVariable String name) {
        return "Desi Weed!" + id + name;
    }
}
