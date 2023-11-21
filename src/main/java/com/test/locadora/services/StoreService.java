package com.test.locadora.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.locadora.dto.StoreDTO;
import com.test.locadora.respositories.StoreRepository;

@Service
public class StoreService {
	
	@Autowired
	private StoreRepository storeRepository;
	
	@Transactional(readOnly = true)
	public List<StoreDTO> findAll(){
		return storeRepository.findAll().stream().map(x -> new StoreDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public StoreDTO findById(Long id){
		return new StoreDTO(storeRepository.findById(id).get());
	}
}
