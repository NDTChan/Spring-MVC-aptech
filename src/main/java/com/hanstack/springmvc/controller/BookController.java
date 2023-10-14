package com.hanstack.springmvc.controller;

import com.hanstack.springmvc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping(value = {"/", "/list"})
    public String homepage(Model model) {
        model.addAttribute("lstBook", bookService.getListBook());
        return "book";
    }
}
