package com.springrest.springrest.Service;

import java.util.List;

import com.springrest.springrest.entities.Booked_Slots;

public interface IBooked_SlotsServicable {

	public List<Booked_Slots> getAllBookedSlots();
	public Booked_Slots updateBookedSlot(Booked_Slots slot);
	public Booked_Slots addBookedSlot(Booked_Slots slot );
	public String deleteBookedSlot(long id);
	public Booked_Slots getBookedSlot(long id);
	
}
