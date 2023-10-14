package com.hanstack.springmvc.controller;

import com.hanstack.springmvc.model.User;
import com.hanstack.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Objects;

@Controller
public class LoginController {

    @Autowired
    UserService userService;
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/submit")
    public String submit(String username, String password, Model model) {
        User user = userService.getUserByNameAndPassword(username, password);
        if (Objects.isNull(user)) {
            model.addAttribute("message", "Please enter correct username and password to login");
            return "login";
        }
        return "redirect:home";
    }
}
