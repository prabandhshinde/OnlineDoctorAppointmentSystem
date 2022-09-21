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

import project.Entity.Patient_info;
import project.EntityDAO.Patient_info_DAO;



@CrossOrigin
@RestController
@RequestMapping(path = "/wecare")
public class Patient_Controller {

	@Autowired
	Patient_info_DAO dao;
	
	@GetMapping("/patient_info")
	public List<Patient_info> getAll()
	{
		return dao.getPatientData();
	}
	
	@PostMapping("/addpatient")
	public String SavePatient(@RequestBody Patient_info user)
	{
		return dao.addPatientData(user);
	}
	
	@PutMapping("/updatepatient")
	public String updatePatient(@RequestBody Patient_info user)
	{
		return dao.UpdatePatientData(user);
	}
	
	@DeleteMapping("/deletepatient/{id}")
	public String updatePatient(@PathVariable int id)
	{
		return dao.DaletePatientData(id);
	}
	
	@GetMapping("/patientbyid/{id}")
	public Patient_info getbyid(@PathVariable int id)
	{
		return dao.findpatientbyid(id);
	}
	
	
}
