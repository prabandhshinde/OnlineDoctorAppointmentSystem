package project.Entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties(value= {"handler","hibernateLazyInitializer","FieldHandler"})
public class BookedSlots {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long booked_slot_id;
	private long resp_doctor_id;
	private long resp_patient_id;
	private Date booked_slot_date;
	private Time booked_slot_time;
	private Time booked_slot_interval;
	
	public BookedSlots() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BookedSlots(long booked_slot_id, long resp_doctor_id, long resp_patient_id, Date booked_slot_date,
			Time booked_slot_time,Time booked_slot_interval) {
		super();
		this.booked_slot_id = booked_slot_id;
		this.resp_doctor_id = resp_doctor_id;
		this.resp_patient_id = resp_patient_id;
		this.booked_slot_date = booked_slot_date;
		this.booked_slot_time = booked_slot_time;
		this.booked_slot_interval=booked_slot_interval;
	}
	
	public long getBooked_slot_id() {
		return booked_slot_id;
	}
	public void setBooked_slot_id(long booked_slot_id) {
		this.booked_slot_id = booked_slot_id;
	}
	public long getResp_doctor_id() {
		return resp_doctor_id;
	}
	public void setResp_doctor_id(long resp_doctor_id) {
		this.resp_doctor_id = resp_doctor_id;
	}
	public long getResp_patient_id() {
		return resp_patient_id;
	}
	public void setResp_patient_id(long resp_patient_id) {
		this.resp_patient_id = resp_patient_id;
	}
	public Date getBooked_slot_date() {
		return booked_slot_date;
	}
	public void setBooked_slot_date(Date booked_slot_date) {
		this.booked_slot_date = booked_slot_date;
	}
	public Time getBooked_slot_time() {
		return booked_slot_time;
	}
	public void setBooked_slot_time(Time booked_slot_time) {
		this.booked_slot_time = booked_slot_time;
	}
	public Time getBooked_slot_interval() {
		return booked_slot_interval;
	}
	public void setBooked_slot_interval(Time booked_slot_interval) {
		this.booked_slot_interval = booked_slot_interval;
	}
	
	
	
	
}
