package com.isyxf.parameter.controller;

import com.isyxf.parameter.dto.PersonDTO;
import com.isyxf.parameter.dto.PersonDTO2;
import com.isyxf.parameter.dto.PersonDTO3;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
public class My {
    /**
     * 路径参数获取, /api/name/233
     * @return
     */
    @GetMapping("/api/name/{id}")
    public Integer name(@PathVariable("id") Integer id ) {
        return id;
    }

    /**
     * 路径参数获取, /api/test?foo=23
     * @return
     */
    @GetMapping("/api/test")
    public String test(@RequestParam String name) {
        return name;
    }

    /**
     * 发送post请求
     * @return
     */
    @PostMapping("/api/send")
    public Object send(@RequestBody PersonDTO personDTO) {
        PersonDTO persion = new PersonDTO("Y.jer", 11);
        return persion;
    }

    /**
     * 对于 post 请求参数进行校验
     * @return
     */
    @PostMapping("/api/dto3")
    public Object sendData(@RequestBody @Validated PersonDTO3 personDTO3) {
        return personDTO3;
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
}
