package com.test.locadora.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.locadora.dto.AddressDTO;
import com.test.locadora.services.AddressService;

@RestController @RequestMapping(value = "/addresses")
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	@GetMapping
	public List<AddressDTO> findAll(){
		return addressService.findAll();
	}
	
	@GetMapping
	@RequestMapping(value = "/{id}")
	public AddressDTO findById(@PathVariable Long id){
		return addressService.findById(id);
	}
	
	
}
