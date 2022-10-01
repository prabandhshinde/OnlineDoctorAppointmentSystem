package com.springrest.springrest.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.Service.BookedSlotImpl;
import com.springrest.springrest.entities.BookedSlots;

@RestController
public class BookedSlotsController {

	@Autowired
	BookedSlotImpl booked_slot;
	
	@GetMapping("/get_boooked_slot/{id}")
	public BookedSlots getBookedSlot(@PathVariable String id)
	{
		return booked_slot.getBookedSlot(Long.parseLong(id));
	}
	
	@GetMapping("/get_all_booked_slots")
	public List<BookedSlots> getAllBookedSlots()
	{
		return booked_slot.getAllBookedSlots();
	}
	
	
	@PostMapping("/add_sooked_slot")
	public BookedSlots addBookedSlot(@RequestBody BookedSlots slot )
	{
		return booked_slot.addBookedSlot(slot);
	}
	

	@PutMapping("/update_booked_slot")
	public BookedSlots updatePatient(@RequestBody BookedSlots slot )
	{
		return booked_slot.updateBookedSlot(slot);
	}
	
	
	@DeleteMapping("/delete_booked_slot/{id}")
	public void deletePatient(@PathVariable String id)
	{
		booked_slot.deleteBookedSlot(Long.parseLong(id));
	}
	
	
	 
}
