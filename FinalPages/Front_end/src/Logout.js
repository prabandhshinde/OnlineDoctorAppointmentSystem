import React, { useEffect } from "react";
import { useState } from "react"
import { useDispatch} from "react-redux"
import { useNavigate } from "react-router"
export default function Logout()
{
    let navigate=useNavigate();
    useEffect(()=>{
        let doctor=JSON.parse(sessionStorage.getItem('doctorlogin'));
        let patient=JSON.parse(sessionStorage.getItem('patientlogin'));
        if(doctor!==null)
        {
            sessionStorage.removeItem('doctorlogin');
            navigate("/");
        }else if(patient!==null)
        {
            sessionStorage.removeItem('patientlogin');
            navigate("/")
        }
    },[])
    

}