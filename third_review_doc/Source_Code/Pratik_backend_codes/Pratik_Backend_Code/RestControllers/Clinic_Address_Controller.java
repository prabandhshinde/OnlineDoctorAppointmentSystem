package com.springrest.springrest.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.springrest.Service.IClinic_AddressServicable;
import com.springrest.springrest.entities.clinic_Address;

public class Clinic_Address_Controller {
	
	@Autowired
	IClinic_AddressServicable clinic;
	
	@GetMapping("/get_clinic_address/{id}")
	public clinic_Address getClinicAddress(@PathVariable String id)
	{
		return clinic.getClinicAddress(Long.parseLong(id));
		
	}
	
	@GetMapping("/get_all_clinic_address")
	public List<clinic_Address> getAllClinicAddress()
	{
		return clinic.getallClinicAddress();
	}
	
	
	@PostMapping("/add_clinic_address")
	public clinic_Address addPatient(@RequestBody clinic_Address addr )
	{
		return clinic.addClinicAddress(addr);
	}
	

	@PutMapping("/update_clinic_address")
	public clinic_Address updatePatient(@RequestBody clinic_Address addr )
	{
		return clinic.updateClinicAddress(addr);
	}
	
	
	@DeleteMapping("/delete_clinic_address/{id}")
	public void deleteClinicAddress(@PathVariable String id)
	{
		clinic.deleteClinicAddress(Long.parseLong(id));
	}
	

}
