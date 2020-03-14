package com.isyxf.error.core;
import com.isyxf.error.exception.http.HttpException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 统一管理错误
 */
@ControllerAdvice
public class GlobalExceptionAdvice {
    /**
     * 未知异常
     * 全局异常处理，需要添加上 @ResponseBody 注解
     * @param req
     * @param e
     */
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public UnifyResponse handleException(HttpServletRequest req, Exception e) {
        System.out.println("hell word");
        UnifyResponse unifyResponse = new UnifyResponse(9999, "服务器异常", "233/2323");
        return unifyResponse;
    }

    /**
     * 已知异常
     * 只处理http异常
     * @param req
     * @param e
     */
    @ExceptionHandler(value = HttpException.class)
    public void handleHttpException(HttpServletRequest req, HttpException e) {
        System.out.println("hello http");
    }
}
