package com.vikas.learningSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {

    Person p = new Person("Vikas", 1000, "siboo");
    @GetMapping(value = "/user")
    public Person getUser(){
        return p;
    }
}
