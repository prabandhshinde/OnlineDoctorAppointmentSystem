package com.springrest.springrest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.DAO.doctorScheduledSlotsDAO;
import com.springrest.springrest.entities.doctorScheduledSlots;

@Service
public class DoctorScheduledSlotsImpl implements IdoctorScheduledSlots{

	@Autowired
	doctorScheduledSlotsDAO scheduled_slots;
	
	
	@Override
	public List<doctorScheduledSlots> getallDoctorScheduledSlots() {

		List<doctorScheduledSlots> list =scheduled_slots.findAll();
		return list;
	}


	@Override
	public doctorScheduledSlots getDoctorScheduledSlot(long id) {
	 
		doctorScheduledSlots slot = scheduled_slots.getReferenceById(id);
		return slot;
	}


	@Override
	public doctorScheduledSlots addDoctorScheduledSlots(doctorScheduledSlots slot) {
		
		scheduled_slots.save(slot);
		return slot;
	}


	@Override
	public doctorScheduledSlots updateDoctorScheduledSlots(doctorScheduledSlots slot) {
		
		scheduled_slots.save(slot);
		return null;
	}


	@Override
	public void deleteDoctorScheduledSlots(long id) {

	 doctorScheduledSlots slot = scheduled_slots.getReferenceById(id);
	 scheduled_slots.delete(slot);
		
	}

	
	
	
	
	
}
