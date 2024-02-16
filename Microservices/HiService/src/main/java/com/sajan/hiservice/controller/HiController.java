package com.sajan.hiservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HiController {

    @GetMapping("/hi/{name}")
    public String sayHi(@PathVariable String name){

        RestTemplate restTemplate = new RestTemplate();
        String forObject = restTemplate.getForObject("http://192.168.0.13:1111/hello/" + name, String.class);
        return "Welcome: " + forObject;
    }

}
