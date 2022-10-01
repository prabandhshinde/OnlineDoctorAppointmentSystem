package com.springrest.springrest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.DAO.IBooked_SlotsDAO;
import com.springrest.springrest.entities.Booked_Slots;

@Service
public class Booked_SlotImpl implements IBooked_SlotsServicable {

	@Autowired
	IBooked_SlotsDAO booked_slot;
	
	@Override
	public List<Booked_Slots> getAllBookedSlots() {
		return booked_slot.findAll();
	}

	@Override
	public Booked_Slots getBookedSlot(long id) {
		return booked_slot.getReferenceById(id);
	}
	
	@Override
	public Booked_Slots updateBookedSlot(Booked_Slots slot) {
		
		return booked_slot.save(slot);
	}

	@Override
	public Booked_Slots addBookedSlot(Booked_Slots slot) {
		
		return booked_slot.save(slot);
	}

	@Override
	public String deleteBookedSlot(long id) {

	 Booked_Slots slot	=booked_slot.getReferenceById(id);
		booked_slot.delete(slot);
		return id+" Slot Deleted";
	}
	

}