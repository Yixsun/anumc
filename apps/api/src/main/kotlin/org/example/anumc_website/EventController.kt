package org.example.anumc_website

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/events")
class EventController(private val eventService: EventService) {

    @PostMapping
    fun createEvent(@RequestBody request: CreateEventRequest) : ResponseEntity<Event> {
        val savedEvent = eventService.createEvent(request)
        return ResponseEntity.status(201).body(savedEvent)
    }

    @GetMapping
    fun getAllEvents(): ResponseEntity<List<Event>> {
        val events = eventService.getAllEvents()
        return ResponseEntity.ok(events)
    }
}