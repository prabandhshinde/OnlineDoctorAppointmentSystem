package project.repositories;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import project.Entity.CreatedSubSlotSaver;


@Repository
public interface ICreatedSubSlotSaverDAO extends JpaRepository<CreatedSubSlotSaver, Long>{

	@Query(value = "from project.Entity.CreatedSubSlotSaver p where p.slot_start_time= :slot_time and p.ref_doctor_id= :doctor_id")
	public abstract CreatedSubSlotSaver findSlot(@Param("doctor_id") long doctor_id,@Param("slot_time") LocalTime slot_time);
	
	@Query(value = "from project.Entity.CreatedSubSlotSaver p where p.ref_doctor_id= :doctor_id and p.slot_Date= :slot_date")
	public abstract List<CreatedSubSlotSaver> findDoctor(@Param("doctor_id") long doctor_id,@Param("slot_date") Date date);
	
	
	@Query(value = "from project.Entity.CreatedSubSlotSaver p where p.ref_patient_id= :pid")
	public abstract List<CreatedSubSlotSaver> findPatientslot(@Param("pid") long patient_id);
	
}
