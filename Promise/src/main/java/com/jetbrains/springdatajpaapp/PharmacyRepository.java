package com.jetbrains.springdatajpaapp;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PharmacyRepository extends CrudRepository<Pharmacy, Long> {
    List<Pharmacy> findPharmaciesByLatBetweenAndLonIsBetween(Long lat, Long lon);
}
