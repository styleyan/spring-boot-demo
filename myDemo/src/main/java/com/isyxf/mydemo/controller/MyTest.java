package com.isyxf.mydemo.controller;

import com.isyxf.mydemo.service.Hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTest {
    @Autowired
    private Hero hero;

    @GetMapping("/api/first")
    public String first() {
        hero.say();
        return "233";
    }
}
