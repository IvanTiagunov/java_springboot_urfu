package com.example.lesson4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PopularController {

    @GetMapping("/popular")
    public String popularPage(){
        return "/books/popular";
    }
}
