package com.progra.parcialIV.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Auth")
public class AuthController {

    @GetMapping("/login")
    public String login() {
        return "login"; 
    }

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/Admin")
    public String admin() {
        return "admin";
    }
}