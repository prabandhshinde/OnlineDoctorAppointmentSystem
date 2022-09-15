package com.springrest.springrest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.DAO.DoctorDAO;
import com.springrest.springrest.entities.Doctor;

@Service
public class DoctorServiceImpl implements IDoctorServicable {

	@Autowired
	DoctorDAO dr_dao;

	@Autowired
	Clinic_Address_Impl clinic;

	@Override
	public Doctor getDoctor(long id) {

		Doctor dr = dr_dao.getReferenceById(id);
		return dr;
	}

	@Override
	public List<Doctor> getAllDoctors() {
		List<Doctor> list = dr_dao.findAll();
		return list;
	}

	@Override
	public Doctor updateDoctor(Doctor dr) {


		Doctor d = dr_dao.save(dr);
		return d;
	}

	@Override
	public Doctor addDoctor(Doctor dr) {

		dr_dao.save(dr);

		return dr;
	}

	@Override
	public void deleteDoctor(long id) {

		Doctor dr = dr_dao.getReferenceById(id);
		dr_dao.delete(dr);
	}



}
