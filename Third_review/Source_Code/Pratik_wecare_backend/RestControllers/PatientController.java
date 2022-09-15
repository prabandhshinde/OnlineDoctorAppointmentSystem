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

import com.springrest.springrest.Service.PatientServiceImpl;
import com.springrest.springrest.entities.Patient;

@RestController
public class PatientController {
	
	@Autowired
	PatientServiceImpl patientService;
	
	
	@GetMapping("/getpatients")
	public List<Patient> getpatients()
	{
		return patientService.getAllPatients();
	}
	
	@GetMapping("/getpatient/{id}")
	public Patient getOnePatient(@PathVariable String id)
	{
		return patientService.getPatient(Long.parseLong(id)); 
	}
	
	@PostMapping("/addpatient")
	public Patient addPatient(@RequestBody Patient p )
	{
		patientService.addPatient(p);
		return p;
	}
	
	@PutMapping("/updatePatient")
	public Patient updatePatient(@RequestBody Patient p )
	{
		patientService.updatePatient(p);
		return p;
	}
	
	@DeleteMapping("/deletePatient/{id}")
	public void deletePatient(@PathVariable String id)
	{
		patientService.deletePatient(Long.parseLong(id));
	}

}


