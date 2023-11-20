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

@Entity
@Table(name = "address")
public class Address {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name = "address_id")
	private Long addressId;
	
	private String address;
	private String address2;
	private String district;
	
	@ManyToOne @JoinColumn(name = "city_id")
	private City cityId;
	
	@Column(name = "postal_code")
	private String postalCode;
	private String phone;
	
	@Column(name = "last_update")
	private String lastUpdate;
	
	public Address() {
		
	}

	public Address(Long addressId, String address, String address2, String district, City cityId, String postalCode,
			String phone, String lastUpdate) {
		this.addressId = addressId;
		this.address = address;
		this.address2 = address2;
		this.district = district;
		this.cityId = cityId;
		this.postalCode = postalCode;
		this.phone = phone;
		this.lastUpdate = lastUpdate;
	}

	public Long getAddressId() {
		return addressId;
	}

	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public City getCityId() {
		return cityId;
	}

	public void setCityId(City cityId) {
		this.cityId = cityId;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(addressId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(addressId, other.addressId);
	}
}
