package com.springrest.springrest.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name ="patient")
@JsonIgnoreProperties(value= {"handler","hibernateLazyInitializer","FieldHandler"})
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long patientId;
	private String f_name;
	private String l_name;
	private long mobile;
	private String password;
	private char gender;
	private String blood_grp;
	private Date dob;
	
//	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//	@JoinColumn(name = "addr_id",referencedColumnName = "addr_id")
//	private clinic_Address address;

	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Patient(long patientId, String f_name, String l_name, long mobile, String password, char gender,
			String blood_grp, Date dob){//,clinic_Address addr {
		super();
		this.patientId = patientId;
		this.f_name = f_name;
		this.l_name = l_name;
		this.mobile = mobile;
		this.password = password; 
		this.gender = gender;
		this.blood_grp = blood_grp;
		this.dob = dob;
		//this.address=addr;
		
	}


//	public clinic_Address getAddress() {
//		return address;
//	}
//
//
//	public void setAddress(clinic_Address address) {
//		this.address = address;
//	}

	public Date getDob() {
		return dob;
	}
	
	public void setDob(Date dob) {
		this.dob = dob;
	}


	public long getPatientId() {
		return patientId;
	}


	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}


	public String getF_name() {
		return f_name;
	}


	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}


	public void setL_name(String l_name) {
		this.l_name = l_name;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public char getGender() {
		return gender;
	}


	public void setGender(char gender) {
		this.gender = gender;
	}


	public String getBlood_grp() {
		return blood_grp;
	}


	public void setBlood_grp(String blood_grp) {
		this.blood_grp = blood_grp;
	}
	

}
