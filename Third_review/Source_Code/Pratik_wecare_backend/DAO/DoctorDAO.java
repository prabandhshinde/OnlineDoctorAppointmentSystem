package com.springrest.springrest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springrest.springrest.entities.Doctor;

public interface DoctorDAO extends JpaRepository<Doctor, Long>{

	

}
