package net.landzero.corpus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    @GetMapping("/health_check")
    public String healthCheck() {
        return "health_check";
    }

}
