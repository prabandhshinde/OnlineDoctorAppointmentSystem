package project.RestController;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import project.Entity.Doctor_info;
import project.Entity.Patient_info;
import project.EntityDAO.Doctor_info_DAO;
import project.EntityDAO.Patient_info_DAO;
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
	public String doctorLogin(@RequestBody LoginModel model)
	{
		String status="";
		List<Doctor_info>list=doc.getAllDoctor();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getMob_number()==model.getMob())			{
						if(list.get(i).getPassword().equals(model.getPassword()))
						{
							status=""+list.get(i).getDoctor_id();
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
		return status;
	}
	
	
	@PostMapping("/login/patient")
	public String patientLogin(@RequestBody LoginModel model)
	{
		String status="";
		Patient_info user=null;
		List<Patient_info>list=patient.getPatientData();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getMob_number()==model.getMob())
			{
						if(list.get(i).getPassword().equals(model.getPassword()))
						{
							status=""+list.get(i).getPatient_id();
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
		return status;
	}
	
	
	@PostMapping("/forgetpassword/doctor/{username}/{oldpassword}/{newpassword}/")
	public String forgetpassworddoctor(@PathVariable String username,@PathVariable String oldpassword,@PathVariable String newpassword)
	{
		String status="";
		List<Doctor_info>list=doc.getAllDoctor();
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getEmail().equals(username))
			{
						if(list.get(i).getPassword().equals(oldpassword))
						{
							int id=list.get(i).getDoctor_id();
							status=doc.forgetpassdoctor(id,newpassword);
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
		return status;
	}
	
	@PostMapping("/login1/doctor")
	public String loginnew(@RequestBody LoginModel model)
	{
		long user=9665340359l;
		String status="";
		if(user==model.getMob())
		{
					if("Ankit".equals(model.getPassword()))
					{
						status=""+1;	
					}else
					{
						status="password incorrect";	
					}
		}else
		{
			status="incorrect username";
		}
		return status;
	}

}
