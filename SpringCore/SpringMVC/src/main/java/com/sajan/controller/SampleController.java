package com.sajan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SampleController {
    @RequestMapping(path="/save", method = RequestMethod.POST)
    public ModelAndView hello(){
        String hello = "Hello from Java World.";
        return new ModelAndView("Hello", "message", hello);
    }


}
