package com.springrest.springrest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.DAO.ICreated_Sub_Slot_SaverDAO;
import com.springrest.springrest.entities.Created_Sub_Slot_Saver;

@Service
public class Created_Sub_Slot_SaverImpl implements ICreated_Sub_Slot_SaverServicable{

	@Autowired
	ICreated_Sub_Slot_SaverDAO sub_slot; 
	
	@Override
	public List<Created_Sub_Slot_Saver> getallSubSlots() {

		return sub_slot.findAll();
	}

	@Override
	public Created_Sub_Slot_Saver getSubSlot(long id) {
		return sub_slot.getReferenceById(id);
	}

	@Override
	public Created_Sub_Slot_Saver addSubSlots(Created_Sub_Slot_Saver slot) {
		
		return sub_slot.save(slot);
	}

	@Override
	public Created_Sub_Slot_Saver updateSubSlot(Created_Sub_Slot_Saver slot) {

		return sub_slot.save(slot);
	}

	@Override
	public String deleteSubSlot(long id) {
		Created_Sub_Slot_Saver slot = sub_slot.getReferenceById(id);
		sub_slot.delete(slot);
		return "Sub Slot with Id "+id+" is Deleted";
	}

}
