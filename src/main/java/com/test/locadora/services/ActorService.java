package com.test.locadora.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.locadora.dto.ActorDTO;
import com.test.locadora.entities.Actor;
import com.test.locadora.respositories.ActorRepository;

@Service
public class ActorService {
	
	@Autowired
	private ActorRepository actorRepository;
	
	@Transactional(readOnly = true)
	public List<ActorDTO> findAll(){
		List<Actor> result = actorRepository.findAll();
		List<ActorDTO> dto = result.stream().map(x -> new ActorDTO(x)).toList();
		return dto;
	}
	
}
