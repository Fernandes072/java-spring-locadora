package com.test.locadora.dto;

import org.springframework.beans.BeanUtils;

import com.test.locadora.entities.Address;
import com.test.locadora.entities.Staff;
import com.test.locadora.entities.Store;

public class StoreDTO {
	
	private Long storeId;
	private Staff managerStaffId;
	private Address addressId;
	private String lastUpdate;
	
	public StoreDTO() {
		
	}

	public StoreDTO(Store entity) {
		BeanUtils.copyProperties(entity, this);
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
	
}
