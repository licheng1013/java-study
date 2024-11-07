package org.example.entity

import java.util.Date

data class UserInfo(
    var id: Int = 0,
    var name: String = "",
    var nickname: String = "",
    var createTime: Date = Date(),
)
