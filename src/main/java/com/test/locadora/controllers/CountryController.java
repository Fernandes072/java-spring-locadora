package com.test.locadora.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.locadora.dto.CountryDTO;
import com.test.locadora.services.CountryService;

@RestController
@RequestMapping(value = "/countries")
public class CountryController {
	
	@Autowired
	private CountryService countryService;
	
	@GetMapping
	public List<CountryDTO> findAll(){
		return countryService.findAll();
	}
	
	@GetMapping @RequestMapping(value = "/{id}")
	public CountryDTO findById(@PathVariable Long id){
		return countryService.findByID(id);
	}

}
