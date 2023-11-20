package com.test.locadora.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.locadora.dto.AddressDTO;
import com.test.locadora.respositories.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Transactional(readOnly = true)
	public List<AddressDTO> findAll(){
		return addressRepository.findAll().stream().map(x -> new AddressDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public AddressDTO findById(Long id){
		return new AddressDTO(addressRepository.findById(id).get());
	}
}
