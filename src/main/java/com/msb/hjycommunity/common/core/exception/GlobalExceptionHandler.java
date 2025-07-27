package com.msb.hjycommunity.common.core.exception;


import com.msb.hjycommunity.common.core.domain.BaseResponse;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(BaseException.class)
    @ResponseBody
    public BaseResponse handleBaseException(BaseException e) {
        System.out.println("sdsfds");
        e.printStackTrace();
        return BaseResponse.fail(e.getMessage());
    }
}
