package com.springrest.springrest.Service;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.DAO.ICreatedSubSlotSaverDAO;
import com.springrest.springrest.entities.CreatedSubSlotSaver;
import com.springrest.springrest.entities.doctorScheduledSlots;

@Service
public class CreatedSubSlotSaverImpl implements ICreatedSubSlotSaverServicable{

	@Autowired
	ICreatedSubSlotSaverDAO sub_slot; 
	
	ArrayList<CreatedSubSlotSaver> slot_list = new ArrayList<>();
	
	
	Time start_time_obj;
	Time end_time_obj;
	
	//doctorScheduledSlots slot1= new doctorScheduledSlots();
	
	CreatedSubSlotSaver sub_slot1 = new CreatedSubSlotSaver();
	CreatedSubSlotSaver sub_slot2 = new CreatedSubSlotSaver();
	
	@Override
	public List<CreatedSubSlotSaver> getallSubSlots() {

		return sub_slot.findAll();
	}

	@Override
	public CreatedSubSlotSaver getSubSlot(long id) {
		return sub_slot.getReferenceById(id);
	}

	@Override
	public CreatedSubSlotSaver addSubSlots(doctorScheduledSlots slot1) {
		
		
		
		Time start_time = slot1.getStart_time();
		Time buffer_time =slot1.getBuffer_time();

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



		sub_slot2.setSlot_start_time(start_time_obj);
		sub_slot2.setSlot_end_time(end_time_obj);

		sub_slot2.setRef_doctor_id(1);
		sub_slot2.setRef_patient_id(1);
		sub_slot2.setIs_booked(false);

		sub_slot1.setSlot_start_time(start_time_obj);
		sub_slot1.setSlot_end_time(end_time_obj);

		sub_slot1.setRef_doctor_id(1);
		sub_slot1.setRef_patient_id(1);
		sub_slot1.setIs_booked(false);

		sub_slot1.setDr_scheduled_slot(slot1);
		sub_slot2.setDr_scheduled_slot(slot1);
		
		this.slot_list.add(sub_slot2);
		this.slot_list.add(sub_slot1);


		
		System.out.println(hr);

		slot1.setSlot_list(slot_list);
		
		return sub_slot.save(sub_slot1);
	}

	@Override
	public CreatedSubSlotSaver updateSubSlot(CreatedSubSlotSaver slot) {

		return sub_slot.save(slot);
	}

	@Override
	public String deleteSubSlot(long id) {
		CreatedSubSlotSaver slot = sub_slot.getReferenceById(id);
		sub_slot.delete(slot);
		return "Sub Slot with Id "+id+" is Deleted";
	}

}
