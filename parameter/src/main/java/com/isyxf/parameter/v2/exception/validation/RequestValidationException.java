package com.isyxf.parameter.v2.exception.validation;

public class RequestValidationException extends ValidationException {
    public RequestValidationException (int code) {
        this.httpStatusCode = 300;
        this.code = code;
    }
}
