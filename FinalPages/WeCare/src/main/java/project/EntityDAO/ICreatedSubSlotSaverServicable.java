package project.EntityDAO;

import java.util.List;

import project.Entity.CreatedSubSlotSaver;

public interface ICreatedSubSlotSaverServicable {
	
	public List<CreatedSubSlotSaver> getallSubSlots();
	public CreatedSubSlotSaver getSubSlot(long id);
	public CreatedSubSlotSaver addSubSlots(CreatedSubSlotSaver slot);
	public CreatedSubSlotSaver updateSubSlot(CreatedSubSlotSaver slot);
	//public doctorScheduledSlots addDoctorSlot(doctorScheduledSlots d);
	public String deleteSubSlot(long id);

}
