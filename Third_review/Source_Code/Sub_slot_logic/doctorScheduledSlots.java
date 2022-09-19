package WeCare_pkg;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


public class doctorScheduledSlots {

	private long slot_id;

	private LocalTime start_time;
	private LocalTime end_time;
	private LocalDate start_date;
	private LocalDate end_date;
	private LocalTime buffer_time;
	private LocalTime avg_patient_check_time;
	
	private List<CreatedSubSlotSaver> slot_list;
	
	public doctorScheduledSlots() {
		super();
		// TODO Auto-generated constructor stub
	}

	public doctorScheduledSlots(long slot_id, LocalTime start_time, LocalTime end_time, LocalDate start_date, LocalDate end_date,LocalTime buffer_time,	LocalTime avg_patient_check_time)
	{
		super();
		this.slot_id = slot_id;
		this.start_time = start_time;
		this.end_time = end_time;
		this.start_date = start_date;
		this.end_date = end_date;
		this.buffer_time = buffer_time;
		this.avg_patient_check_time = avg_patient_check_time;
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

	public LocalDate getStart_date() {
		return start_date;
	}

	public void setStart_date(LocalDate start_date) {
		this.start_date = start_date;
	}

	public LocalDate getEnd_date() {
		return end_date;
	}

	public void setEnd_date(LocalDate end_date) {
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

	public List<CreatedSubSlotSaver> getSlot_list() {
		return slot_list;
	}

	public void setSlot_list(List<CreatedSubSlotSaver> slot_list) {
		this.slot_list = slot_list;
	}


		
	
}
