package com.test.locadora.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.locadora.dto.StoreDTO;
import com.test.locadora.services.StoreService;

@RestController @RequestMapping(value = "/stores")
public class StoreController {
	
	@Autowired
	private StoreService storeService;
	
	@GetMapping
	public List<StoreDTO> findAll(){
		return storeService.findAll();
	}
	
	@GetMapping @RequestMapping(value = "/{id}")
	public StoreDTO findById(@PathVariable Long id){
		return storeService.findById(id);
	}
}
