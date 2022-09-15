package com.springrest.springrest.Service;

import java.util.List;

import com.springrest.springrest.entities.Doctor;

public interface IDoctorServicable {
	

	public List<Doctor> getAllDoctors();
	public Doctor updateDoctor(Doctor p);
	public Doctor addDoctor(Doctor p);
	public void deleteDoctor(long id);
	public Doctor getDoctor(long id);
	
	
}
