package com.test.locadora.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.locadora.dto.ActorDTO;
import com.test.locadora.services.ActorService;

@RestController
@RequestMapping(value = "/actors")
public class ActorController {
	
	@Autowired
	private ActorService actorService;
	
	@GetMapping
	public List<ActorDTO> findAll(){
		List<ActorDTO> result = actorService.findAll();
		return result;
	}
	
	@GetMapping
	@RequestMapping("/{id}")
	public ActorDTO findById(@PathVariable Long id) {
		ActorDTO result = actorService.findById(id);
		return result;
	}
}
