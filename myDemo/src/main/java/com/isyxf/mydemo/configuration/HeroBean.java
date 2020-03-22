package com.isyxf.mydemo.configuration;

import com.isyxf.mydemo.condition.ZhanSanCondition;
import com.isyxf.mydemo.condition.ZhaoLiuCondition;
import com.isyxf.mydemo.service.Hero;
import com.isyxf.mydemo.service.impl.ZhanSan;
import com.isyxf.mydemo.service.impl.ZhaoLiu;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HeroBean {
    @Bean
    @Conditional(ZhanSanCondition.class)
    public Hero zhanSan() {
        return new ZhanSan();
    }
    @Bean
    @Conditional(ZhaoLiuCondition.class)
    public Hero zhaoLiu() {
        return new ZhaoLiu();
    }
}
