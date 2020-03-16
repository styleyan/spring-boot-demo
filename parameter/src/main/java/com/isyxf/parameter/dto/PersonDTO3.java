package com.isyxf.parameter.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class PersonDTO3 {
    @Length(min = 2, max = 10, message = "这是错误的")
    private String name;
    private Integer age;
}
