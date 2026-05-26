-- liquibase formatted sql
-- changeset author:create-event-table
CREATE TABLE IF NOT EXISTS event (
   id BIGSERIAL PRIMARY KEY,
   title VARCHAR(255) NOT NULL,
   description TEXT,
   event_date TIMESTAMP NOT NULL
);
