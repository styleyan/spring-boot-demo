package com.isyxf.error.controller;

import com.isyxf.error.exception.http.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Mytest {

    @GetMapping("/api/first")
    public String first() throws Exception {
        throw new NotFoundException(10001);
    }

    @GetMapping("/api/two")
    public String two() {
        throw new RuntimeException("这里错误了");
    }
}
