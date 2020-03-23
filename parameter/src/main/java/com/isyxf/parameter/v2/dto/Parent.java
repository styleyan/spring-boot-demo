package com.isyxf.parameter.v2.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;

@Getter
@Setter
public class Parent {
    @Length(max = 10, min = 1, message = "输入名字不规范")
    private String name;

    @Email(message = "非法邮箱")
    private String email;
}
