package org.example.anumc_website

import jakarta.transaction.Transactional
import org.springframework.stereotype.Service

@Service
class EventService(private val eventRepository: EventRepository) {

    @Transactional
    fun createEvent(request: CreateEventRequest): Event {
        val newEvent = Event(
            title = request.title,
            description = request.description,
            eventDate = request.eventDate
        )
        return eventRepository.save(newEvent)
    }

    fun getAllEvents(): List<Event> {
        return eventRepository.findAll()
    }
}