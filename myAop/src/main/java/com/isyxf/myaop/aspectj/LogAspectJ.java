package com.isyxf.myaop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspectJ {
    @Pointcut("execution(* com.isyxf.myaop.controller.v1.MyTest.say(..))")
    private void say() {}

    @Around("execution(* com.isyxf.myaop.controller.v1.MyTest.say(..))")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("环绕前通知=======");

        // 执行目标方法，并得到返回值
        Object obj = joinPoint.proceed();

        // 环绕后通知
        System.out.println("环绕后通知=========");
        return obj.toString() + ", 环绕后通知增强";
    }

    /**
     * 异常抛出通知
     */
    @AfterThrowing(value = "execution(* com.isyxf.myaop.controller.v1.MyTest.say(..))", throwing = "e")
    public void afterThrowing(Throwable e) {
        e.getMessage();
    }
}
