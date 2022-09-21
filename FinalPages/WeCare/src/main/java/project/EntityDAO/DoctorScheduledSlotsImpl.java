package project.EntityDAO;

import java.sql.Time;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.Entity.CreatedSubSlotSaver;
import project.Entity.doctorScheduledSlots;
import project.repositories.IDoctorScheduledSlotsDAO;

@Service
public class DoctorScheduledSlotsImpl implements IdoctorScheduledSlotsServicable{

	@Autowired
	IDoctorScheduledSlotsDAO scheduled_slots;

	ArrayList<CreatedSubSlotSaver> slot_list=new ArrayList<>();

	@Autowired
	CreatedSubSlotSaver sub_slot;
	
	@Autowired
	CreatedSubSlotSaver sub_slot1;
	
//	CreatedSubSlotSaver sub_slot=new CreatedSubSlotSaver();
//	CreatedSubSlotSaver sub_slot1=new CreatedSubSlotSaver();

	Time start_time_obj;
	Time end_time_obj;

	@Autowired
	CreatedSubSlotSaverImpl slot_saver;

	@Override
	public List<doctorScheduledSlots> getallDoctorScheduledSlots() {

		List<doctorScheduledSlots> list =scheduled_slots.findAll();
		return list;
	}


	@Override
	public doctorScheduledSlots getDoctorScheduledSlot(long id) {

		doctorScheduledSlots slot = scheduled_slots.getReferenceById(id);
		return slot;
	}


