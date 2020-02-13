package com.jistol.boilerplate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DispatchController {
    @RequestMapping({"", "/", "/{path}"})
    public ModelAndView routePage(@PathVariable(name = "path", required = false) String path) {
        return new ModelAndView(path != null? path : "index");
    }

    @GetMapping("/")
    public String hello(Model model){
        model.addAttribute("hello", "안녕하세요.");
        return "index";
    }
}
