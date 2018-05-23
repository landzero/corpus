package net.landzero.corpus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SigninController {

    @GetMapping("/signin")
    public ModelAndView signin(ModelMap model) {
        return new ModelAndView("signin", model);
    }

    @PostMapping("/signin")
    public ModelAndView signinPost(ModelMap model) {
        return new ModelAndView("redirect:/", model);
    }

}
