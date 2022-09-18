package com.springrest.springrest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.Patient;


@Repository
public interface IPatientDAO extends JpaRepository<Patient, Long> {
	

}


