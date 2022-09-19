import React from "react";
import { useNavigate } from "react-router-dom";
import DoctorHeader from "./DoctorHeader";
import HomeHeader from "./HomeHeader";

export default function DoctorProfile()
{

    let doctor=JSON.parse(sessionStorage.getItem('doctorlogin'));
    let navigate=useNavigate();
    if(doctor!==null)
    {
    return(
        <>
        <DoctorHeader/>
        <hr></hr>
        <hr></hr>
        <br></br>
        <br></br>
        <div className="container emp-profile">
        <div className="row">
            <div className="col-md-4">
                <div className="profile-img">
                    <img src="/assets/img/doctors/doctors-1.jpg" alt=""/>
                    <div className="file btn btn-lg btn-primary">
                        Change Photo
                        <input type="file" name="file"/>
                    </div>
                </div>
            </div>
            <div className="col-md-8">
                <div className="profile-head">
                            <h3>
                                Dr. {doctor.first_name} {doctor.last_name} 
                            </h3>
                            <h6>
                              {doctor.specilization}
                            </h6>  
                    <ul className="nav nav-tabs" id="myTab" role="tablist">
                        <li className="nav-item">
                            <a className="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">About</a>
                        </li>
                        <li className="nav-item">
                            <a className="nav-link" id="profile-tab" data-toggle="tab" href="#profile" role="tab" aria-controls="profile" aria-selected="false">Clinic Details</a>
                        </li>
                    </ul>
                    <div className="tab-content profile-tab" id="myTabContent">
                    <div className="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                
                                 <h3>Personal Info:</h3>
                               
                                  <div className="row">
                                    
                                    <div className="col-md-6">

                                     <label>Name</label>
                                    </div>
                                    <div className="col-md-6">
                                        <p>{doctor.first_name} {doctor.last_name}</p>
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-6">
                                        <label>Mobile Number</label>
                                    </div>
                                    <div className="col-md-6">
                                        <p>{doctor.mob_number}</p>
                                    </div>
                                </div>
                                <div className="row">
                        
                                </div>
                                <h3>Education Details:</h3>
                                <div className="row">
                                    <div className="col-md-6">
                                        <label>Degree Name</label>
                                    </div>
                                    <div className="col-md-6">
                                        <p>{doctor.qualification}</p>
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-6">
                                        <label>University Name</label>
                                    </div>
                                    <div className="col-md-6">
                                        <p>{doctor.university}</p>
                                    </div>
                                </div>
                                
                                <div className="row">
                                    <div className="col-md-6">
                                        <label>Passing year</label>
                                    </div>
                                    <div className="col-md-6">
                                        <p>{doctor.passing_year}</p>
                                    </div>
                                </div>
                    </div>
                    <div className="tab-pane fade" id="profile" role="tabpanel" aria-labelledby="profile-tab">
                                <div className="row">
                                    <div className="col-md-6">
                                        <label>Clinic Name</label>
                                    </div>
                                    <div className="col-md-6">
                                        <p>{doctor.clinic.clinic_name}</p>
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-6">
                                        <label>Address</label>
                                    </div>
                                    <div className="col-md-6">
                                        <p>{doctor.clinic.builing_details}, {doctor.clinic.landmark}, {doctor.clinic.street}</p>
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-6">
                                        <label>City</label>
                                    </div>
                                    <div className="col-md-6">
                                        <p>{doctor.clinic.city}</p>
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-6">
                                        <label>State</label>
                                    </div>
                                    <div className="col-md-6">
                                        <p>{doctor.clinic.state}</p>
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-6">
                                        <label>District</label>
                                    </div>
                                    <div className="col-md-6">
                                        <p>{doctor.clinic.district}</p>
                                    </div>
                                </div>
                                <div className="row">
                                    <div className="col-md-6">
                                        <label>pincode</label>
                                    </div>
                                    <div className="col-md-6">
                                        <p>{doctor.clinic.pin_code}</p>
                                    </div>
                                </div>
                </div>
            
           
                <input type="submit" className="profile-edit-btn" name="btnAddMore" value="Edit Profile"/>
           
        </div>
        
        </div>
            </div>
        </div>           
</div>
        </>
    )
}
else
{
    alert('Please Login First');
    navigate('/login')
}
}