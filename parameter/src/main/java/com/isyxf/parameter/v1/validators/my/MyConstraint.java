package com.isyxf.parameter.v1.validators.my;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

/**
 * 自定义注解
 */
@Documented
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MyConstraintValidators.class )
public @interface MyConstraint {
    String message() default "参数校验不通过,请重新输入";

    long min() default 2;
    long max() default 10;

    Class<?>[] groups() default {};
    Class<? extends Payload[]>[] payload() default {};
}
