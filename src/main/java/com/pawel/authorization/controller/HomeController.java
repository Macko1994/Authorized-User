package com.pawel.authorization.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class HomeController {

    @GetMapping("/")
    public String user(Principal principal, Model model) {
        String name = principal.getName();
        model.addAttribute("name", name);

        return "user";
    }

}
