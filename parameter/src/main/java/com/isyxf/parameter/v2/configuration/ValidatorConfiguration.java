package com.isyxf.parameter.v2.configuration;

import org.hibernate.validator.HibernateValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * @author Y.jer
 * hibernate Validator为快速失败返回模式
 */
@Configuration
public class ValidatorConfiguration {
    @Bean
    public Validator validated() {
        ValidatorFactory validatorFactory = Validation.byProvider(HibernateValidator.class)
                .configure()
                .addProperty( "hibernate.validator.fail_fast", "false")
                .buildValidatorFactory();

        Validator validator = validatorFactory.getValidator();

        return validator;
    }
}
