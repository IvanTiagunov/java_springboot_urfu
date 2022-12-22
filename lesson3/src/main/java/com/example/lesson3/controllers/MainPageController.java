package com.example.lesson3.controllers;

import com.example.lesson3.data.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainPageController {

    private final BookService bookService;

    @Autowired
    public MainPageController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/index.html")
    public String mainPage(Model model){
        model.addAttribute("bookData", bookService.getBooksData());
        return "index";
    }

}
