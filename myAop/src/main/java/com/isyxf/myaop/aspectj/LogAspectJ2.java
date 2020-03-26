package com.isyxf.myaop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspectJ2 {
    @Pointcut("execution(* com.isyxf.myaop.controller.v1.MyTest.*(..))")
    private void myPointcut(){}

    /**
     * 前置通知，监听 MyTest 类下所有方法
     */
    @Before("myPointcut()")
    public void before() {
        System.out.println("before通知");
    }

    /**
     * 后置通知，监听 MyTest 类下，以 po 开头的方法
     */
    @AfterReturning("myPointcut()")
    public void afterRetuning() {
        System.out.println("afterReturning 通知");
    }
}
