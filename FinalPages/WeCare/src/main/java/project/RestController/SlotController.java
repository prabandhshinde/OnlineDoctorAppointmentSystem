package project.RestController;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.Entity.CreatedSubSlotSaver;

import project.EntityDAO.CreatedSubSlotSaverImpl;
import project.EntityDAO.SlotDAO;
import project.model.HistoryPatient;

@CrossOrigin
@RestController
@RequestMapping(path = "/wecare")
public class SlotController {
	
	@Autowired
	private SlotDAO repo;
	
	
	@GetMapping("/slots")
	public List<CreatedSubSlotSaver> getAllSlot()
	{
		return repo.getAllslot();
	}
	
	@PostMapping("/addslots")
	public String setAllSlot(@RequestBody CreatedSubSlotSaver slot)
	{
		return repo.AddSlot(slot);
	}
	
	@GetMapping("/setslot/{time}/{doctor_id}/{patient_id}")
	public String setAllSlot(@PathVariable String time,@PathVariable int doctor_id,@PathVariable int patient_id)
	{
		return repo.setSlot(time, doctor_id,patient_id);
	}
	
	@GetMapping("/getslot/{doctor_id}/{date}")
	public List<CreatedSubSlotSaver> getSlotbyid(@PathVariable long doctor_id,@PathVariable String date)
	{
		return repo.getAllslotbyid(doctor_id,date);
	}
	
	@GetMapping("/history/{patient_id}")
	public List<HistoryPatient> getPatientHistory(@PathVariable int patient_id)
	{
		return repo.findPatient(patient_id);
	}

}
