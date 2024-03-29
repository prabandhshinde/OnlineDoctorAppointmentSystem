package com.springrest.springrest.Service;

import java.util.List;

import com.springrest.springrest.entities.doctorScheduledSlots;

public interface IdoctorScheduledSlotsServicable {
	
	public List<doctorScheduledSlots> getallDoctorScheduledSlots();
	public doctorScheduledSlots getDoctorScheduledSlot(long id);
	public doctorScheduledSlots addDoctorScheduledSlots(doctorScheduledSlots slot);
	public doctorScheduledSlots updateDoctorScheduledSlots(doctorScheduledSlots slot);
	public String deleteDoctorScheduledSlots(long id);

}

