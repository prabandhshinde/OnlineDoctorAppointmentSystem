import PatienHistArray from "./PatientHistArray";
import PatientHeader from "./PatientHeader";
import React from "react";
import { useNavigate } from "react-router-dom";
import { useEffect, useState } from "react";
import axios from "axios";

export default function PatientHistory() {
  let [slots,setSlots]=useState([]);
  let navigate=useNavigate();
  useEffect(()=>{
    let patient=JSON.parse(sessionStorage.getItem('patientlogin'));
    if(patient!==null)
    {
    axios.get('http://localhost:8080/wecare/history/'+patient.patient_id)
            .then(Response=>{
                if(Response.status===200)
                {
                   setSlots(Response.data)
                }else{
                    alert("Data Not Found")
                }
            })
            .catch(e=>{
              console.log(e)
              alert("Something went Wrong Try Again")
            })
          }else{
            alert('Please Login First');
            navigate('/login')
          }
},[])
  return (
    <>
      <div>
        <>
          <PatientHeader></PatientHeader>

          <main id="main">
            <section id="doctors" class="doctors">
              <div class="container">
                <div class="section-title">
                  <br />
                  <br />
                  <br />
                  <br />
                  <h2>History</h2>
                  <p>History of patient Visited the Doctor</p>
                </div>
                <div class="row">
                  {slots.map((eve) => {
                    return (
                      <PatienHistArray
                        key={eve.slotid}
                        name={eve.doctorName}
                        date={eve.slotDate}
                        time={eve.slotTime}
                        clinic={eve.clinicName}
                      />
                    );
                  })}
                </div>
              </div>
            </section>
          </main>
        </>
      </div>
    </>
  );
}
