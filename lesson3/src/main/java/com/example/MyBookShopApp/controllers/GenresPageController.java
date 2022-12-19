package com.example.MyBookShopApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GenresPageController {
    // TODO задание 1
    @GetMapping("/genres/index.html")
    public String genresPage(Model model) {
        return "genres/index";
    }

}
