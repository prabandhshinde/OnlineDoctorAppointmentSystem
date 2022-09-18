package com.springrest.springrest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.DAO.IClinicAddressDAO;
import com.springrest.springrest.entities.ClinicAddress;


@Service
public class ClinicAddressImpl implements IClinicAddressServicable{

	@Autowired
	IClinicAddressDAO clinic;
	
	@Override
	public List<ClinicAddress> getallClinicAddress() {
		
		return clinic.findAll();
	}

	@Override
	public ClinicAddress getClinicAddress(long id) {

		return clinic.getReferenceById(id);
	}

	@Override
	public ClinicAddress addClinicAddress(ClinicAddress addr) {
		
		return clinic.save(addr);
	}

	@Override
	public ClinicAddress updateClinicAddress(ClinicAddress addr) {
		
		return clinic.save(addr);
	}

	@Override
	public String deleteClinicAddress(long id) {

		ClinicAddress addr = clinic.getReferenceById(id);
		clinic.delete(addr);
		return id+" clinic Address Deleted";
	}
	

}