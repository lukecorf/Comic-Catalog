package com.comic.catalog.dto

import java.time.LocalDateTime

data class DError (
    val timestamp: LocalDateTime = LocalDateTime.now(),
    val status: Int,
    val error: String,
    val message: String?,
    val path: String
)