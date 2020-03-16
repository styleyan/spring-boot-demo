package com.isyxf.missyou.configuration;

import com.isyxf.missyou.condtion.DianaCondtion;
import com.isyxf.missyou.condtion.LreliaCondtion;
import com.isyxf.missyou.sample.hero.Skill;
import com.isyxf.missyou.sample.hero.impl.Diana;
import com.isyxf.missyou.sample.hero.impl.Lrelia;
import org.springframework.boot.autoconfigure.condition.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 这里面 @Bean 必须返回实例化后的对象
 */
@Configuration
public class Hero {
    @Bean
    @ConditionalOnProperty(value = "ixf.aaa", havingValue = "Diana")
    public Skill diana() {
        return new Diana();
    }
    @Bean
    @Conditional(LreliaCondtion.class)
    public Skill lrelia() {
        return new Lrelia();
    }
}
