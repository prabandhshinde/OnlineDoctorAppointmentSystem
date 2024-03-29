import { useNavigate } from "react-router-dom";
import React, { useEffect, useState } from "react";
import { Button } from "react-bootstrap";
import axios from "axios";
import HomeHeader from "./HomeHeader";

export default function Confirm()
{
    let navigate=useNavigate();
    let doctor=JSON.parse(sessionStorage.getItem('doctor_select'));
    let patient=JSON.parse(sessionStorage.getItem('patientlogin'));
    let slottime=localStorage.getItem('slot_time')
    var newdate=new Date();
    let year=newdate.getFullYear();
    let month=newdate.getMonth();
    let day=newdate.getDate();
    let slotdate=year+"-"+(month+1)+"-"+day;
    let ConfirmHandler=()=>{
        axios.get('http://localhost:8080/wecare/setslot/'+slottime+'/'+doctor.doctor_id+"/"+patient.patient_id)
        .then(Response=>{
            if(Response.status===200)
            {
                alert("Slot Successfully Booked");
                localStorage.removeItem('slot_item');
                localStorage.removeItem('doctor_select');
                navigate("/list")
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
        <div>
            <HomeHeader></HomeHeader>
            <hr></hr>
      <main id="main">
        <section id="doctors" class="doctors">
          <div class="container">
            <div class="section-title">
              <br />
              <br />
              <br />
              <br />
              <h2>Confirm Appointment</h2>
            </div>
            <div class="row">
              <div class="col-lg-6">
                <div>Date</div>
                <div>Start Time</div>
                <div>Doctor Name</div>
                <div>Clinic Name</div>
                <br></br>
                <br></br>
                <div>
                  Confirm : <input type={"checkbox"} id="check"></input>
                </div>
                <br></br>
                <br></br>
              </div>
              <div class="col-lg-6">
                <div>: {slotdate}</div>
                <div>: {slottime}</div>
                <div>: {doctor.doctor_name}</div>
                <div>: {doctor.clinic_name}</div>
                <br></br>
                <br></br>
                <div></div>
                <br></br>
                <br></br>
              </div>
              <button name="Submit" value="Submit" onClick={ConfirmHandler}>
                Submit
              </button>
            </div>
          </div>
        </section>
      </main>
        </div>
    )
}