package com.mytests.springboot.mvc.defaults.defaultmustachetest0;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 10/23/2017.
 * Project: default-mustache-test0
 * *******************************
 */
@Controller
public class MyController {

    @GetMapping("/")
    public String home(ModelMap model) {
        model.addAttribute("my_title", "mustache test");
        model.addAttribute("my_text", "this is spring boot mvc project with default web configuration and mustache views");
        return "home";
    }


}
