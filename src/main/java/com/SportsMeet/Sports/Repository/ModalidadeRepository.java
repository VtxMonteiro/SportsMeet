package com.SportsMeet.Sports.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SportsMeet.Sports.Entities.ModalidadeEntities;

@Repository
public interface ModalidadeRepository extends JpaRepository<ModalidadeEntities, Integer> {
}
