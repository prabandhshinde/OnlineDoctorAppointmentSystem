package project.EntityDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import project.Entity.Clinic_info;
import project.Entity.Doctor_info;
import project.Entity.Patient_info;
import project.repositories.Clinic_repository;
import project.repositories.Doctor_repository;

@Repository
public class Doctor_info_DAO {

	@Autowired
	private Doctor_repository doctor_repo;
	
	@Autowired
	private Clinic_repository clinic_repo;
	
	
	 public List<Doctor_info> getAllDoctor()
	 {
		 List<Doctor_info> list=doctor_repo.findAll();
		 return list;
	 }
	 
	 public List<Clinic_info> getAllclinic()
	 {
		 List<Clinic_info> list=clinic_repo.findAll();
		 return list;
	 }
	 
	 public String addNewDoctor1(Doctor_info doc,Clinic_info clinic)
	 {
		 clinic_repo.save(clinic);
		 doctor_repo.save(doc);
		 return "Record Inserted";
	 }
	 
	 
	 public String DeleteDoctor(int id)
	 {
		 Doctor_info doc=doctor_repo.findById(id).get();
		 doctor_repo.delete(doc);
		 return "Record Deleted";
	 }
	 
	 public String updateDoctor(Doctor_info doc)
	 {
		 Doctor_info doctor=doctor_repo.findById(doc.getDoctor_id()).get();
		 doctor.setClinic(doc.getClinic());
		 doctor.setEmail(doc.getEmail());
		 doctor.setMob_number(doc.getMob_number());
		 doctor.setLicence_number(doc.getLicence_number());
		 doctor.setDoctor_id(doc.getDoctor_id());
		 doctor.setFirst_name(doc.getFirst_name());
		 doctor.setLast_name(doc.getLast_name());
		 doctor.setImage(doc.getImage());
		 doctor.setIs_valid(doc.isIs_valid());
		 doctor.setPassing_year(doc.getPassing_year());
		 doctor.setUniversity(doc.getUniversity());
		 doctor.setSpecilization(doc.getSpecilization());
		 doctor.setLicence_copy(doc.getLicence_copy());
		 
		 doctor_repo.save(doctor);
		 return "Record Updated";
	 }
	 
	 public String forgetpassdoctor(int id,String newpassword)
		{
		 		Doctor_info doct =doctor_repo.findById(id).get();
		 		doct.setPassword(newpassword);
		 		return "password changed";
		}
	
}
