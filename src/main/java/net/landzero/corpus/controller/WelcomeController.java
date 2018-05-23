package net.landzero.corpus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {

    @GetMapping("/")
    public ModelAndView index(ModelMap model) {
        return new ModelAndView("redirect:/signin", model);
    }

    @GetMapping("/health_check")
    public ModelAndView healthCheck(ModelMap model) {
        return new ModelAndView("health_check", model);
    }

}
