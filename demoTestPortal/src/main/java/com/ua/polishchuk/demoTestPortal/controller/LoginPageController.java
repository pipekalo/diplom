package com.ua.polishchuk.demoTestPortal.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginPageController {

    @GetMapping
    public String mainPage(Model model){
        model.addAttribute("param","template");
        return "page";
    }

    @GetMapping("/hello")
    public String loginPage(@RequestParam(name = "param", required = false, defaultValue = "Kek") String param, Model model) {
        model.addAttribute("param",param);
        return "login";
    }

}
