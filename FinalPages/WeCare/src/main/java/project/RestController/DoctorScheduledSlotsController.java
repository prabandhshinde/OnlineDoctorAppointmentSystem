package project.RestController;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.Entity.doctorScheduledSlots;
import project.EntityDAO.DoctorScheduledSlotsImpl;

@CrossOrigin
@RestController
@RequestMapping(path = "/wecare")
public class DoctorScheduledSlotsController {
	
	@Autowired
	DoctorScheduledSlotsImpl slot;
	
	@GetMapping("/getallDoctorScheduledSlots")
	public List<doctorScheduledSlots> getallDoctorScheduledSlots()
	{
		List<doctorScheduledSlots> list = slot.getallDoctorScheduledSlots();
		return list;
	}
	
	@GetMapping("/get_doctor_scheduled_slot/{id}")
	public doctorScheduledSlots getDoctorScheduledSlot(@PathVariable String id)
	{
		return slot.getDoctorScheduledSlot(Long.parseLong(id));
	}
	
	@PostMapping("/add_doctor_scheduling_slot")
	public doctorScheduledSlots addDoctorScheduledSlots(@RequestBody doctorScheduledSlots dr_slot)
	{
		return slot.addDoctorScheduledSlots(dr_slot);
	}
	
	@PutMapping("/update_doctor_scheduling_slot")
	public doctorScheduledSlots updateDoctorScheduledSlots(@RequestBody doctorScheduledSlots dr_slot)
	{
		return slot.updateDoctorScheduledSlots(dr_slot);
	}
	
	@DeleteMapping("/delete_doctor_scheduling_slot/{id}")
	public void deleteDoctorScheduledSlots(@PathVariable String id)
	{
		slot.deleteDoctorScheduledSlots(Long.parseLong(id));
	}
	
	

}
