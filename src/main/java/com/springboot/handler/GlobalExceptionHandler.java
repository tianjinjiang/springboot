package com.springboot.handler;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * 异常处理类
 *
 * @author kimtian
 **/
@ControllerAdvice
public class GlobalExceptionHandler {
//    @ExceptionHandler(value = Exception.class)
//    @ResponseBody
//    private Map<String, Object> exceptionHandler(MultipartHttpServletRequest req, Exception e) {
//        Map<String, Object> modelMap = new HashMap<String, Object>();
//        modelMap.put("success", false);
//        modelMap.put("errMsg", e.getMessage());
//        return modelMap;
//
//    }
}
