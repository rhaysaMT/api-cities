package com.github.rhaysamt.citiesapi.repository;

import com.github.rhaysamt.citiesapi.entities.CountryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<CountryEntity, Long> {
}
