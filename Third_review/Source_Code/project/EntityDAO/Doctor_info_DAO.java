package project.EntityDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import project.Entity.Clinic_info;
import project.Entity.Doctor_info;
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
	
}
