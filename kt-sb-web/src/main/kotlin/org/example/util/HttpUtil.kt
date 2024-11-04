package org.example.util

import jakarta.servlet.http.HttpServletRequest
import lombok.experimental.UtilityClass
import org.springframework.web.context.request.RequestAttributes
import org.springframework.web.context.request.RequestContextHolder
import org.springframework.web.context.request.ServletRequestAttributes
import java.util.*

/**
 * 必须在web环境使用,否则会出现空指针异常
 */
@UtilityClass
class HttpUtil {
    /**
     * @return 当前请求的路径
     */
    val path: String
        get() = this.httpServletRequest.requestURI

    /**
     * 获取HttpServletRequest
     */
    val httpServletRequest: HttpServletRequest
        get() = (Objects.requireNonNull<RequestAttributes>(RequestContextHolder.getRequestAttributes()) as ServletRequestAttributes).request

    /**
     * 获取请求参数
     */
    val paramMap: MutableMap<String, Array<String>>
        get() {
            val request: HttpServletRequest = this.httpServletRequest
            return request.parameterMap
        }

    /**
     * web环境使用
     */
    fun getHeader(name: String): String {
        return this.httpServletRequest.getHeader(name)
    }

    /**
     * 获取请求类型GET,POST
     */
    val method: String
        get() = this.httpServletRequest.method


    var tokenKey: String = "Authorization"

    /**
     * 获取用户id
     */
    val userId: Int get() {
            val token: String = getHeader(tokenKey)
            if (token.isBlank()) {
                return 0
            }
            val userId = TokenUtil.getUserId(token)
            if (userId == null) {
                println("token无效:$token")
                return 0
            }
            return userId.toInt()
        }
}
