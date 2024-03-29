package com.sajan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping(path="/hello", method = RequestMethod.GET)
    public ModelAndView hello(){
        return new ModelAndView("Hello", "message", "Hello, How are you?");
    }
}
