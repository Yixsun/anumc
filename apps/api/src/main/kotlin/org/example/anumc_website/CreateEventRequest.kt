package org.example.anumc_website

import java.time.LocalDateTime

data class CreateEventRequest(
    val title: String,
    val description: String?,
    val eventDate: LocalDateTime,
)
