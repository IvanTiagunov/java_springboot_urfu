package com.example.lesson4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DocumentController {

    @GetMapping("/documents")
    public String documentsPage(){
        return "/documents/index";
    }
}
