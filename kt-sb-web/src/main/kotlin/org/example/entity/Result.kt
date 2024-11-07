package org.example.entity

class Result<T>(
    var code: Int = 0,
    var msg: String = "成功",
    var data: T? = null
) {
    companion object {
        fun <T> ok(data: T?): Result<T> {
            return Result(data = data)
        }
        fun <T> fail(msg: String): Result<T> {
            return Result(-1, msg)
        }
    }
}
