package com.isyxf.error.exception.http;

/**
 * 自定义 未找到异常类
 */
public class NotFoundException extends HttpException {
    public NotFoundException(int code) {
        this.httpStatusCode = 404;
        this.code = code;
    }
}
