package com.isyxf.parameter.controller;

import com.isyxf.parameter.dto.*;
import com.isyxf.parameter.validators.my.User;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
public class My {
    /**
     * get 路径参数获取, /api/name/233
     * @return
     */
    @GetMapping("/api/name/{id}")
    public Integer name(@PathVariable("id") Integer id ) {
        return id;
    }

    /**
     * get 查询获取, /api/test?foo=23
     * @return
     */
    @GetMapping("/api/test")
    public String test(@RequestParam String name) {
        return name;
    }

    /**
     * 使用lombok builder 构建 DTO
     * @return
     */
    @PostMapping("/api/build")
    public Object build() {
        PersonDTO2 persion = PersonDTO2.builder().age(18).name("yxf").build();
        return persion;
    }

    /**
     * post请求
     * @return
     */
    @PostMapping("/api/send")
    public Object send(@RequestBody PersonDTO personDTO) {
        PersonDTO persion = new PersonDTO("Y.jer", 11);
        return persion;
    }

    /**
     * 对于 post 请求校验
     * @return
     */
    @PostMapping("/api/dto3")
    public Object sendData(@RequestBody @Validated PersonDTO3 personDTO3) {
        return personDTO3;
    }

    /**
     * 对于 post 请求级联校验
     * @return
     */
    @PostMapping("/api/dto4")
    public Object sendData(@RequestBody @Validated PersonDTO4 personDTO4) {
        return personDTO4;
    }

    /**
     * 自定义校验注解
     * @return
     */
    @PostMapping("/api/custom")
    public Object custom(@RequestBody @Validated PersonDTO5 personDTO5) {
        return personDTO5;
    }

    /**
     * 233
     * @param user
     * @return
     */
    @PostMapping("/api/cs")
    public String cs(@RequestBody @Validated User user) {
        System.out.println(user.getAge());
        return "233";
    }
}
