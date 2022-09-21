package project.model;

import java.sql.Date;
import java.sql.Time;
import java.time.LocalTime;

public class HistoryPatient {
	
	private String doctorName;
	private String clinicName;
	private Date slotDate;
	private LocalTime slotTime;
	private long slotid;
	
	
	public long getSlotid() {
		return slotid;
	}
	public void setSlotid(long slotid) {
		this.slotid = slotid;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getClinicName() {
		return clinicName;
	}
	public void setClinicName(String clinicName) {
		this.clinicName = clinicName;
	}
	public Date getSlotDate() {
		return slotDate;
	}
	public void setSlotDate(Date slotDate) {
		this.slotDate = slotDate;
	}
	public LocalTime getSlotTime() {
		return slotTime;
	}
	public void setSlotTime(LocalTime slotTime) {
		this.slotTime = slotTime;
	}
	
	

}
