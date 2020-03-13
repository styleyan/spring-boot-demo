package com.isyxf.missyou.condtion;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class DianaCondtion implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        // 通过 context 可以拿到配置的变量
        String environment = context.getEnvironment().getProperty("ixf.aaa");

        System.out.println(environment);
        return true;
    }
}
