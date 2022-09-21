package project.EntityDAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.Entity.CreatedSubSlotSaver;
import project.repositories.ICreatedSubSlotSaverDAO;

@Service
public class CreatedSubSlotSaverImpl implements ICreatedSubSlotSaverServicable{

	@Autowired
	ICreatedSubSlotSaverDAO sub_slot; 
	
	@Override
	public List<CreatedSubSlotSaver> getallSubSlots() {

		return sub_slot.findAll();
	}

	@Override
	public CreatedSubSlotSaver getSubSlot(long id) {
		return sub_slot.getReferenceById(id);
	}

	@Override
	public CreatedSubSlotSaver addSubSlots(CreatedSubSlotSaver slot) {
		
		return sub_slot.save(slot);
	}

	@Override
	public CreatedSubSlotSaver updateSubSlot(CreatedSubSlotSaver slot) {

		return sub_slot.save(slot);
	}

	@Override
	public String deleteSubSlot(long id) {
		CreatedSubSlotSaver slot = sub_slot.getReferenceById(id);
		sub_slot.delete(slot);
		return "Sub Slot with Id "+id+" is Deleted";
	}

}
