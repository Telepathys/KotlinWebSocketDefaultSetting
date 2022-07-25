package com.teamsnowball.decakill.api.controller.server

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.handler.annotation.Payload
import org.springframework.messaging.simp.SimpMessagingTemplate
import org.springframework.stereotype.Controller


@Controller
class TestController(
    @Autowired
    val template: SimpMessagingTemplate
) {
    @MessageMapping("/test")
//    @SendTo(*["/topic/public"])
    fun sendMessage(
        @Payload
        test: String
    ): Int {
        template.convertAndSend("/topic/public","111")
        template.convertAndSend("/topic/public2","222")
        println(test)
        return 1
    }
//    fun sendMessag1e(
//        @Payload
//        test: String
//    ): Int {
//        println(test)
//        return 1
//    }
}