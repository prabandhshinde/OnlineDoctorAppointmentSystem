package project.Entity;

import java.sql.Date;
import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value= {"handler","hibernateLazyInitializer","FieldHandler"})
public class doctorScheduledSlots {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long slot_id;

	private LocalTime start_time;
	private LocalTime end_time;
	private Date start_date;
	private Date end_date;
	private LocalTime buffer_time;
	private LocalTime avg_patient_check_time;
	private long doctor_id_fk;
	
	@OneToMany(mappedBy = "dr_scheduled_slot",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<CreatedSubSlotSaver> slot_list;
	
	public doctorScheduledSlots() {
		super();
		// TODO Auto-generated constructor stub
	}

	public doctorScheduledSlots(long slot_id, LocalTime start_time, LocalTime end_time, Date start_date, Date end_date,
			LocalTime buffer_time, LocalTime avg_patient_check_time, long doctor_id_fk) {
		super();
		this.slot_id = slot_id;
		this.start_time = start_time;
		this.end_time = end_time;
		this.start_date = start_date;
		this.end_date = end_date;
		this.buffer_time = buffer_time;
		this.avg_patient_check_time = avg_patient_check_time;
		this.doctor_id_fk = doctor_id_fk;
		
		// make a list of created slots
		
//		Created_Slot_Saver slot1 = new Created_Slot_Saver("11:30:00","12:00:00",1,1,false);
//		Created_Slot_Saver slot2 = new Created_Slot_Saver("11:30:00","12:00:00",1,1,false);
//		Created_Slot_Saver slot3 = new Created_Slot_Saver("11:30:00","12:00:00",1,1,false);
		
		//this.slot_list.add(slot1);
//		this.slot_list.add(slot2);
//		this.slot_list.add(slot3);
		
//		for(int i=0; i<3;i++)
//		{
//			
//		}
		
		
	}

	public long getSlot_id() {
		return slot_id;
	}

	public void setSlot_id(long slot_id) {
		this.slot_id = slot_id;
	}

	public LocalTime getStart_time() {
		return start_time;
	}

	public void setStart_time(LocalTime start_time) {
		this.start_time = start_time;
	}

	public LocalTime getEnd_time() {
		return end_time;
	}

	public void setEnd_time(LocalTime end_time) {
		this.end_time = end_time;
	}

	public Date getStart_date() {
		return start_date;
	}

	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}

	public Date getEnd_date() {
		return end_date;
	}

	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}

	public LocalTime getBuffer_time() {
		return buffer_time;
	}

	public void setBuffer_time(LocalTime buffer_time) {
		this.buffer_time = buffer_time;
	}

	public LocalTime getAvg_patient_check_time() {
		return avg_patient_check_time;
	}

	public void setAvg_patient_check_time(LocalTime avg_patient_check_time) {
		this.avg_patient_check_time = avg_patient_check_time;
	}

	public long getDoctor_id_fk() {
		return doctor_id_fk;
	}

	public void setDoctor_id_fk(long doctor_id_fk) {
		this.doctor_id_fk = doctor_id_fk;
	}

	public List<CreatedSubSlotSaver> getSlot_list() {
		return slot_list;
	}

	public void setSlot_list(List<CreatedSubSlotSaver> slot_list) {
		this.slot_list = slot_list;
	}


		
	
}
