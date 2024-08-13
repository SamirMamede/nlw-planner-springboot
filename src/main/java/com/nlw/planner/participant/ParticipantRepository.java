package com.nlw.planner.participant;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ParticipantRepository extends JpaRepository<Participant, UUID> {
}
