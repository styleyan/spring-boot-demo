package com.isyxf.error.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mytest {

    @GetMapping("/api/first")
    public String first() throws Exception {
        throw new Exception("这里错误了");
    }

    @GetMapping("/api/two")
    public String two() {
        throw new RuntimeException("这里错误了");
    }
}
