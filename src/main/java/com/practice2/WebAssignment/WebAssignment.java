package com.practice2.WebAssignment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebAssignment {
    @Value("${api.key}")
    private String apiKey;
    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("apiKey", apiKey);
        return "home";
    }
}
