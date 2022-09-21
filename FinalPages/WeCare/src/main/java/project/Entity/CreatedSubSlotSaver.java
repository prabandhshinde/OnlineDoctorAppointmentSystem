 package project.Entity;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Component
@JsonIgnoreProperties(value= {"handler","hibernateLazyInitializer","FieldHandler"})
public class CreatedSubSlotSaver {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long created_slot_id;
	
	private LocalTime slot_start_time;
	private LocalTime slot_end_time;
	private Date slot_Date;
	private long ref_doctor_id;
	private long ref_patient_id;
	private boolean is_booked;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "dr_scheduled_slot_id", referencedColumnName = "slot_id" )
	private doctorScheduledSlots dr_scheduled_slot;

	public CreatedSubSlotSaver() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreatedSubSlotSaver(long created_slot_id, LocalTime slot_start_time, LocalTime slot_end_time, Date slot_Date,
			long ref_doctor_id, long ref_patient_id, boolean is_booked, doctorScheduledSlots dr_scheduled_slot) {
		super();
		this.created_slot_id = created_slot_id;
		this.slot_start_time = slot_start_time;
		this.slot_end_time = slot_end_time;
		this.slot_Date = slot_Date;
		this.ref_doctor_id = ref_doctor_id;
		this.ref_patient_id = ref_patient_id;
		this.is_booked = is_booked;
		this.dr_scheduled_slot = dr_scheduled_slot;
	}

	public long getCreated_slot_id() {
		return created_slot_id;
	}

	public void setCreated_slot_id(long created_slot_id) {
		this.created_slot_id = created_slot_id;
	}

	public LocalTime getSlot_start_time() {
		return slot_start_time;
	}

	public void setSlot_start_time(LocalTime slot_start_time) {
		this.slot_start_time = slot_start_time;
	}

	public LocalTime getSlot_end_time() {
		return slot_end_time;
	}

	public void setSlot_end_time(LocalTime slot_end_time) {
		this.slot_end_time = slot_end_time;
	}

	public Date getSlot_Date() {
		return slot_Date;
	}

	public void setSlot_Date(Date slot_Date) {
		this.slot_Date = slot_Date;
	}

	public long getRef_doctor_id() {
		return ref_doctor_id;
	}

	public void setRef_doctor_id(long ref_doctor_id) {
		this.ref_doctor_id = ref_doctor_id;
	}

	public long getRef_patient_id() {
		return ref_patient_id;
	}

	public void setRef_patient_id(long ref_patient_id) {
		this.ref_patient_id = ref_patient_id;
	}

	public boolean isIs_booked() {
		return is_booked;
	}

	public void setIs_booked(boolean is_booked) {
		this.is_booked = is_booked;
	}

	public doctorScheduledSlots getDr_scheduled_slot() {
		return dr_scheduled_slot;
	}

	public void setDr_scheduled_slot(doctorScheduledSlots dr_scheduled_slot) {
		this.dr_scheduled_slot = dr_scheduled_slot;
	}

	

	
	
	
	

}
