package com.zzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/", "/home"})
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("word", "Hello World !!!");
        return "home";
    }
}