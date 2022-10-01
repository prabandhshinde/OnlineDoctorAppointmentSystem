package com.springrest.springrest.Service;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.DAO.IDoctorScheduledSlotsDAO;
import com.springrest.springrest.entities.Created_Sub_Slot_Saver;
import com.springrest.springrest.entities.doctorScheduledSlots;

@Service
public class DoctorScheduledSlotsImpl implements IdoctorScheduledSlotsServicable{

	@Autowired
	IDoctorScheduledSlotsDAO scheduled_slots;
	
	ArrayList<Created_Sub_Slot_Saver> slot_list=new ArrayList<>();
	
	Created_Sub_Slot_Saver sub_slot=new Created_Sub_Slot_Saver();
	Created_Sub_Slot_Saver sub_slot1=new Created_Sub_Slot_Saver();
	
	Time start_time_obj;
	Time end_time_obj;
	
	@Autowired
	Created_Sub_Slot_SaverImpl slot_saver;
	
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
		
		 
		//------------------------------ Working Code with hard coded values for single obj entry-------------------------------------------------------
		Time start_time = slot.getStart_time();
		Time buffer_time =slot.getBuffer_time();
		
		int hr = start_time.getHours();
		int b_hr = buffer_time.getHours();
		
		int min = start_time.getMinutes();
		int b_min = buffer_time.getMinutes();
		
		int sec = start_time.getSeconds();
		int b_sec = buffer_time.getSeconds();
		
		//---------------------------------------------------------------------------------------------
		
		start_time_obj = start_time;
		end_time_obj=start_time;
//		end_time_obj.setMinutes(b_min+min);
//		end_time_obj.setSeconds(b_sec+sec);
		
		
		
		sub_slot.setSlot_start_time(start_time_obj);
		sub_slot.setSlot_end_time(end_time_obj);
		
		sub_slot.setRef_doctor_id(1);
		sub_slot.setRef_patient_id(1);
		sub_slot.setIs_booked(false);
		
		sub_slot1.setSlot_start_time(start_time_obj);
		sub_slot1.setSlot_end_time(end_time_obj);
		
		sub_slot1.setRef_doctor_id(1);
		sub_slot1.setRef_patient_id(1);
		sub_slot1.setIs_booked(false);
		
		this.slot_list.add(sub_slot);
		this.slot_list.add(sub_slot1);
		
		
		
		System.out.println(hr);
		
		slot.setSlot_list(slot_list);
		
		scheduled_slots.save(slot);
		return slot;
		
	}


	@Override
	public doctorScheduledSlots updateDoctorScheduledSlots(doctorScheduledSlots slot) {
		
		scheduled_slots.save(slot);
		return null;
	}


	@Override
	public String deleteDoctorScheduledSlots(long id) {

	 doctorScheduledSlots slot = scheduled_slots.getReferenceById(id);
	 scheduled_slots.delete(slot);
	 return "Doctor Scheduled Slot with id "+id+" Deleted";
		
	}

}
