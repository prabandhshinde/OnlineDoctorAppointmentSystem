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

import com.springrest.springrest.Service.Booked_SlotImpl;
import com.springrest.springrest.entities.Booked_Slots;

@RestController
public class Booked_Slots_Controller {

	@Autowired
	Booked_SlotImpl booked_slot;
	
	@GetMapping("/get_boooked_slot/{id}")
	public Booked_Slots getBookedSlot(@PathVariable String id)
	{
		return booked_slot.getBookedSlot(Long.parseLong(id));
	}
	
	@GetMapping("/get_all_booked_slots")
	public List<Booked_Slots> getAllBookedSlots()
	{
		return booked_slot.getAllBookedSlots();
	}
	
	
	@PostMapping("/add_sooked_slot")
	public Booked_Slots addBookedSlot(@RequestBody Booked_Slots slot )
	{
		return booked_slot.addBookedSlot(slot);
	}
	

	@PutMapping("/update_booked_slot")
	public Booked_Slots updatePatient(@RequestBody Booked_Slots slot )
	{
		return booked_slot.updateBookedSlot(slot);
	}
	
	
	@DeleteMapping("/delete_booked_slot/{id}")
	public void deletePatient(@PathVariable String id)
	{
		booked_slot.deleteBookedSlot(Long.parseLong(id));
	}
	
	
	 
}
