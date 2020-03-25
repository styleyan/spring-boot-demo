package com.isyxf.parameter.v3.controller;

import com.isyxf.parameter.v2.exception.validation.RequestValidationException;
import com.isyxf.parameter.v3.dto.Person;
import com.isyxf.parameter.v3.validator.GroupA;
import com.isyxf.parameter.v3.validator.GroupB;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author Y.jer
 * 分组校验
 */
@RestController
public class MyGroup {
    /**
     * 异常遍历
     */
    public void errorHandle(BindingResult result) {
        if (result.hasErrors()) {
            List<ObjectError> allErrors = result.getAllErrors();
            for (ObjectError error : allErrors) {
                System.out.println(error.getDefaultMessage());
                throw new RequestValidationException(109);
            }
        }
    }
    /**
     * 测试方法1
     * @return
     */
    @PostMapping("/api/group/one")
    public String one(@Validated({GroupA.class}) @RequestBody Person p, BindingResult result) {
        errorHandle(result);

        return "Request success";
    }

    /**
     * 测试方法2
     * @return
     */
    @PostMapping("/api/group/two")
    public String two(@Validated({GroupB.class}) @RequestBody Person p, BindingResult result) {
        errorHandle(result);

        return "Request success";
    }
}
