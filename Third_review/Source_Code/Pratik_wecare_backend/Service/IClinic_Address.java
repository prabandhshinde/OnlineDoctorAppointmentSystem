package com.springrest.springrest.Service;

import java.util.List;

import com.springrest.springrest.entities.clinic_Address;

public interface IClinic_Address {

	public List<clinic_Address> getallClinicAddress();
	public clinic_Address getClinicAddress(long id);
	public clinic_Address addClinicAddress(clinic_Address clinic);
	public clinic_Address updateClinicAddress(clinic_Address clinic);
	public void deleteClinicAddress(long id);
}
