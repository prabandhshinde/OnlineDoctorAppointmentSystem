import PatientHeader from "./PatientHeader";
import { useEffect,useState } from "react";
import axios from "axios";
import React from "react";
import { useSelector } from "react-redux";
import Store from "./store/reducer";
import { useNavigate } from "react-router-dom";

export default function PatientProfile() {

  let [patient,setPatient]=useState({});
  let newpatient=JSON.parse(sessionStorage.getItem('patientlogin'));
  let navigate = useNavigate()
  let pid=0;
  if(newpatient!==null)
  {
      pid=newpatient.patient_id;
  }else{
      pid=0;
  }

  

  useEffect(()=>{
    if(newpatient!==null)
    {
    axios.get('http://localhost:8080/wecare/patientbyid/'+pid)
            .then(Response=>{
                if(Response.status===200)
                {
                   setPatient(Response.data)
                }else{
                    alert("Data Not Found")
                }
            })
            .catch(e=>{
              console.log(e)
              alert("Something went Wrong Try Again")
            })
          }else{
                  alert('Please Login First')
                  navigate('/login')
          }
},[pid])


  if(newpatient!==null)
  {
  return (
    <>
      <PatientHeader></PatientHeader>
      <div>
        <main id="main">
          <section id="doctors" class="doctors">
            <div class="container">
              <div class="section-title">
                <br />
                <br />
                <br />
                <br />
                <h2>Profile Details</h2>
              </div>
            </div>
            <div class="row">
              <div className="col-lg-4 d-flex ">
                <img
                  src="/assets/img/login.jpg"
                  width="100%"
                  height="100%"
                  alt="login form"
                  style={{ "border-radius": "1rem 0 0 1rem;" }}
                />
              </div>
              <div className="col-lg-8 d-flex ">
                <div class="container">
                  <div class="row">
                    <div class="col-lg-6 d-flex ">
                      <div>
                        <h3>Name</h3>
                        <h3>Mobile Number</h3>
                        <h3>Date of Birth</h3>
                        <h3>Gender</h3>
                        <h3>Blood Group</h3>
                      </div>
                    </div>
                    <div class="col-lg-6 d-flex ">
                      <div>
                        <h3>: Mr. {patient.first_name} {patient.last_name}</h3>
                        <h3>: {patient.mob_number}</h3>
                        <h3>: {patient.date_of_birth}</h3>
                        <h3>: {patient.gender}</h3>
                        <h3>: {patient.blood_group}</h3>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </section>
        </main>
      </div>
    </>
  );
  }
}
