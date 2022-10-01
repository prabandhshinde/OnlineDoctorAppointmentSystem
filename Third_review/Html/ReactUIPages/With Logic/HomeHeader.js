import React, { useState } from "react";
import { useEffect } from "react";
import { useNavigate } from "react-router-dom";

export default function HomeHeader()
{
    let [validation,setValidation]=useState('');
    let [profile,setProfile]=useState('');
    let [user,setUser]=useState('');
    useEffect(()=>{
        let doctor=JSON.parse(sessionStorage.getItem('doctorlogin'));
        let patient=JSON.parse(sessionStorage.getItem('patientlogin'));
        if(doctor!==null || patient!==null)
        {
            setValidation(<a href="/logout">Sign Out</a>)
            if(patient===null)
            {
              setProfile(<li><a href="/doctor/profile">Profile</a></li>)
              setUser("Dr. "+doctor.first_name+" "+doctor.last_name);
            }else{
              setProfile(<li><a href="/patient/profile">Profile</a></li>)
              if(patient.gender==="M")
              {
                setUser("Mr. "+patient.first_name+" "+patient.last_name);
              }else{
                setUser("Miss. "+patient.first_name+" "+patient.last_name);
              }
            }
        }else{
            setValidation(<a href="/login">Sign In</a>)
            setProfile(<li className="dropdown"><a href="#"><span>SignUp</span> <i className="bi bi-chevron-right"></i></a>
            <ul>
                <li><a href="/doctor/signup">As Doctor</a></li>
                <li><a href="/patient/signup">As Patient</a></li>
              </ul>
            </li>)
        }
    },[])
    


    return(
        <>
        <div id="topbar" className="d-flex align-items-center fixed-top">
    <div className="container d-flex justify-content-between">
      <div className="contact-info d-flex align-items-center">
        {user}
      </div>
      <div className="d-none d-lg-flex social-links align-items-center">
        <a href="#" className="twitter"><i className="bi bi-twitter"></i></a>
        <a href="#" className="facebook"><i className="bi bi-facebook"></i></a>
        <a href="#" className="instagram"><i className="bi bi-instagram"></i></a>
        <a href="#" className="linkedin"><i className="bi bi-linkedin"></i></a>
      </div>
    </div>
  </div>

  <header id="header" className="fixed-top">
    <div className="container d-flex align-items-center">

      <h1 className="logo me-auto"><a href="/">WeCare</a></h1>
      
       <a href="/" className="logo me-auto"><img src="/assets/img/logo.png" alt="" className="img-fluid"/></a>

      <nav id="navbar" className="navbar order-last order-lg-0">
    <ul>
      <li><a className="nav-link scrollto active" href="#hero">Home</a></li>
      <li><a className="nav-link scrollto" href="#faq">F.A.Q.</a></li>
      <li><a className="nav-link scrollto" href="#contact">Contact</a></li>
		  <li className="dropdown"><a href="#" className="appointment-btn scrollto"><span className="d-none d-md-inline" style={{"color":"white"}}> Make an Appointment  </span> </a> 
		      <ul>
            <li>{validation}</li>
            {profile}
	        </ul>
      </li>
    </ul>
    <i className="bi bi-list mobile-nav-toggle"></i>
    </nav>
    </div>
  </header>
        </>
    )
}
