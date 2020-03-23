package com.isyxf.parameter.v1.validators.my;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * @author Y.jer
 * ConstraintValidator 接口, 如果是类注解需要指定的类, 字段注解则使用 Object 即可
 */
public class MyConstraintValidators implements ConstraintValidator<MyConstraint, Object> {
    private long max;
    private long min;

    @Override
    public boolean isValid(Object o, ConstraintValidatorContext constraintValidatorContext) {
        long aa = Long.valueOf(o.toString());
        return aa >= min && aa <= max;
    }

    @Override
    public void initialize(MyConstraint constraintAnnotation) {
        this.max = constraintAnnotation.max();
        this.min = constraintAnnotation.min();
    }
}
