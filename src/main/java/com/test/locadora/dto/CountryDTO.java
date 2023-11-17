package com.test.locadora.dto;

import com.test.locadora.entities.Country;

public class CountryDTO {
	
	private Long countryId;
	private String country;
	private String lastUpdate;
	
	public CountryDTO() {
		
	}
	
	public CountryDTO(Country entity) {
		countryId = entity.getCountryId();
		country = entity.getCountry();
		lastUpdate = entity.getLastUpdate();
	}

	public Long getCountryId() {
		return countryId;
	}

	public void setCountryId(Long countryId) {
		this.countryId = countryId;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
