package com.example.lesson4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SigningController {

    @GetMapping("/signing")
    public String signingPage(){
        return "/signing";
    }
}
