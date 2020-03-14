package com.isyxf.error.exception.http;

/**
 * 代表和HTTP相关的异常
 */
public class HttpException extends RuntimeException {
    protected Integer code;
    protected Integer httpStatusCode = 500;
}
