package com.test.locadora.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.locadora.dto.CityDTO;
import com.test.locadora.respositories.CityRepository;

@Service
public class CityService {
	
	@Autowired
	private CityRepository cityRepository;
	
	@Transactional(readOnly = true)
	public List<CityDTO> findAll(){
		return (cityRepository.findAll()).stream().map(x -> new CityDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public CityDTO findById(Long id){
		return new CityDTO(cityRepository.findById(id).get());
	}
}
