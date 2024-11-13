package org.example.config

import org.example.entity.Result
import org.example.util.HttpUtil
import org.example.util.MyException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler

@ControllerAdvice
class GlobalExceptionHandler : ResponseEntityExceptionHandler() {


    @ExceptionHandler(Exception::class)
    @ResponseBody
    fun handleException(e: Exception): Result<Any> {
        // 在这里处理异常，返回统一格式的错误响应
        logger.error("系统异常",e)
        return Result.fail(e.message ?: "未知异常")
    }

    @ExceptionHandler(MyException::class)
    @ResponseBody
    fun handleMyException(e: MyException): Result<Any> {
        logger.error("业务异常",e)
        return Result.fail(e.message ?: "未知异常")
    }
}