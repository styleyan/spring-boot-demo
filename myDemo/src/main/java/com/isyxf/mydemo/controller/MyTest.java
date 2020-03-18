package com.isyxf.mydemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyTest {
    @GetMapping("/api/first")
    public String first() {
        return "233";
    }
}
