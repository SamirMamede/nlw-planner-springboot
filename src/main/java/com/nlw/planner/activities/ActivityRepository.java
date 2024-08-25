package com.nlw.planner.activities;

import com.nlw.planner.participant.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ActivityRepository extends JpaRepository<Activity, UUID> {
    List<Activity> findByTripId(UUID tripId);
}
