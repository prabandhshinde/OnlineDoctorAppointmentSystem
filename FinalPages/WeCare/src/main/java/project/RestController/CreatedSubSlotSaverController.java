package project.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import project.Entity.CreatedSubSlotSaver;
import project.EntityDAO.CreatedSubSlotSaverImpl;



@RestController
public class CreatedSubSlotSaverController {
	
	
	@Autowired
	CreatedSubSlotSaverImpl sub_slot;
	
	@GetMapping("/get_sub_slot/{id}")
	public CreatedSubSlotSaver getSubSlot(@PathVariable String id)
	{
		return sub_slot.getSubSlot(Long.parseLong(id));
		
	}
	
	@GetMapping("/get_sub_slot")
	public List<CreatedSubSlotSaver> getAllSubSlots()
	{
		return sub_slot.getallSubSlots();
	}
	
	
	@PostMapping("/add_sub_slot")
	public CreatedSubSlotSaver addSubSlot(@RequestBody CreatedSubSlotSaver d )
	{
		return sub_slot.addSubSlots(d);
	}
	

	@PutMapping("/update_sub_slot")
	public CreatedSubSlotSaver updateSubSlot(@RequestBody CreatedSubSlotSaver slot )
	{
		return sub_slot.updateSubSlot(slot);
	}
	
	
	@DeleteMapping("/delete_sub_slot/{id}")
	public String deleteSubSlot(@PathVariable String id)
	{
		return sub_slot.deleteSubSlot(Long.parseLong(id));
		
	}
	

}
