package com.test.locadora.dto;

import com.test.locadora.entities.City;
import com.test.locadora.entities.Country;

public class CityDTO {
	
	private Long cityId;
	private String city;
	private Country countryId;
	private String lastUpdate;
	
	public CityDTO() {
		
	}

	public CityDTO(City entity) {
		cityId = entity.getCityId();
		city = entity.getCity();
		countryId = entity.getCountryId();
		lastUpdate = entity.getLastUpdate();
	}

	public Long getCityId() {
		return cityId;
	}

	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Country getCountryId() {
		return countryId;
	}

	public void setCountryId(Country countryId) {
		this.countryId = countryId;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
}
