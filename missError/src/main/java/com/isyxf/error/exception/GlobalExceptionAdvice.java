package com.isyxf.error.exception;
import com.isyxf.error.core.UnifyResponse;
import com.isyxf.error.exception.http.ForbiddenException;
import com.isyxf.error.exception.http.HttpException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLSyntaxErrorException;

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
     * 运行时异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public UnifyResponse handleRuntimeException(HttpServletRequest req, RuntimeException e) {
        System.out.println(e.getMessage());
        return null;
    }

    /**
     * 指定异常类型
     */
    @ExceptionHandler(value = ForbiddenException.class)
    @ResponseBody
    public UnifyResponse handleForbiddenException(HttpServletRequest req, ForbiddenException e) {
        System.out.println(e.getMessage());
        return  null;
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
