package WeCare_pkg;

import java.sql.Time;
import java.time.LocalTime;



public class CreatedSubSlotSaver {
	
	private long created_slot_id;
	
	private LocalTime slot_start_time;
	private LocalTime slot_end_time;
	private long ref_doctor_id;
	private long ref_patient_id;
	private boolean is_booked;
	

	public CreatedSubSlotSaver() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public CreatedSubSlotSaver(LocalTime slot_start_time, LocalTime slot_end_time, long ref_doctor_id,
			long ref_patient_id, boolean is_booked) {
		super();
		//this.created_slot_id = created_slot_id;
		this.slot_start_time = slot_start_time;
		this.slot_end_time = slot_end_time;
		this.ref_doctor_id = ref_doctor_id;
		this.ref_patient_id = ref_patient_id;
		this.is_booked = is_booked;
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

	public void setSlot_start_time(LocalTime start_time_obj) {
		this.slot_start_time = start_time_obj;
	}

	public LocalTime getSlot_end_time() {
		return slot_end_time;
	}

	public void setSlot_end_time(LocalTime slot_end_time) {
		this.slot_end_time = slot_end_time;
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


	@Override
	public String toString() {
		return "CreatedSubSlotSaver [created_slot_id=" + created_slot_id + ", slot_start_time=" + slot_start_time
				+ ", slot_end_time=" + slot_end_time + ", ref_doctor_id=" + ref_doctor_id + ", ref_patient_id="
				+ ref_patient_id + ", is_booked=" + is_booked + "]";
	}

	
	
	
	

}
