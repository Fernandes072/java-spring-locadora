package com.test.locadora.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.locadora.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long>{

}
