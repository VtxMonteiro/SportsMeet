package com.SportsMeet.Sports.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SportsMeet.Sports.Entities.EventoEntities;

@Repository
public interface EventoRepository extends JpaRepository<EventoEntities, Integer> {
}
