import React, { useState } from "react";
import DoctorDailyAppArray from "./DoctorDailyAppArray";
import DoctorHeader from "./DoctorHeader";
import axios from "axios";


export default function DoctorDailyAppointment() {
  let [slots,setSlots]=useState([]);
  let[date,setDate]=useState('');
  let doctor=JSON.parse(sessionStorage.getItem('doctorlogin'));
  let DateHandler=(event)=>{
      let date1=event.target.value;
    axios.get('http://localhost:8080/wecare/getbookedslot/'+doctor.doctor_id+'/'+date1)
            .then(Response=>{
                if(Response.status===200)
                {
                   setSlots(Response.data)
                   setDate(date1);
                }else{
                    alert("Data Not Found")
                }
            })
            .catch(e=>{
              console.log(e)
              alert("Something went Wrong Try Again")
            })
}

  if(doctor!==null)
  {
  return (
    <>
      <DoctorHeader></DoctorHeader>
      <main id="main">
        <section id="doctors" class="doctors">
          <div class="container">
            <div class="section-title">
              <br />
              <br />
              <br />
              <br />
              <h2>Slot</h2>
              <br />
              Select Date :{" "}
              <input
                type="date"
                min="09/13/2022"
                name="start_date"
                id="start_date"
                required onChange={
                  DateHandler
                }
              />
              <br />
              <br />
              <p>
                Appointment of Patient for {date} are :{" "}
              </p>
            </div>
            <div class="row">
              <center>
                <div class="col-lg-12">
                  <div>
                    <div class="member-info">
                      <div class="row">
                        <div class="col-lg-1 ">
                          <h3>Sr. No.</h3>
                        </div>
                        <div class="col-lg-2 ">
                          <h3>Date</h3>
                        </div>
                        <div class="col-lg-2">
                          
                            <h3>Time</h3>
                         
                        </div>
                        <div class="col-lg-4 ">
                          <h3>Name</h3>
                        </div>
                        <div class="col-lg-3 ">
                          <h3>Contact Number</h3>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                {slots.map((eve) => {
                  return (
                    <DoctorDailyAppArray
                      key={eve.count}
                      id={eve.count}
                      name={eve.patientname}
                      date={eve.bookeddate}
                      time={eve.time}
                      mob={eve.mob}
                    />
                  );
                })}
              </center>
            </div>
          </div>
        </section>
      </main>
    </>
  );
}else{
  alert('Please Login First');
  window.location='/login';
}
}
