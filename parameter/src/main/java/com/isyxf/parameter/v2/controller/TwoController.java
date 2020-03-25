package com.isyxf.parameter.v2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TwoController {
    /**
     * 第一
     * @return
     */
    @GetMapping("/api/demo/two")
    public String one() {
        return "233";
    }
}
