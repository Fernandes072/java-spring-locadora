package com.test.locadora.respositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.locadora.entities.Actor;

public interface ActorRepository extends JpaRepository<Actor, Long>{

}
