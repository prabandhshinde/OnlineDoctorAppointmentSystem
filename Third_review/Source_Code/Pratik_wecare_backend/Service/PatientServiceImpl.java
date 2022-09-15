package com.springrest.springrest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.DAO.PatientDAO;
import com.springrest.springrest.entities.Patient;


@Service
public class PatientServiceImpl implements IPatientServicable {

	@Autowired
	PatientDAO dao;
	
	@Override
	public Patient getPatient(long id) {
		
		return dao.getReferenceById(id);
	}

	@Override
	public List<Patient> getAllPatients() {
		
		return dao.findAll();
	}

	@Override
	public Patient updatePatient(Patient p) {

		dao.save(p);
		return null;
	}

	@Override
	public Patient addPatient(Patient p) {
		dao.save(p);
		return p;
	}

	@Override
	public void deletePatient(long id) {
		
		Patient p = dao.getReferenceById(id);
		dao.delete(p);
	}

	

}
