package com.isyxf.parameter.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 自定义注解
 *
 * 在自定义注解里面只能写基本类型，不能写包装类型，如: Integer 需要换成 int
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE })
@Constraint(validatedBy = PasswordValidator.class)
public @interface PasswordEqual {
    // 定义注解 默认参数
    int min() default 4;
    int max() default 10;
    // 错误提示内容
    String message() default "passwords are not equal";

    // 规范里规定的2个模板方法
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
