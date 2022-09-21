package project.RestController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.Entity.Doctor_info;
import project.Entity.Patient_info;
import project.EntityDAO.Doctor_info_DAO;
import project.EntityDAO.Patient_info_DAO;
import project.model.Forgetpassword;
import project.model.LoginModel;

@CrossOrigin
@RestController
@RequestMapping(path = "/wecare")
public class LoginController {
	
	@Autowired
	private Doctor_info_DAO doc;
	
	@Autowired
	private Patient_info_DAO patient;
	
	@PostMapping("/login/doctor")
	public Object doctorLogin(@RequestBody LoginModel model)
	{
		String status=null;
		Object obj=null;
		List<Doctor_info>list=doc.getAllDoctor();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getMob_number()==model.getMob())			{
						if(list.get(i).getPassword().equals(model.getPassword()))
						{
							obj=list.get(i);
							break;
						}else
						{
							status="password incorrect";
							break;
						}
			}else
			{
				status="incorrect username";
			}
		}
		if(obj==null)
		{
			return status;
		}else
		{
			return obj;
		}
		
	}
	
	
	@PostMapping("/login/patient")
	public Object patientLogin(@RequestBody LoginModel model)
	{
		String status=null;
		Object obj=null;
		List<Patient_info>list=patient.getPatientData();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getMob_number()==model.getMob())
			{
						if(list.get(i).getPassword().equals(model.getPassword()))
						{
							obj=list.get(i);
							break;
						}else
						{
							status="password incorrect";
							break;
						}
			}else
			{
				status="incorrect username";
			}
		}
		if(obj==null)
		{
			return status;
		}else
		{
			return obj;
		}
	}
	
	
	@PostMapping("/forgetpassword/doctor")
	public String forgetpassworddoctor(@RequestBody Forgetpassword pass)
	{
		String status="";
		List<Doctor_info>list=doc.getAllDoctor();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getMob_number()==pass.getMob())
			{
				long id=list.get(i).getDoctor_id();
				status=doc.forgetpassdoctor(id,pass.getPassword());
				break;
						
			}else
			{
				status="incorrect username";
				break;
			}
		}
		return status;
	}
	
	@PostMapping("/forgetpassword/patient")
	public String forgetpasswordpatient(@RequestBody Forgetpassword pass)
	{
		String status="";
		List<Patient_info>list=patient.getPatientData();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getMob_number()==pass.getMob())
			{
				int id=list.get(i).getPatient_id();
				status=doc.forgetpassdoctor(id,pass.getPassword());
				break;
						
			}else
			{
				status="incorrect username";
				break;
			}
		}
		return status;
	}
	
}
