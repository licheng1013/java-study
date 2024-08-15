package org.example.handler

import com.fasterxml.jackson.databind.ObjectMapper
import org.springframework.web.socket.TextMessage

data class WsResult(
    var cmd: Int,
    var data: Any,
){
    fun toTextMessage(): TextMessage {
        return TextMessage(ObjectMapper().writeValueAsString(this))
    }
}

