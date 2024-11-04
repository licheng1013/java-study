package org.example.util

import cn.hutool.core.convert.NumberWithFormat
import cn.hutool.jwt.JWTUtil
import java.io.Serializable

/**
 * JWT的封装用于更易用
 *
 * @author lc
 * @since 7/11/22
 */
object TokenUtil {
    /**
     * 密钥串
     */
    var SECRET_KEY: String = "912ec803b2ce49e4a541068d495ab570"
    private const val USER_ID_KEY = "USER_ID"
    private const val EXPIRE_TIME_KEY = "EXPIRE_TIME"

    /**
     * 获取Token
     *
     * @since 7/11/22
     */
    fun getToken(userId: Serializable?): String? {
        val map: MutableMap<String?, Any?> = HashMap<String?, Any?>()
        map.put(TokenUtil.USER_ID_KEY, userId)
        map.put(TokenUtil.EXPIRE_TIME_KEY, System.currentTimeMillis() + 1000L * 60 * 60 * 24 * 365)
        return JWTUtil.createToken(map, SECRET_KEY.toByteArray())
    }

    /**
     * 获取用户id
     *
     * @since 7/11/22
     */
    fun getUserId(token: String?): String? {
        val jwt = JWTUtil.parseToken(token)
        if (!JWTUtil.verify(token, SECRET_KEY.toByteArray())) {
            throw MyException("无效Token!")
        }
        val payload = jwt.getPayload(TokenUtil.EXPIRE_TIME_KEY)
        if (payload == null || System.currentTimeMillis() > (payload as NumberWithFormat).toLong()) {
            throw MyException("登入失效!")
        }
        return jwt.getPayload(TokenUtil.USER_ID_KEY).toString()
    }

    @JvmStatic
    fun main(args: Array<String>) {
        //测试
        val token = getToken(123456)
        println(token)
        val userId = getUserId(token)
        println(userId)
    }
}
