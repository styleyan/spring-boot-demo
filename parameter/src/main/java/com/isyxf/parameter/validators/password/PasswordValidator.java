package com.isyxf.parameter.validators.password;

import com.isyxf.parameter.dto.PersonDTO5;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @Author: Y.jer
 * 自定义校验规则
 * 第二个: 自定义注解修饰的目标的类型
 */
public class PasswordValidator implements ConstraintValidator<PasswordEqual, PersonDTO5> {
    private int min;
    private int max;

    /**
     * 获取注解参数
     * @param constraintAnnotation
     */
    @Override
    public void initialize(PasswordEqual constraintAnnotation) {
        this.min = constraintAnnotation.min();
        this.max = constraintAnnotation.max();
    }

    @Override
    public boolean isValid(PersonDTO5 personDTO5, ConstraintValidatorContext context) {
        String password1 = personDTO5.getPassword1();
        String password2 = personDTO5.getPassword2();
        Boolean match = password1.equals(password2);
        // 进行默认传参数校验
        // ........
        return match;
    }
}
