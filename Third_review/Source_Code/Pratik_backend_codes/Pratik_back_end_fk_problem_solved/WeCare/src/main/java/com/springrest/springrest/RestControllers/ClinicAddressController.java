package com.springrest.springrest.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.springrest.springrest.Service.IClinicAddressServicable;
import com.springrest.springrest.entities.ClinicAddress;

public class ClinicAddressController {
	
	@Autowired
	IClinicAddressServicable clinic;
	
	@GetMapping("/get_clinic_address/{id}")
	public ClinicAddress getClinicAddress(@PathVariable String id)
	{
		return clinic.getClinicAddress(Long.parseLong(id));
		
	}
	
	@GetMapping("/get_all_clinic_address")
	public List<ClinicAddress> getAllClinicAddress()
	{
		return clinic.getallClinicAddress();
	}
	
	
	@PostMapping("/add_clinic_address")
	public ClinicAddress addPatient(@RequestBody ClinicAddress addr )
	{
		return clinic.addClinicAddress(addr);
	}
	

	@PutMapping("/update_clinic_address")
	public ClinicAddress updatePatient(@RequestBody ClinicAddress addr )
	{
		return clinic.updateClinicAddress(addr);
	}
	
	
	@DeleteMapping("/delete_clinic_address/{id}")
	public void deleteClinicAddress(@PathVariable String id)
	{
		clinic.deleteClinicAddress(Long.parseLong(id));
	}
	

}
