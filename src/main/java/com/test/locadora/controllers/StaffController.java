package com.test.locadora.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.locadora.dto.StaffDTO;
import com.test.locadora.services.StaffService;

@RestController @RequestMapping(value = "/staff")
public class StaffController {
	
	@Autowired
	private StaffService staffService;
	
	@GetMapping
	public List<StaffDTO> findAll(){
		return staffService.findAll();
	}
	
	@GetMapping @RequestMapping(value = "/{id}")
	public StaffDTO findById(@PathVariable Long id){
		return staffService.findById(id);
	}
}
