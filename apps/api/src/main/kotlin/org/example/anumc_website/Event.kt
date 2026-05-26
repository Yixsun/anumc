package org.example.anumc_website

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "event")
class Event(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

    @Column(nullable = false)
    val title: String,

    @Column
    val description: String?,

    @Column(name = "event_date", nullable = false)
    val eventDate: LocalDateTime

)