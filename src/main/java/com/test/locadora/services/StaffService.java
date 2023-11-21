package com.test.locadora.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.locadora.dto.StaffDTO;
import com.test.locadora.respositories.StaffRepository;

@Service
public class StaffService {
	
	@Autowired
	private StaffRepository staffRepository;
	
	@Transactional(readOnly = true)
	public List<StaffDTO> findAll(){
		return staffRepository.findAll().stream().map(x -> new StaffDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public StaffDTO findById(Long id){
		return new StaffDTO(staffRepository.findById(id).get());
	}
}
