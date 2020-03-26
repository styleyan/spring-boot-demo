package com.isyxf.myaop.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspectJ {

    /**
     * 前置通知
     */
    @Before("execution(* com.isyxf.myaop.controller.v1.MyTest.*(..))")
    public void before() {
        System.out.println("before通知");
    }

    /**
     * 后置通知
     * @param joinPoint
     */
    @AfterReturning(value = "execution(* com.isyxf.myaop.controller.v1.MyTest.my*(..))")
    public void afterReturning(JoinPoint joinPoint) {
        System.out.println("afterReturning类型通知");
    }

    /**
     * 不管是否有异常都会通知
     * @param joinPoint
     */
    @After("execution(* com.isyxf.myaop.controller.v1.MyTest.*(..))")
    public void after(JoinPoint joinPoint) {
        joinPoint.getArgs();
        System.out.println("after类型通知");
    }

    /**
     * @Pointcat 表达式
     */
    @Pointcut("execution(* com.isyxf.myaop.controller.v1.MyTest.po*(..))")
    private void og(){}

    /**
     * 表达式拦截
     */
    @Before("og()")
    public void ogHandle() {
        System.out.println("Pointcut 表达式");
    }

    /**
     * 异常通知
     */
    @Pointcut("execution(* com.isyxf.myaop.controller.v1.MyTest.poTest2(..))")
    private void error(){}

    /**
     * 异常通知实现
     */
    @AfterThrowing("error()")
    public void errorHandle() {
        System.out.println("error Handle Pointcut");
    }
}
