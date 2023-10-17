package com.hanstack.springmvc.controller;

import com.hanstack.springmvc.service.BookService;
import com.hanstack.springmvc.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    CategoryService categoryService;

    @GetMapping(value = {"/", "/list"})
    public String homepage(Model model) {
        model.addAttribute("lstBook", bookService.getListBook());
        return "book";
    }

    @GetMapping("/insert")
    public String insert(Model model) {
        model.addAttribute("categoryList", categoryService.findAll());
        return "newBook";
    }

    @PostMapping("/insert")
    public String insertPost(int categoryId, String title, float price, Model model) {
        bookService.save(categoryId, title, price);
        model.addAttribute("lstBook", bookService.getListBook());
        return "book";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id, Model model) {
        bookService.delete(id);
        model.addAttribute("lstBook", bookService.getListBook());
        return "book";
    }


}
