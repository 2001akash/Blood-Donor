package com.example.demo.donorPackage;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;

@Entity
public class BloodDonor {
	@Id
	private String D_id;
	
	private String D_name;
	
	private String D_city;
	
	private String D_bloodGroup;
	
	private String D_state;
	
	private String D_MobileNo;
	
	public BloodDonor() {}
	
	
	public BloodDonor(String d_id, String d_name, String d_city, String d_bloodGroup, String d_state,
			String d_MobileNo) {
		super();
		D_id = d_id;
		D_name = d_name;
		D_city = d_city;
		D_bloodGroup = d_bloodGroup;
		D_state = d_state;
		D_MobileNo = d_MobileNo;
	}
	
	
	public String getD_id() {
		return D_id;
	}
	public void setD_id(String d_id) {
		D_id = d_id;
	}
	public String getD_name() {
		return D_name;
	}
	public void setD_name(String d_name) {
		D_name = d_name;
	}
	public String getD_city() {
		return D_city;
	}
	public void setD_city(String d_city) {
		D_city = d_city;
	}
	public String getD_bloodGroup() {
		return D_bloodGroup;
	}
	public void setD_bloodGroup(String d_bloodGroup) {
		D_bloodGroup = d_bloodGroup;
	}
	public String getD_state() {
		return D_state;
	}
	public void setD_state(String d_state) {
		D_state = d_state;
	}
	public String getD_MobileNo() {
		return D_MobileNo;
	}
	public void setD_MobileNo(String d_MobileNo) {
		D_MobileNo = d_MobileNo;
	}
	
}
