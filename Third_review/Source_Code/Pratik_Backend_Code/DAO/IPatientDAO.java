package com.springrest.springrest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Patient;

public interface IPatientDAO extends JpaRepository<Patient, Long> {
	

}


