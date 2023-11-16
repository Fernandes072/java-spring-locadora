package com.test.locadora.dto;

import com.test.locadora.entities.Actor;

public class ActorDTO {
	
	private Long actorId;
	private String firstName;
	private String lastName;
	private String lastUpdate;
	
	public ActorDTO() {
		
	}
	
	public ActorDTO(Actor entity) {
		actorId = entity.getActorId();
		firstName = entity.getFirstName();
		lastName = entity.getLastName();
		lastUpdate = entity.getLastUpdate();
	}

	public Long getActorId() {
		return actorId;
	}

	public void setActorId(Long actorId) {
		this.actorId = actorId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
