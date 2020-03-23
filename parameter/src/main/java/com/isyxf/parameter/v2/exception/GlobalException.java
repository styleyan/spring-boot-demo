package com.isyxf.parameter.v2.exception;

import com.isyxf.parameter.v2.exception.validation.RequestValidationException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Y.jer
 */
@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(value = RequestValidationException.class)
    @ResponseBody
    public String handle(RequestValidationException exception) {
        System.out.println(exception.getMessage());
        return "bad request, " ;
    }
}
