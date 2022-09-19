package com.springrest.springrest.Service;

import java.util.List;

import com.springrest.springrest.entities.Patient;


public interface IPatientServicable {
	
	public List<Patient> getAllPatients();
	public Patient updatePatient(Patient p);
	public Patient addPatient(Patient p);
	public void deletePatient(long id);
	public Patient getPatient(long id);
	

}