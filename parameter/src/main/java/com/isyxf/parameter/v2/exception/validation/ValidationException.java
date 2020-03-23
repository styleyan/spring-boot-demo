package com.isyxf.parameter.v2.exception.validation;

public class ValidationException extends RuntimeException{
    protected Integer code;
    protected Integer httpStatusCode = 300;
}
