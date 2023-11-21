package com.test.locadora.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.locadora.entities.Staff;

public interface StaffRepository extends JpaRepository<Staff, Long>{

}
