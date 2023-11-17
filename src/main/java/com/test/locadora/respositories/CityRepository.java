package com.test.locadora.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.locadora.entities.City;

public interface CityRepository extends JpaRepository<City, Long>{
	
}
