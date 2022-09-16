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

import com.springrest.springrest.Service.Created_Sub_Slot_SaverImpl;
import com.springrest.springrest.entities.Created_Sub_Slot_Saver;

@RestController
public class Created_Sub_Slot_Saver_Controller {
	
	
	@Autowired
	Created_Sub_Slot_SaverImpl sub_slot;
	
	@GetMapping("/get_sub_slot/{id}")
	public Created_Sub_Slot_Saver getSubSlot(@PathVariable String id)
	{
		return sub_slot.getSubSlot(Long.parseLong(id));
		
	}
	
	@GetMapping("/get_sub_slot")
	public List<Created_Sub_Slot_Saver> getAllSubSlots()
	{
		return sub_slot.getallSubSlots();
	}
	
	
	@PostMapping("/add_sub_slot")
	public Created_Sub_Slot_Saver addSubSlot(@RequestBody Created_Sub_Slot_Saver d )
	{
		return sub_slot.addSubSlots(d);
	}
	

	@PutMapping("/update_sub_slot")
	public Created_Sub_Slot_Saver updateSubSlot(@RequestBody Created_Sub_Slot_Saver slot )
	{
		return sub_slot.updateSubSlot(slot);
	}
	
	
	@DeleteMapping("/delete_sub_slot/{id}")
	public String deleteSubSlot(@PathVariable String id)
	{
		return sub_slot.deleteSubSlot(Long.parseLong(id));
		
	}
	

}
