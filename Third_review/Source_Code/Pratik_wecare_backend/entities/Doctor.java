package com.springrest.springrest.entities;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long doctorId;
	private String f_name;
	private String l_name;
	private String qualification;
	private String university;
	private String specialization;
	private int passing_year;
	private String license_no;
	private String email_id;
	private boolean is_valid;
	private long mobile;
	private String password;
	private char gender;
	private Date dob;
	
	//-------------------------------------------dr has a clinic_address relationship
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "addr_id",referencedColumnName = "addr_id")
	private clinic_Address addr;

	
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Doctor(String f_name, String l_name, String qualification, String university,
			String specialization, int passing_year, String license_no, String email_id, boolean is_valid, long mobile,
			String password, char gender, Date dob, clinic_Address addr) {
		super();
		this.f_name = f_name;
		this.l_name = l_name;
		this.qualification = qualification;
		this.university = university;
		this.specialization = specialization;
		this.passing_year = passing_year;
		this.license_no = license_no;
		this.email_id = email_id;
		this.is_valid = is_valid;
		this.mobile = mobile;
		this.password = password;
		this.gender = gender;
		this.dob = dob;
		this.addr = addr;
		
		
	}

	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getUniversity() {
		return university;
	}

	public void setUniversity(String university) {
		this.university = university;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public int getPassing_year() {
		return passing_year;
	}

	public void setPassing_year(int passing_year) {
		this.passing_year = passing_year;
	}

	public String getLicense_no() {
		return license_no;
	}

	public void setLicense_no(String license_no) {
		this.license_no = license_no;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public boolean isIs_valid() {
		return is_valid;
	}

	public void setIs_valid(boolean is_valid) {
		this.is_valid = is_valid;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public clinic_Address getAddr() {
		return addr;
	}

	public void setAddr(clinic_Address addr) {
		this.addr = addr;
	}
	
	
	
	
	
	
}
