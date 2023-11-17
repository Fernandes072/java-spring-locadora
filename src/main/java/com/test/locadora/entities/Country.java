package com.test.locadora.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "country_id")
	private Long countryId;
	
	private String country;
	
	@Column(name = "last_update")
	private String lastUpdate;
	
	public Country() {
		
	}

	public Country(Long countryId, String country, String lastUpdate) {
		this.countryId = countryId;
		this.country = country;
		this.lastUpdate = lastUpdate;
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

	@Override
	public int hashCode() {
		return Objects.hash(countryId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		return Objects.equals(countryId, other.countryId);
	}
}
