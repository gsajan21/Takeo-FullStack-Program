package com.sajan.helloservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello/{name}")
    public String sayHello(@PathVariable String name){
        return "hello: " + name;
    }

    @Value("${my.app.title}")
    private String title;
    @GetMapping("/data")
    public ResponseEntity<String> showMsg(){
        return new ResponseEntity<String>("Value of title from config server: " + title, HttpStatus.OK);
    }

}
