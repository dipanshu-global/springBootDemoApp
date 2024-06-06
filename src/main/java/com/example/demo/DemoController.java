package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/demo")
public class DemoController {

    @GetMapping
    String getDemo(){
        System.out.println("Inside getDemo()");
        return "Hello world";
    }
}
