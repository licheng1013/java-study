package org.example.entity

class ResultInfo<T>(
    var code: Int = 0,
    var msg: String = "成功",
    var data: T? = null
) {
    companion object {
        fun <T> ok(data: T?): ResultInfo<T> {
            return ResultInfo(data = data)
        }
        fun <T> fail(msg: String): ResultInfo<T> {
            return ResultInfo(-1, msg)
        }
    }
}
