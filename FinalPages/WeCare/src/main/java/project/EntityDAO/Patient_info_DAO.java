package project.EntityDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import project.Entity.Patient_info;

@Repository
public class Patient_info_DAO {

	@Autowired
	project.repositories.Patient_repository repo;
	
	public List<Patient_info> getPatientData()
	{
		List<Patient_info> list=repo.findAll();
		return list;
	}
	
	
	public String addPatientData(Patient_info user)
	{
		repo.save(user);
		return "Record Inserted";
	}
	
	public String UpdatePatientData(Patient_info user)
	{
		Optional<Patient_info> list=repo.findById(user.getPatient_id());
		if(list!=null) {
		Patient_info olduser=list.get();
		olduser.setFirst_name(user.getFirst_name());
		olduser.setLast_name(user.getLast_name());
		olduser.setMob_number(user.getMob_number());
		olduser.setDate_of_birth(user.getDate_of_birth());
		olduser.setGender(user.getGender());
		olduser.setBlood_group(user.getBlood_group());
		repo.save(olduser);
		return "Record Updated";
		}else
		{
			return "Record Not Found";
		}
	}
	
	public String DaletePatientData(int id)
	{
		Optional<Patient_info> list=repo.findById(id);
		if(list!=null)
		{
		Patient_info olduser=list.get();
		repo.delete(olduser);
		return "Record Deleted";
		}else
		{
			return "Record Not Found";
		}
	}
	
	public String forgetpasspatient(int id,String newpassword)
	{
		Patient_info patient=repo.findById(id).get();
		patient.setPassword(newpassword);
		repo.save(patient);
		return "password changed";
	}
	
	public Patient_info findpatientbyid(int id)
	{
		return repo.findById(id).get();
	}
	
}
