package com.springrest.springrest.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springrest.springrest.entities.Doctor;

@Repository
public interface IDoctorDAO extends JpaRepository<Doctor, Long>{

	

}
