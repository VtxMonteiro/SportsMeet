package com.SportsMeet.Sports.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SportsMeet.Sports.Entities.EsporteEntities;

@Repository
public interface EsporteRepository extends JpaRepository<EsporteEntities, Integer> {
}
