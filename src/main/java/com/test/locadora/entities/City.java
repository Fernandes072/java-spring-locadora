package com.test.locadora.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity @Table(name = "city")
public class City {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "city_id")
	private Long cityId;
	
	private String city;
	
	@ManyToOne @JoinColumn(name = "country_id")
	private Country countryId;
	
	@Column(name = "last_update")
	private String lastUpdate;
	
	public City() {
		
	}

	public City(Long cityId, String city, Country countryId, String lastUpdate) {
		this.cityId = cityId;
		this.city = city;
		this.countryId = countryId;
		this.lastUpdate = lastUpdate;
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

	@Override
	public int hashCode() {
		return Objects.hash(cityId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		return Objects.equals(cityId, other.cityId);
	}
}
