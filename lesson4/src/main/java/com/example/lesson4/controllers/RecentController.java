package com.example.lesson4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecentController {

    @GetMapping("/recent")
    public String recentPage(){
        return "/books/recent";
    }
}