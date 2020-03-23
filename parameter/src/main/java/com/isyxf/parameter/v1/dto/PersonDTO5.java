package com.isyxf.parameter.v1.dto;

import com.isyxf.parameter.v1.validators.password.PasswordEqual;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

/**
 * 自定义校验
 */
@Getter
@Setter
@PasswordEqual(min = 2, max = 10, message = "2333")
public class PersonDTO5 {
    @Length(min = 2, max = 10, message = "这是错误的")
    private String name;
    private Integer age;

    private String password1;
    private String password2;
}
