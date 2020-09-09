package com.timothy.orderservice.config;

import com.timothy.common.config.AjaxResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author yutimothy
 * @Date 2020/9/6 11:21
 * @Version 1.0
 */
@RestControllerAdvice
public class OrderConfig {
    @ExceptionHandler(RuntimeException.class)
    public AjaxResult error(RuntimeException runtimeException) {
        return AjaxResult.error(runtimeException.getLocalizedMessage());
    }
}
