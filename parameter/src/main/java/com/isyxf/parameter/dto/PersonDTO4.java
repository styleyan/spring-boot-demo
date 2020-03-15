package com.isyxf.parameter.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;

@Getter
@Setter
public class PersonDTO4 {
    @Length(min = 2, max = 10, message = "这是错误的")
    private String name;
    private Integer age;
    /**
     * TODO: 级联校验最主要还是 @Valid 这个 参数
     */
    @Valid
    private SchoolDTO schoolDTO;
}
