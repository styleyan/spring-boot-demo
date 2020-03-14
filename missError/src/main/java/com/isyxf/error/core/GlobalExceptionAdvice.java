package com.isyxf.error.core;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一管理错误
 */
@ControllerAdvice
public class GlobalExceptionAdvice {
    @ExceptionHandler(value = Exception.class)
    public void handleException(HttpServletRequest req, Exception e) {
        System.out.println("hell word");
    }
}
