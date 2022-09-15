package com.springrest.springrest.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Service.DoctorServiceImpl;
import com.springrest.springrest.entities.Doctor;

@RestController
public class DoctorController {
	
	@Autowired
	DoctorServiceImpl dr_service;
	
	@GetMapping("/getdoctor/{id}")
	public Doctor getDoctor(@PathVariable String id)
	{
		return dr_service.getDoctor(Long.parseLong(id));
		
	}
	
	@GetMapping("/getdoctors")
	public List<Doctor> getAllDoctors()
	{
		return dr_service.getAllDoctors();
	}
	
	
	@PostMapping("/add_doctor")
	public Doctor addPatient(@RequestBody Doctor d )
	{
		return dr_service.addDoctor(d);
	}
	

	@PutMapping("/updateDoctor")
	public Doctor updatePatient(@RequestBody Doctor d )
	{
		return dr_service.updateDoctor(d);
	}
	
	
	@DeleteMapping("/deleteDoctor/{id}")
	public void deletePatient(@PathVariable String id)
	{
		dr_service.deleteDoctor(Long.parseLong(id));
	}
	
	

}
