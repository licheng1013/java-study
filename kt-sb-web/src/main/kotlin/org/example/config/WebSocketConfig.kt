package org.example.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.socket.config.annotation.EnableWebSocket
import org.springframework.web.socket.config.annotation.WebSocketConfigurer
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry
import org.example.handler.MyWebSocketHandler

@Configuration
@EnableWebSocket
open class WebSocketConfig(private val myWebSocketHandler: MyWebSocketHandler) : WebSocketConfigurer {
    override fun registerWebSocketHandlers(registry: WebSocketHandlerRegistry) {
        registry.addHandler(myWebSocketHandler, "/ws").setAllowedOrigins("*")
    }
}