import { useNavigate } from "react-router-dom";
import React, { useEffect, useState } from "react";
import { Button } from "react-bootstrap";
import axios from "axios";
import HomeHeader from "./HomeHeader";

export default function Confirm()
{
    let navigate=useNavigate();
    let ConfirmHandler=()=>{
        let doctor=JSON.parse(sessionStorage.getItem('doctor_select'));
        let patient=JSON.parse(sessionStorage.getItem('patientlogin'));
        let slottime=localStorage.getItem('slot_time')

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
            <hr></hr>
            <label htmlFor="check">confirm :</label><input type={'checkbox'} id="check"></input>
            <button name="Submit" value="Submit" onClick={ConfirmHandler}>Submit</button>
        </div>
    )
}