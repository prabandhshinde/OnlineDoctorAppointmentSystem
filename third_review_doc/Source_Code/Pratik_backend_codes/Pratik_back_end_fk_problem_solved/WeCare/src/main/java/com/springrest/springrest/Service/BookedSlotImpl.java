package com.springrest.springrest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.DAO.IBookedSlotsDAO;
import com.springrest.springrest.entities.BookedSlots;

@Service
public class BookedSlotImpl implements IBooked_SlotsServicable {

	@Autowired
	IBookedSlotsDAO booked_slot;
	
	@Override
	public List<BookedSlots> getAllBookedSlots() {
		return booked_slot.findAll();
	}

	@Override
	public BookedSlots getBookedSlot(long id) {
		return booked_slot.getReferenceById(id);
	}
	
	@Override
	public BookedSlots updateBookedSlot(BookedSlots slot) {
		
		return booked_slot.save(slot);
	}

	@Override
	public BookedSlots addBookedSlot(BookedSlots slot) {
		
		return booked_slot.save(slot);
	}

	@Override
	public String deleteBookedSlot(long id) {

	 BookedSlots slot	=booked_slot.getReferenceById(id);
		booked_slot.delete(slot);
		return id+" Slot Deleted";
	}
	

}