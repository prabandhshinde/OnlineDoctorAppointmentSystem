package WeCare;
import java.awt.List;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class ReturnArray {

	public static void main(String[] args) {

		
		// -------------------------------------- Successful upto hr and min exceeding 1 slot --------------------------------
		
		
		//getArray();
		LocalTime start = LocalTime.of(10,00,00);
		LocalTime end = LocalTime.of(17,30,00);

		LocalDate start_date = LocalDate.of(2022, 9, 20);
		LocalDate end_date = LocalDate.of(2022, 9, 20);

		LocalTime buffer = LocalTime.of(00,10,00);
		LocalTime average = LocalTime.of(00,30,00);

		System.out.println("start : "+start);
		//System.out.println(start);  



		doctorScheduledSlots slot = new doctorScheduledSlots(1,start,end,start_date,end_date,buffer,average);

		ArrayList<CreatedSubSlotSaver> list = addDoctorScheduledSlots(slot);

		for (CreatedSubSlotSaver sub_slot : list) 
		{
			System.out.println(sub_slot);
		}

	}

	public static void getArray()
	{
		int [] arr=new int []{1,2,3,4,5,6,7,8,9,10,11,12,15};

		int sum=0;int j=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			if(sum==15) 
			{
				System.out.println(j+" and "+i);
			}

			if( sum>=15 && j<i )
			{
				j++;i--;
				if(sum==15) 
				{
					System.out.println(j+" 2 and "+i);
				}
			}


		}
	}


	@SuppressWarnings({ "static-access", "null" })
	public static ArrayList<CreatedSubSlotSaver> addDoctorScheduledSlots(doctorScheduledSlots slot) {

		ArrayList<CreatedSubSlotSaver> slot_list = new ArrayList<>();

		LocalTime start_time_obj=slot.getStart_time();
		LocalTime end_time_obj=start_time_obj;
		end_time_obj.of(00, 00);
		CreatedSubSlotSaver sub_slot = new CreatedSubSlotSaver();
		//CreatedSubSlotSaver sub_slot2 = new CreatedSubSlotSaver();

		//------------------------------------------------------------------------------------------


		// for 1st sub_slot

		LocalTime start_time = slot.getStart_time();
		LocalTime end_time = slot.getEnd_time();

		LocalTime avg_pt_time = slot.getAvg_patient_check_time();

		LocalTime buffer_time =slot.getBuffer_time();

		int hr = start_time.getHour();
		int p_hr = avg_pt_time.getHour();

		int min = start_time.getMinute();
		int p_min = avg_pt_time.getMinute();

		int sec = start_time.getSecond();
		int p_sec = avg_pt_time.getSecond();

		//---------------------------------------------------------------------------------------------

		start_time_obj = start_time;
		end_time_obj = end_time_obj.of(p_hr+hr,p_min+min);

		System.out.println("end_time_obj : "+end_time_obj);


		sub_slot.setSlot_start_time(start_time_obj);
		sub_slot.setSlot_end_time(end_time_obj);

		sub_slot.setRef_doctor_id(1);
		sub_slot.setRef_patient_id(1);
		sub_slot.setIs_booked(false);


		slot_list.add(sub_slot);
		
//--------------------------------------------------------------------------------------- first slot booked

		int end_time_hr = end_time_obj.getHour();
		int end_time_min = end_time_obj.getMinute();

		int b_hr = buffer_time.getHour();     //  00
		int b_min = buffer_time.getMinute();  //  10

		
		
		
		
		
		
		
		
		LocalTime temp_start_time = start_time;
		temp_start_time = temp_start_time.of(end_time_hr + b_hr,end_time_min+b_min);

		System.out.println("...temp_start_time "+temp_start_time+" p_min "+p_min);
													//10:40                  30
		
		LocalTime temp_start = temp_start_time;
		LocalTime temp_end = temp_start_time;

		System.out.println(temp_start+"     temmp_end : "+temp_end);
		System.out.println(temp_start.getHour()+"     <-- hrs       temp min : "+temp_start.getMinute());
		System.out.println(p_hr+"   patient   "+p_min);
		
		
		
		
		
		if(temp_start.getMinute()+p_min>59)
		{
			int extra_min = (temp_start.getMinute()+p_min) - 60;
			temp_end = temp_end.of((temp_start.getHour()+1) ,extra_min );
//			temp_end = temp_end.plusHours(1);
//			temp_end = temp_end.minusMinutes(60);
		}
		else {
			temp_end = temp_end.of((temp_start.getHour()+p_hr), (temp_start.getMinute()+p_min));
		}
		

		//temp_end = temp_end.plusHours(temp_start.getHour()+p_hr);
		System.out.println(temp_end);
		
		//temp_end = temp_end.plusMinutes(temp_start.getMinute()+p_min);
		
		System.out.println("temp_start : "+temp_start);   // 10:40
		System.out.println("temp_end : "+temp_end);       // 11:10
		
//		CreatedSubSlotSaver sub_slot1 = new CreatedSubSlotSaver();
//		
//		
//		sub_slot1.setSlot_start_time(temp_start);
//		sub_slot1.setSlot_end_time(temp_end);
//		
//		slot_list.add(sub_slot1);
		
		
		
		//--------------------------- for other dynamically creating sub slots ----------------------------------
		System.out.println("till here start_time.getHour() "+start_time.getHour());     // 10
		System.out.println("till here start_time.getMinute() "+start_time.getMinute());  // 00

		System.out.println("till here end_time.getHour() "+end_time.getHour());         // 17
		System.out.println("till here end_time.getMinute() "+end_time.getMinute());     // 00

		System.out.println("till here temp_start.getHour() "+temp_start.getHour());      // 10
		System.out.println("till here temp_start.getMinute() "+temp_start.getMinute());  // 40

		System.out.println("till here temp_end.getHour() "+temp_end.getHour());          // 11
		System.out.println("till here temp_end.getMinute() "+temp_end.getMinute());      // 10

		System.out.println("avg pt time hr : "+p_hr);     // 00         
		System.out.println("ave pt time min: "+p_min);    // 30

						for(int i=0;((end_time.getHour()> temp_end.getHour())
								 || (end_time.getHour() == temp_end.getHour() && 
										 end_time.getMinute()> temp_end.getMinute() ) );i++)  //&&(end_time.getMinute()>= temp_end.getMinute())
						{
		
							CreatedSubSlotSaver sub_slot2 = new CreatedSubSlotSaver();
		
							System.out.println("avg min " + p_min);
							
							if(temp_start.getMinute()+p_min > 59)
							{
								int extra_min = (temp_start.getMinute()+p_min) - 60;
								temp_end = temp_end.of((temp_start.getHour()+p_hr+1) ,extra_min );
//								temp_end = temp_end.plusHours(1);
//								temp_end = temp_end.minusMinutes(60);
							}
							else {
								temp_end = temp_end.of(temp_start.getHour()+p_hr,temp_start.getMinute()+p_min);
								//10      0               40          30
							}
							
							
							
							
//							temp_end.plusHours(temp_start.getHour()+p_hr);
//							temp_end.plusMinutes(temp_start.getMinute()+p_min);
							
							
							System.out.println("temp_end time" + temp_end);
							
							sub_slot2.setSlot_start_time(temp_start);
							sub_slot2.setSlot_end_time(temp_end);
		
							sub_slot2.setRef_doctor_id(0);
							sub_slot2.setRef_patient_id(0);
							sub_slot2.setIs_booked(false);
							
							System.out.println(sub_slot2);
							slot_list.add(sub_slot2);
		
							System.out.println("temp_end of hr :"+temp_end.getHour());
							System.out.println(" b_hr :"+b_hr);
							
							System.out.println("temp_end of min :"+temp_end.getMinute());
							
							System.out.println("temp_end of hr :"+b_min);
							
							System.out.println("total minutes : "+(temp_end.getMinute()+b_min));
							
							if(temp_end.getMinute()+b_min > 59)
							{
								int extra_min = (temp_end.getMinute()+b_min) - 60;
								temp_start = temp_start.of(temp_end.getHour()+b_hr+1,extra_min);
//								temp_end = temp_end.plusHours(1);
//								temp_end = temp_end.minusMinutes(60);
							}
							else {
								temp_start = temp_start.of(temp_end.getHour()+b_hr,temp_end.getMinute()+b_min);
							}
							System.out.println("hours : "+temp_end.getHour());
							System.out.println(temp_end.getMinute()+b_min);
							
		
						}




		/*
		
		10:00
		end_time_obj : 10:00
		till here start_time.getHour() 10
		till here start_time.getMinute() 0
		till here end_time.getHour() 5
		till here end_time.getMinute() 0
		till here temp_start.getHour() 10
		till here temp_start.getMinute() 0
		till here temp_end.getHour() 10
		till here temp_end.getMinute() 0
		avg pt time hr : 0
		ave pt time min: 30
		CreatedSubSlotSaver [created_slot_id=0, slot_start_time=10:00, slot_end_time=10:00, ref_doctor_id=1, ref_patient_id=1, is_booked=false]

		 */

















		/*
				for(int i=0;((start_time.getHour()>temp_start.getHour())
						&&(start_time.getMinute()>temp_start.getMinute())
						&&(start_time.getSecond()>temp_start.getSecond()))
						|| ((end_time.getHour()> temp_end.getHour())
								&&(end_time.getMinute()> temp_end.getMinute())
								&&(end_time.getSecond()> temp_end.getSecond()));i++)
				{

					CreatedSubSlotSaver sub_slot2 = new CreatedSubSlotSaver();

					temp_end.of(temp_start.getHour()+p_hr,temp_start.getMinute()+p_min);

					sub_slot2.setSlot_start_time(temp_start);
					sub_slot2.setSlot_end_time(temp_end);

					sub_slot2.setRef_doctor_id(0);
					sub_slot2.setRef_patient_id(0);
					sub_slot2.setIs_booked(false);

					System.out.println(sub_slot2);
					slot_list.add(sub_slot2);

					temp_start.of(temp_end.getHour()+b_hr,temp_end.getMinute()+b_min);


				}
		 */

		return slot_list;
		//				sub_slot2.setSlot_start_time(start_time_obj);
		//				sub_slot2.setSlot_end_time(end_time_obj);
		//				
		//				sub_slot2.setRef_doctor_id(1);
		//				sub_slot2.setRef_patient_id(1);
		//				sub_slot2.setIs_booked(false);

		//				this.slot_list.add(sub_slot);
		//				this.slot_list.add(sub_slot2);



		//				System.out.println(hr);

		//------------------------------------------------------------------------------------------------



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



			sub_slot2.setSlot_start_time(start_time_obj);
			sub_slot2.setSlot_end_time(end_time_obj);



			this.slot_list.add(sub_slot);
			this.slot_list.add(sub_slot2);



			System.out.println(hr);

			slot.setSlot_list(slot_list);

			scheduled_slots.save(slot);
			return slot;

	 */




}
