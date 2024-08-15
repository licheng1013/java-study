package org.example.config

import com.sun.org.apache.xalan.internal.lib.ExsltDatetime.dateTime
import jakarta.servlet.http.HttpServletRequest
import jakarta.servlet.http.HttpServletResponse
import org.example.ex.toDateTime
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration
import org.springframework.web.method.HandlerMethod
import org.springframework.web.servlet.HandlerInterceptor

@Configuration
open class InterceptorConfig : HandlerInterceptor {
    private val log = LoggerFactory.getLogger(InterceptorConfig::class.java)
    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        request.setAttribute("startTime", System.currentTimeMillis())
        // 排除静态资源
        if (handler !is HandlerMethod) {
            return true
        }
        val handlerMethod = handler
        val token = handlerMethod.getMethodAnnotation(PassToken::class.java)
        if (token != null) {
            return true
        }
        return true
    }

    override fun afterCompletion(request: HttpServletRequest, response: HttpServletResponse, handler: Any, ex: Exception?) {
        val startTime = request.getAttribute("startTime") as Long
        val endTime = System.currentTimeMillis()
        val executeTime = endTime - startTime
        val formattedExecuteTime = String.format("%10d", executeTime)
        val method = request.method
        val methodWithColor = String.format("%5s", "\u001B[34m$method\u001B[0m") // Blue text color
        val urlPat = request.requestURI
        log.info("${formattedExecuteTime}ms $methodWithColor \"$urlPat\"")
    }
}