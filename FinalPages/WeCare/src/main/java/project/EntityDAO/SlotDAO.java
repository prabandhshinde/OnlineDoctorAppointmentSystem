package project.EntityDAO;

import java.sql.Date;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import project.Entity.CreatedSubSlotSaver;
import project.Entity.Doctor_info;
import project.model.HistoryPatient;
import project.repositories.ICreatedSubSlotSaverDAO;


@Repository
public class SlotDAO {

	@Autowired
	ICreatedSubSlotSaverDAO sub_slot;
	
	
	@Autowired
	Doctor_info_DAO dao;
	
	
	public List<CreatedSubSlotSaver> getAllslot()
	{
		return sub_slot.findAll();
	}
	
	public List<CreatedSubSlotSaver> getAllslotbyid(long id,String date)
	{
		return sub_slot.findDoctor(id,Date.valueOf(date));
	}
	
	public String AddSlot(CreatedSubSlotSaver slot)
	{
		sub_slot.save(slot);
		return "Record Inserted";
	}
	
	public String setSlot(String time,int doctor_id,int patient_id)
	{
		String[]time1=time.split(":");
		
		CreatedSubSlotSaver slot= sub_slot.findSlot(doctor_id,LocalTime.of(Integer.parseInt(time1[0]),Integer.parseInt(time1[1]),Integer.parseInt(time1[2])));
		slot.setIs_booked(true);
		slot.setRef_patient_id(patient_id);
		sub_slot.save(slot);
		return "Record Inserted";
	}
	
	
	public List<HistoryPatient> findPatient(int patient_id)
	{
		List<HistoryPatient>doctors=new ArrayList<HistoryPatient>();
		List<CreatedSubSlotSaver>list=sub_slot.findPatientslot((long)patient_id);
		for(CreatedSubSlotSaver slot : list)
		{
			HistoryPatient patient=new HistoryPatient();
			patient.setSlotid(slot.getCreated_slot_id());
			patient.setSlotDate(slot.getSlot_Date());
			patient.setSlotTime(slot.getSlot_start_time());
			Doctor_info doc=dao.getDoctorById(slot.getRef_doctor_id());
			patient.setDoctorName(doc.getFirst_name()+" "+doc.getLast_name());
			patient.setClinicName(doc.getClinic().getClinic_name());
			doctors.add(patient);
		}
		return doctors;
	}
	
}
