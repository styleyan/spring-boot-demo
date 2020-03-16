package com.isyxf.error.exception.http;

/**
 * 自定义没有权限状态
 */
public class ForbiddenException extends HttpException {
    public ForbiddenException(int code) {
        this.code = code;
        this.httpStatusCode = 403;
    }
}
