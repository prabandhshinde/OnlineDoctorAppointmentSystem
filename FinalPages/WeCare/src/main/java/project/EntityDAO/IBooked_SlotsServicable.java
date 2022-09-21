package project.EntityDAO;

import java.util.List;

import project.Entity.BookedSlots;



public interface IBooked_SlotsServicable {

	public List<BookedSlots> getAllBookedSlots();
	public BookedSlots updateBookedSlot(BookedSlots slot);
	public BookedSlots addBookedSlot(BookedSlots slot );
	public String deleteBookedSlot(long id);
	public BookedSlots getBookedSlot(long id);
	
}
