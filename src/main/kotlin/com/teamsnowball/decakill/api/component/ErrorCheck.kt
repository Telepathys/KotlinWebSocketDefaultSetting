package com.teamsnowball.decakill.api.component

import io.jsonwebtoken.MalformedJwtException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ErrorCheck(

    @Autowired
    val logger: Logger

) {

    fun exception(error: Throwable) {
        when (error) {
            is NullPointerException -> {
                logger.error("jwt토근을 보내지 않았습니다.")
            }
            is MalformedJwtException -> {
                logger.error("jwt토근이 만료되었거나 없는 토큰입니다.")
            }
            else -> {
                logger.error(error.message.toString())
            }
        }
    }


}