package com.isyxf.parameter.dto;

import com.isyxf.parameter.validators.PasswordEqual;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

/**
 * 自定义校验
 */
@Getter
@Setter
@PasswordEqual(min = 2, max = 10)
public class PersonDTO5 {
    @Length(min = 2, max = 10, message = "这是错误的")
    private String name;
    private Integer age;

    private String password1;
    private String password2;
}
