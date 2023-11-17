package com.test.locadora.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.locadora.dto.CountryDTO;
import com.test.locadora.respositories.CountryRepository;


@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Transactional(readOnly = true)
	public List<CountryDTO> findAll(){
		return (countryRepository.findAll()).stream().map(x -> new CountryDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public CountryDTO findByID(Long id) {
		return new CountryDTO(countryRepository.findById(id).get());
	}
}
