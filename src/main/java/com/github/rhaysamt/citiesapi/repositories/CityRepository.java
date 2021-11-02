package com.github.rhaysamt.citiesapi.repositories;

import com.github.rhaysamt.citiesapi.entities.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<CityEntity, Long> {
}
