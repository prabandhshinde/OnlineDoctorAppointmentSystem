package com.springrest.springrest.Service;

import java.util.List;

import com.springrest.springrest.entities.BookedSlots;

public interface IBooked_SlotsServicable {

	public List<BookedSlots> getAllBookedSlots();
	public BookedSlots updateBookedSlot(BookedSlots slot);
	public BookedSlots addBookedSlot(BookedSlots slot );
	public String deleteBookedSlot(long id);
	public BookedSlots getBookedSlot(long id);
	
}
