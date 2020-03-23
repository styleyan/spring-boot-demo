package com.isyxf.parameter.v2.controller;

import com.isyxf.parameter.v2.dto.Parent;
import com.isyxf.parameter.v2.exception.validation.RequestValidationException;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Validated
public class FirstController {
    /**
     * 测试1
     * @return
     */
    @PostMapping("/api/v2/one")
    public void one(@Valid @RequestBody Parent parent, BindingResult result) {
        if (result.hasErrors()) {
            for (ObjectError error : result.getAllErrors()) {
                throw new RequestValidationException(288);
            }
        }
    }

    /**
     * 测试2
     */
    @GetMapping("/api/v2/two")
    public void tow(@Range(min = 10, max = 20, message = "年龄只能在10~20") @RequestParam(name = "age") int age,
                    @Length(min = 3,max = 7, message = "地址只能在3~7个字符") @RequestParam(name = "address") String address) {
        System.out.println(age);
        System.out.println(address);
    }
}
