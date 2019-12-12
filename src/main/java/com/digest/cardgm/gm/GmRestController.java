package com.digest.cardgm.gm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GmRestController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
}
