package project.RestController;

import java.sql.Blob;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.Entity.Clinic_info;
import project.Entity.Doctor_info;
import project.EntityDAO.Doctor_info_DAO;

@CrossOrigin
@RestController
@RequestMapping(path = "/wecare")
public class Doctor_Controller {

	@Autowired
	Doctor_info_DAO dao;
	
	@PostMapping("/adddoctor/{fname}/{lname}/{mob}/{qua}/{uni}/{spec}/{pass}/"
			+ "{licence}/{email}/{password}/{licence_copy}/{image}/{isvalid}/{clinic}/"
			+ "{bdg_details}/{street}/{landmark}/{city}/{district}/{pin}/{contact}")
	public String addDoctor1(@PathVariable int doc_id,@PathVariable String fname,@PathVariable String lname,
			@PathVariable long mob,@PathVariable String qua,@PathVariable String uni,@PathVariable String spec,
			@PathVariable String pass,@PathVariable String licence,@PathVariable String email,@PathVariable String password,
			@PathVariable String licence_copy,@PathVariable String image,@PathVariable boolean isvalid,@PathVariable String clinic,
			@PathVariable String bdg_details,@PathVariable String street,@PathVariable String landmark,@PathVariable String city,
			@PathVariable String district,@PathVariable int pin,@PathVariable long contact)
	{
		Doctor_info doc=new Doctor_info();
		Clinic_info clinic1=new Clinic_info();
		clinic1.setClinic_name(clinic);
		doc.setDoctor_id(doc_id);
		doc.setFirst_name(fname);
		doc.setLast_name(lname);
		doc.setMob_number(mob);
		doc.setEmail(email);
		doc.setQualification(qua);
		doc.setUniversity(uni);
		doc.setSpecilization(spec);
		doc.setPassword(pass);
		doc.setLicence_number(licence);
		doc.setIs_valid(isvalid);
		doc.setClinic(clinic1);
		return dao.addNewDoctor1(doc, clinic1);
	}
	
	
	@GetMapping("/getalldoctor")
	public List<Doctor_info> getAllDoctors()
	{
		return dao.getAllDoctor();
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteDoctor(@PathVariable int id)
	{
		dao.DeleteDoctor(id);
		return "Record Deleted";
	}
	
	
}
