package com.springrest.springrest.Service;

import java.util.List;

import com.springrest.springrest.entities.Created_Sub_Slot_Saver;

public interface ICreated_Sub_Slot_SaverServicable {
	
	public List<Created_Sub_Slot_Saver> getallSubSlots();
	public Created_Sub_Slot_Saver getSubSlot(long id);
	public Created_Sub_Slot_Saver addSubSlots(Created_Sub_Slot_Saver slot);
	public Created_Sub_Slot_Saver updateSubSlot(Created_Sub_Slot_Saver slot);
	public String deleteSubSlot(long id);

}
