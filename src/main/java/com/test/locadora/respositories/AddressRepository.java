package com.test.locadora.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.locadora.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
