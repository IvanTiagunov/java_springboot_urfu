package com.example.lesson3.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GenresPageController {
    @GetMapping("/genres/index.html")
    public String genresPage(Model model) {
        return "genres/index";
    }

}
