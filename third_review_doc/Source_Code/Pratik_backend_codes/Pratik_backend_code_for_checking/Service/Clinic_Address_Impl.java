package com.springrest.springrest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.DAO.IClinic_AddressDAO;
import com.springrest.springrest.entities.clinic_Address;


@Service
public class Clinic_Address_Impl implements IClinic_AddressServicable{

	@Autowired
	IClinic_AddressDAO clinic;
	
	@Override
	public List<clinic_Address> getallClinicAddress() {
		
		return clinic.findAll();
	}

	@Override
	public clinic_Address getClinicAddress(long id) {

		return clinic.getReferenceById(id);
	}

	@Override
	public clinic_Address addClinicAddress(clinic_Address addr) {
		
		return clinic.save(addr);
	}

	@Override
	public clinic_Address updateClinicAddress(clinic_Address addr) {
		
		return clinic.save(addr);
	}

	@Override
	public String deleteClinicAddress(long id) {

		clinic_Address addr = clinic.getReferenceById(id);
		clinic.delete(addr);
		return id+" clinic Address Deleted";
	}
	

}