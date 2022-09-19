import axios from "axios";
import React from "react";
//import { useNavigate } from "react-router";
import { useState } from "react";
import DoctorHeader from "./DoctorHeader";


export default function DrTimeSlot()
{

    let[startdate,setStartdate]=useState("")
    let[enddate,setEnddate]=useState("")
    let[starttime,setStarttime]=useState("")
    let[endtime,setEndtime]=useState("")
    let[avgtime,setAvgtime]=useState("")
    let[buffertime,setBuffertime]=useState("")
    //let navigate=useNavigate();
    function addDataHandler(event){
      event.preventDefault();

      const slot={
        start_date:startdate,
        end_date:enddate,
        start_time:starttime,
        end_time:endtime,
        buffer_time:buffertime,
        avg_patient_check_time:avgtime,
        doctor_id_fk:sessionStorage.getItem('doctorlogin').doctor_id
      }

      axios.post('http://localhost:8080/wecare/drslot',slot)
      .then(Response=>{
          if(Response.status===200)
          {
              alert(Response.data)
          }else{
              alert("Invalid Data format")
          }
      })
      .catch(e=>{
        console.log(e)
        alert("Something went Wrong Try Again")
      })
}


    return(
        <>
        <DoctorHeader></DoctorHeader>
        <br></br>
        <br></br>
        <br></br>
        <br></br>
    <div className="main">
      <div className="container">
        <div className="signup-content">
          <div className="signup-img">
            <img src="/assets/img/reg_form_images/3-2147941723.jpg" alt="" />
          </div>
          <div className="signup-form"> 
              <h2><u>Doctor Time Slot Scheduling form</u></h2>
              <div className="form-row">
                
              </div>

              <div className="form-row">
                <div className="form-group">
                  <label htmlFor="name">Start Date :</label>
                  <input
                    type="date"
                    min="09/13/2022"
                    name="start_date"
                    id="end_date"
                    required
                    onBlur={(e)=>{setStartdate(e.target.value)}}
                  />
                </div>
                <div className="form-group">
                  <label htmlFor="address">End Date :</label>
                  <input
                    type="date"
                    name="end_date"
                    id="end_date"
                    placeholder="12:00 AM"
                    required
                    onBlur={(e)=>{setEnddate(e.target.value)}}
                  />
                </div>
              </div>
              <div className="form-row">
                <div className="form-group">
                  <label htmlFor="name">Start Time :</label>
                  <input
                    type="time"
                    name="start"
                    id="start"
                    placeholder="12:00 AM"
                    required
                    onBlur={(e)=>{setStarttime(e.target.value)}}
                  />
                </div>
                <div className="form-group">
                  <label htmlFor="address">End Time :</label>
                  <input
                    type="time"
                    name="end"
                    id="end"
                    placeholder="12:00 AM"
                    required
                    onBlur={(e)=>{setEndtime(e.target.value)}}
                  />
                </div>
              </div>


              
              <div className="form-row">
                <div className="form-group">
                  <label htmlFor="address">Average Patient Checking Time :</label>
                  <input
                    type="time"
                    name="end"
                    id="end"
                    placeholder="12:00 AM"
                    required
                    onBlur={(e)=>{setAvgtime(e.target.value)}}
                  /><br />
                </div>
                <div className="form-group">
                  <label htmlFor="address">Buffer Time :</label>
                  <input
                    type="time"
                    name="end"
                    id="end"
                    placeholder="12:00 AM"
                    required
                    onBlur={(e)=>{setBuffertime(e.target.value)}}
                  /><br />
                </div>
              </div>
            

              <div className="form-submit">
                <input
                  type="submit"
                  value="Reset All"
                  className="submit"
                  name="reset"
                  id="reset"
                />
                <input
                  type="submit"
                  value="Make Slots"
                  className="submit"
                  name="submit"
                  id="submit"
                  onClick={addDataHandler}
                />
              </div>
    
          </div>
        </div>
      </div>
    </div>
        </>
    )
}