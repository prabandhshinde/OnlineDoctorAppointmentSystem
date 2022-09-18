package com.springrest.springrest.Service;

import java.util.List;

import com.springrest.springrest.entities.ClinicAddress;

public interface IClinicAddressServicable {

	public List<ClinicAddress> getallClinicAddress();
	public ClinicAddress getClinicAddress(long id);
	public ClinicAddress addClinicAddress(ClinicAddress clinic);
	public ClinicAddress updateClinicAddress(ClinicAddress clinic);
	public String deleteClinicAddress(long id);
}
