package com.example.lesson3.controllers;

import com.example.lesson3.data.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorPageController {
//    @GetMapping("/authors/index.html")
//    public String authorPage(Model model) {
//        return "authors/index";
//    }

    private final AuthorService authorService;

    @Autowired
    public AuthorPageController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors/index.html")
    public String authorPage(Model model){
        model.addAttribute("authorData", authorService.getAuthorsData());
        return "authors/index";
    }
}
