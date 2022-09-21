package project.EntityDAO;

import java.util.List;

import project.Entity.doctorScheduledSlots;

public interface IdoctorScheduledSlotsServicable {
	
	public List<doctorScheduledSlots> getallDoctorScheduledSlots();
	public doctorScheduledSlots getDoctorScheduledSlot(long id);
	public doctorScheduledSlots addDoctorScheduledSlots(doctorScheduledSlots slot);
	public doctorScheduledSlots updateDoctorScheduledSlots(doctorScheduledSlots slot);
	public String deleteDoctorScheduledSlots(long id);

}

