package com.test.locadora.entities;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity @Table(name = "store")
public class Store {
	
	@Id @GeneratedValue (strategy = GenerationType.IDENTITY) @Column(name = "store_id")
	private Long storeId;
	
	@OneToOne @JoinColumn(name = "manager_staff_id") @JsonBackReference
	private Staff managerStaffId;
	
	@OneToOne @JoinColumn(name = "address_id")
	private Address addressId;
	
	@Column(name = "last_update")
	private String lastUpdate;
	
	public Store() {
		
	}

	public Store(Long storeId, Staff managerStaffId, Address addressId, String lastUpdate) {
		this.storeId = storeId;
		this.managerStaffId = managerStaffId;
		this.addressId = addressId;
		this.lastUpdate = lastUpdate;
	}

	public Long getStoreId() {
		return storeId;
	}

	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}

	public Staff getManagerStaffId() {
		return managerStaffId;
	}

	public void setManagerStaffId(Staff managerStaffId) {
		this.managerStaffId = managerStaffId;
	}

	public Address getAddressId() {
		return addressId;
	}

	public void setAddressId(Address addressId) {
		this.addressId = addressId;
	}

	public String getLastUpdate() {
		return lastUpdate;
	}

	public void setLastUpdate(String lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(storeId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		return Objects.equals(storeId, other.storeId);
	}
}
