package com.hanstack.springmvc.controller;

import com.hanstack.springmvc.service.Impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    UserService iUserService;


    @GetMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/login")
    public String login(String username, String password, Model model) {
        if (username.equals("phuc") && password.equals("123")) {
            return "homeScreen";
        }
        return "errorScreen";
    }

    @GetMapping("/user")
    public String user(Model model) {
        model.addAttribute("users", iUserService.getAllUser());
        return "user";
    }
}
