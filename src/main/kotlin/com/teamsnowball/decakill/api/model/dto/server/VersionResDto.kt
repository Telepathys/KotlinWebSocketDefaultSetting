package com.teamsnowball.decakill.api.model.dto.server

import java.sql.Timestamp

data class VersionResDto (
    val idx: Int,
    val version: Int,
    val regdate: Timestamp
)