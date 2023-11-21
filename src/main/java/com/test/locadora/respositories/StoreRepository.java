package com.test.locadora.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.locadora.entities.Store;

public interface StoreRepository extends JpaRepository<Store, Long>{

}
