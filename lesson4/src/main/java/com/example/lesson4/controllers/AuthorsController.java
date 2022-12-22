package com.example.lesson4.controllers;

import com.example.lesson4.data.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthorsController {

    private final AuthorService authorService;

    @Autowired
    public AuthorsController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public String authorsPage(Model model){
        model.addAttribute("authorData", authorService.getAuthorData());
        return "authors/index";
    }
}
