package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity 
@JsonIgnoreProperties(value= {"handler","hibernateLazyInitializer","FieldHandler"})
public class ClinicAddress {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long addr_id;
	private String clinic_name;
	private String building_no;
	private String Landmark;
	private String street;
	private String state;
	private String district;
	private String city;
	private String village;
	private int pincode;
	private long clinic_contact_no;
	private String password;
	
	
	public ClinicAddress() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ClinicAddress(String clinic_name, String building_no, String landmark, String street,
			String state, String district, String city, String village, int pincode, long clinic_contact_no,
			String password) {
		super();
		
		this.clinic_name = clinic_name;
		this.building_no = building_no;
		Landmark = landmark;
		this.street = street;
		this.state = state;
		this.district = district;
		this.city = city;
		this.village = village;
		this.pincode = pincode;
		this.clinic_contact_no = clinic_contact_no;
		this.password = password;
	}


	public long getAddr_id() {
		return addr_id;
	}


	public void setAddr_id(int addr_id) {
		this.addr_id = addr_id;
	}


	public String getClinic_name() {
		return clinic_name;
	}


	public void setClinic_name(String clinic_name) {
		this.clinic_name = clinic_name;
	}


	public String getBuilding_no() {
		return building_no;
	}


	public void setBuilding_no(String building_no) {
		this.building_no = building_no;
	}


	public String getLandmark() {
		return Landmark;
	}


	public void setLandmark(String landmark) {
		Landmark = landmark;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getVillage() {
		return village;
	}


	public void setVillage(String village) {
		this.village = village;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	public long getClinic_contact_no() {
		return clinic_contact_no;
	}


	public void setClinic_contact_no(long clinic_contact_no) {
		this.clinic_contact_no = clinic_contact_no;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

	
	
}

