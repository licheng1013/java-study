package org.example.handler

import org.springframework.context.annotation.Configuration
import org.springframework.web.socket.CloseStatus
import org.springframework.web.socket.TextMessage
import org.springframework.web.socket.WebSocketSession
import org.springframework.web.socket.handler.TextWebSocketHandler

@Configuration
open class MyWebSocketHandler : TextWebSocketHandler() {

    companion object {
        var sessionMap = mutableMapOf<String, WebSocketSession>()
    }

    override fun afterConnectionEstablished(session: WebSocketSession) {
        println("Connection established: ${session.id}")
        sessionMap[session.id] = session
    }

    override fun handleTextMessage(session: WebSocketSession, message: TextMessage) {
        println("Received message: ${message.payload}")
        session.sendMessage(TextMessage("Echo: ${message.payload}"))
    }

    override fun afterConnectionClosed(session: WebSocketSession, status: CloseStatus) {
        println("Connection closed: ${session.id}")
        sessionMap.remove(session.id)
        // 发送消息给用户
        sendMessageToUser(WsResult(1,sessionMap.size))
    }

    fun sendMessageToUser(result : WsResult) {
        // Notify other users
        sessionMap.forEach {
            val otherSession = it.value
            otherSession.sendMessage(result.toTextMessage())
        }
    }
}