	@SuppressWarnings("static-access")
	@Override
	public doctorScheduledSlots addDoctorScheduledSlots(doctorScheduledSlots slot) {
		
		ArrayList<CreatedSubSlotSaver> slot_list = new ArrayList<>();

		CreatedSubSlotSaver sub_slot = new CreatedSubSlotSaver();

// ----------------------------------------------- retrieving values from doctorScheduledSlots object
		
		LocalTime start_time = slot.getStart_time();
		LocalTime end_time = slot.getEnd_time();

		LocalTime avg_pt_time = slot.getAvg_patient_check_time();

		LocalTime buffer_time =slot.getBuffer_time();

		LocalTime start_time_obj=slot.getStart_time();
		LocalTime end_time_obj=start_time_obj;
		end_time_obj.of(00, 00);
		
		int hr = start_time.getHour();
		int p_hr = avg_pt_time.getHour();

		int min = start_time.getMinute();
		int p_min = avg_pt_time.getMinute();

		int p_sec = avg_pt_time.getSecond();

//------------------------------------------------------------------------- first slot booked

		start_time_obj = start_time;
		end_time_obj = end_time_obj.of(p_hr+hr,p_min+min);

		//System.out.println("end_time_obj : "+end_time_obj);


		sub_slot.setSlot_start_time(start_time_obj);
		sub_slot.setSlot_end_time(end_time_obj);

		sub_slot.setRef_doctor_id(slot.getDoctor_id_fk());
		sub_slot.setRef_patient_id(0);
		sub_slot.setIs_booked(false);
		sub_slot.setSlot_Date(slot.getStart_date());


		slot_list.add(sub_slot);
		
//-----------------------------------------------------------------for after first slot booked

		int end_time_hr = end_time_obj.getHour();
		int end_time_min = end_time_obj.getMinute();

		int b_hr = buffer_time.getHour();     //  00
		int b_min = buffer_time.getMinute();  //  10
		
		LocalTime temp_start_time = start_time;
		temp_start_time = temp_start_time.of(end_time_hr + b_hr,end_time_min+b_min);

//		System.out.println("...temp_start_time "+temp_start_time+" p_min "+p_min);
													//10:40                  30
		
		LocalTime temp_start = temp_start_time;
		LocalTime temp_end = temp_start_time;

//		System.out.println(temp_start+"     temmp_end : "+temp_end);
//		System.out.println(temp_start.getHour()+"     <-- hrs       temp min : "+temp_start.getMinute());
//		System.out.println(p_hr+"   patient   "+p_min);
		
		
		
// ------------------------------------------------------------------ min value exceeds---------------
		
		if(temp_start.getMinute()+p_min>59)
		{
			int extra_min = (temp_start.getMinute()+p_min) - 60;
			temp_end = temp_end.of((temp_start.getHour()+1) ,extra_min );
		}
		else {
			temp_end = temp_end.of((temp_start.getHour()+p_hr), (temp_start.getMinute()+p_min));
		}
		

		//temp_end = temp_end.plusHours(temp_start.getHour()+p_hr);
//		System.out.println(temp_end);
//		
//		temp_end = temp_end.plusMinutes(temp_start.getMinute()+p_min);
//		
//		System.out.println("temp_start : "+temp_start);   // 10:40
//		System.out.println("temp_end : "+temp_end);       // 11:10
//		
//		CreatedSubSlotSaver sub_slot1 = new CreatedSubSlotSaver();
//		
//		
//		sub_slot1.setSlot_start_time(temp_start);
//		sub_slot1.setSlot_end_time(temp_end);
//		
//		slot_list.add(sub_slot1);
		
		
		
//--------------------------- for other dynamically creating sub slots ----------------------------------
//		System.out.println("till here start_time.getHour() "+start_time.getHour());     // 10
//		System.out.println("till here start_time.getMinute() "+start_time.getMinute());  // 00
//
//		System.out.println("till here end_time.getHour() "+end_time.getHour());         // 17
//		System.out.println("till here end_time.getMinute() "+end_time.getMinute());     // 00
//
//		System.out.println("till here temp_start.getHour() "+temp_start.getHour());      // 10
//		System.out.println("till here temp_start.getMinute() "+temp_start.getMinute());  // 40
//
//		System.out.println("till here temp_end.getHour() "+temp_end.getHour());          // 11
//		System.out.println("till here temp_end.getMinute() "+temp_end.getMinute());      // 10
//
//		System.out.println("avg pt time hr : "+p_hr);     // 00         
//		System.out.println("ave pt time min: "+p_min);    // 30

		if(end_time.getMinute()==0)
		{
			for(int i=0;((end_time.getHour()> temp_end.getHour()+p_hr+b_hr));i++)  //&&(end_time.getMinute()>= temp_end.getMinute())
			{

				CreatedSubSlotSaver sub_slot2 = new CreatedSubSlotSaver();

				//System.out.println("avg min " + p_min);
				
				if(temp_start.getMinute()+p_min > 59)
				{
					int extra_min = (temp_start.getMinute()+p_min) - 60;
					temp_end = temp_end.of((temp_start.getHour()+p_hr+1) ,extra_min );
				}
				else {
					temp_end = temp_end.of(temp_start.getHour()+p_hr,temp_start.getMinute()+p_min);
					//10      0               40          30
				}
				
				
				//System.out.println("temp_end time" + temp_end);
				
				sub_slot2.setSlot_start_time(temp_start);
				sub_slot2.setSlot_end_time(temp_end);

				sub_slot2.setRef_doctor_id(0);
				sub_slot2.setRef_patient_id(0);
				sub_slot2.setIs_booked(false);
				
				//System.out.println(sub_slot2);
				sub_slot2.setRef_doctor_id(slot.getDoctor_id_fk());
				sub_slot2.setSlot_Date(slot.getStart_date());
				slot_list.add(sub_slot2);

				//System.out.println("temp_end of hr :"+temp_end.getHour());
				//System.out.println(" b_hr :"+b_hr);
				
				//System.out.println("temp_end of min :"+temp_end.getMinute());
				
				//System.out.println("temp_end of hr :"+b_min);
				
				//System.out.println("total minutes : "+(temp_end.getMinute()+b_min));
				
				
//--------------------------------- min value exceeds-------------------------------------------------							
				
				
				if(temp_end.getMinute()+b_min > 59)
				{
					int extra_min = (temp_end.getMinute()+b_min) - 60;
					temp_start = temp_start.of(temp_end.getHour()+b_hr+1,extra_min);
				}
				else {
					temp_start = temp_start.of(temp_end.getHour()+b_hr,temp_end.getMinute()+b_min);
				}
//				System.out.println("hours : "+temp_end.getHour());
//				System.out.println(temp_end.getMinute()+b_min);
				

			}
			System.out.println(slot_list);
			slot.setSlot_list(slot_list);
			scheduled_slots.save(slot);
			
			return slot;

		}
		else
		{
			
			
			for(int i=0;((end_time.getHour()> temp_end.getHour()+p_hr+b_hr)
					 || ((end_time.getHour()==(temp_end.getHour()+p_hr+b_hr)) && 
							 ( end_time.getMinute() >= ( temp_end.getMinute()+p_min + b_min) ) && ( end_time.getMinute() != 0)) );i++)  //&&(end_time.getMinute()>= temp_end.getMinute())
			{

				CreatedSubSlotSaver sub_slot2 = new CreatedSubSlotSaver();

				//System.out.println("avg min " + p_min);
				
				if(temp_start.getMinute()+p_min > 59)
				{
					int extra_min = (temp_start.getMinute()+p_min) - 60;
					temp_end = temp_end.of((temp_start.getHour()+p_hr+1) ,extra_min );
				}
				else {
					temp_end = temp_end.of(temp_start.getHour()+p_hr,temp_start.getMinute()+p_min);
					//10      0               40          30
				}
				
				
				//System.out.println("temp_end time" + temp_end);
				
				sub_slot2.setSlot_start_time(temp_start);
				sub_slot2.setSlot_end_time(temp_end);

				sub_slot2.setRef_doctor_id(0);
				sub_slot2.setRef_patient_id(0);
				sub_slot2.setIs_booked(false);
				
				//System.out.println(sub_slot2);
				sub_slot2.setRef_doctor_id(slot.getDoctor_id_fk());
				sub_slot2.setSlot_Date(slot.getStart_date());;
				slot_list.add(sub_slot2);

				//System.out.println("temp_end of hr :"+temp_end.getHour());
				//System.out.println(" b_hr :"+b_hr);
				
				//System.out.println("temp_end of min :"+temp_end.getMinute());
				
				//System.out.println("temp_end of hr :"+b_min);
				
				//System.out.println("total minutes : "+(temp_end.getMinute()+b_min));
				
				
//--------------------------------- min value exceeds-------------------------------------------------							
				
				
				if(temp_end.getMinute()+b_min > 59)
				{
					int extra_min = (temp_end.getMinute()+b_min) - 60;
					temp_start = temp_start.of(temp_end.getHour()+b_hr+1,extra_min);
				}
				else {
					temp_start = temp_start.of(temp_end.getHour()+b_hr,temp_end.getMinute()+b_min);
				}
//				System.out.println("hours : "+temp_end.getHour());
//				System.out.println(temp_end.getMinute()+b_min);
				

			}
			System.out.println(slot_list);
			slot.setSlot_list(slot_list);
			scheduled_slots.save(slot);
			
			return slot;

			
			
			
			
			
			
			
		}
		
		
		
						
		
		
		
		
		
		
		
		
		
	/*	
//------------------------------ Working Code with hard coded values for single obj entry-------------------------------------------------------
		
		Time start_time = slot.getStart_time();
		Time buffer_time =slot.getBuffer_time();

		int hr = start_time.getHours();
		int b_hr = buffer_time.getHours();

		int min = start_time.getMinutes();
		int b_min = buffer_time.getMinutes();

		int sec = start_time.getSeconds();
		int b_sec = buffer_time.getSeconds();

		//---------------------------------------------------------------------------------------------

		start_time_obj = start_time;
		end_time_obj=start_time;
		//		end_time_obj.setMinutes(b_min+min);
		//		end_time_obj.setSeconds(b_sec+sec);



		sub_slot.setSlot_start_time(start_time_obj);
		sub_slot.setSlot_end_time(end_time_obj);

		sub_slot.setRef_doctor_id(1);
		sub_slot.setRef_patient_id(1);
		sub_slot.setIs_booked(false);

		sub_slot1.setSlot_start_time(start_time_obj);
		sub_slot1.setSlot_end_time(end_time_obj);

		sub_slot1.setRef_doctor_id(1);
		sub_slot1.setRef_patient_id(1);
		sub_slot1.setIs_booked(false);

		this.slot_list.add(sub_slot);
		this.slot_list.add(sub_slot1);



		System.out.println(hr);

		slot.setSlot_list(slot_list);

		scheduled_slots.save(slot);
		return slot;
		*/


		 /*
		

		//------------------------------------------------------------------------------------------


		// for 1st sub_slot

		Time start_time = slot.getStart_time();
		Time end_time = slot.getEnd_time();

		Time avg_pt_time = slot.getAvg_patient_check_time();

		Time buffer_time =slot.getBuffer_time();

		int hr = start_time.getHours();
		int p_hr = avg_pt_time.getHours();

		int min = start_time.getMinutes();
		int p_min = avg_pt_time.getMinutes();

		int sec = start_time.getSeconds();
		int p_sec = avg_pt_time.getSeconds();

		//---------------------------------------------------------------------------------------------

		start_time_obj = start_time;
		end_time_obj.setHours(p_hr+hr);
		end_time_obj.setMinutes(p_min+min);
		end_time_obj.setSeconds(p_sec+sec);



		sub_slot.setSlot_start_time(start_time_obj);
		sub_slot.setSlot_end_time(end_time_obj);

		sub_slot.setRef_doctor_id(1);
		sub_slot.setRef_patient_id(1);
		sub_slot.setIs_booked(false);


		slot_list.add(sub_slot);


		int end_time_hr = end_time_obj.getHours();
		int end_time_min = end_time_obj.getMinutes();
		int end_time_sec = end_time_obj.getSeconds();

		int b_hr = buffer_time.getHours();
		int b_min = buffer_time.getMinutes();
		int b_sec = buffer_time.getSeconds();

		Time temp_start_time = null;
		temp_start_time.setHours(end_time_hr + b_hr);
		temp_start_time.setMinutes(end_time_min+b_min);
		temp_start_time.setSeconds(end_time_sec+b_sec);

		Time temp_start = temp_start_time;
		Time temp_end=null;


		//--------------------------- for other dynamically creating sub slots ----------------------------------

		for(int i=0;((start_time.getHours()>temp_start.getHours())
				&&(start_time.getMinutes()>temp_start.getMinutes())
				&&(start_time.getSeconds()>temp_start.getSeconds()))
				|| ((end_time.getHours()> temp_end.getHours())
						&&(end_time.getMinutes()> temp_end.getMinutes())
						&&(end_time.getSeconds()> temp_end.getSeconds()));i++)
		{

			Created_Sub_Slot_Saver sub_slot1 = new Created_Sub_Slot_Saver();

			temp_end.setHours(temp_start.getHours()+p_hr);
			temp_end.setMinutes(temp_start.getMinutes()+p_min);
			temp_end.setSeconds(temp_start.getSeconds()+p_sec);

			sub_slot1.setSlot_start_time(temp_start);
			sub_slot1.setSlot_end_time(temp_end);

			sub_slot1.setRef_doctor_id(0);
			sub_slot1.setRef_patient_id(0);
			sub_slot1.setIs_booked(false);

			slot_list.add(sub_slot1);

			temp_start.setHours(temp_end.getHours()+b_hr);
			temp_start.setMinutes(temp_end.getMinutes()+b_min);
			temp_start.setSeconds(temp_end.getSeconds()+b_sec);

		}


		//				sub_slot1.setSlot_start_time(start_time_obj);
		//				sub_slot1.setSlot_end_time(end_time_obj);
		//				
		//				sub_slot1.setRef_doctor_id(1);
		//				sub_slot1.setRef_patient_id(1);
		//				sub_slot1.setIs_booked(false);

		//				this.slot_list.add(sub_slot);
		//				this.slot_list.add(sub_slot1);



		//				System.out.println(hr);

		slot.setSlot_list(slot_list);

		scheduled_slots.save(slot);
		return slot;

		//------------------------------------------------------------------------------------------------
		  
		  */

	}


	@Override
	public doctorScheduledSlots updateDoctorScheduledSlots(doctorScheduledSlots slot) {

		scheduled_slots.save(slot);
		return null;
	}


	@Override
	public String deleteDoctorScheduledSlots(long id) {

		doctorScheduledSlots slot = scheduled_slots.getReferenceById(id);
		scheduled_slots.delete(slot);
		return "Doctor Scheduled Slot with id "+id+" Deleted";

	}

}
