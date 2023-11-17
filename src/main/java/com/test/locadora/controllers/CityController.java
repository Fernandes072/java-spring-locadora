package com.test.locadora.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.locadora.dto.CityDTO;
import com.test.locadora.services.CityService;

@RestController @RequestMapping(value = "/cities")
public class CityController {
	
	@Autowired
	private CityService cityService;
	
	@GetMapping
	public List<CityDTO> findAll(){
		return cityService.findAll();
	}
	
	@GetMapping @RequestMapping(value = "/{id}")
	public CityDTO findById(@PathVariable Long id) {
		return cityService.findById(id);
	}
}
