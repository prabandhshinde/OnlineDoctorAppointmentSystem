package com.springrest.springrest.Service;

import java.util.List;

import com.springrest.springrest.entities.CreatedSubSlotSaver;
import com.springrest.springrest.entities.doctorScheduledSlots;

public interface ICreatedSubSlotSaverServicable {
	
	public List<CreatedSubSlotSaver> getallSubSlots();
	public CreatedSubSlotSaver getSubSlot(long id);
	public CreatedSubSlotSaver addSubSlots(doctorScheduledSlots slot);
	public CreatedSubSlotSaver updateSubSlot(CreatedSubSlotSaver slot);
	public String deleteSubSlot(long id);

}
