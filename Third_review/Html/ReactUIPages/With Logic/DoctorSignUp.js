import axios from "axios";
import React from "react";
import { useNavigate } from "react-router";
import { useState } from "react";
import HomeHeader from "./HomeHeader";

export default function DoctorSignUp()
{

  let[firstname,setFirstname]=useState("")
        let[lastname,setLastname]=useState("")       
        let[qualification,setQualification]=useState("")
        let[mobnumber,setMobnumber]=useState(0)
        let[specilization,setSpecialization]=useState("")
        let[university,setUniversity]=useState("")
        let[passingyear,setPassingyear]=useState("")
        let[licencenumber,setLicencenumber]=useState("")
        let[email,setEmail]=useState("")
        let[password,setPassword]=useState("")
        let[licencecopy,setLicencecopy]=useState("")
        let[image,setImage]=useState("")
        let[clinicname,setClinicname]=useState("")
        let[buildingdetails,setBuildingdetails]=useState("")
        let[street,setStreet]=useState("")
        let[landmark,setLandmark]=useState("")
        let[city,setCity]=useState("")
        let[district,setDistrict]=useState("")
        let[state,setState]=useState("")
        let[pincode,setPincode]=useState("")
        let[contactno,setContactno]=useState("")
        let navigate = useNavigate();


    function addDataHandler(event){
      event.preventDefault();
            var doctor={first_name:firstname,
            last_name:lastname,
            mob_number:mobnumber,
            qualification:qualification,
            university:university,
            specilization:specilization,
            passing_year:passingyear,
            licence_number:licencenumber,
            email:email,
            password:password,
            licence_copy:licencecopy,
            image:image,
            clinic:{
                clinic_name:clinicname,
                builing_details:buildingdetails,
                street:street,
                landmark:landmark,
                city:city,
                district:district,
                state:state,
                pin_code:pincode,
                contact_no:contactno
            }
            }
            console.log(doctor)
            axios.post('http://localhost:8080/wecare/addNewDoctor',doctor)
            .then(Response=>{
                if(Response.status===200)
                {
                    alert("Account Succefully Created")
                    navigate("/login")
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
        <HomeHeader></HomeHeader>
  <div className="main">
    <div className="container">
      <div className="signup-content">
        <div className="signup-img">
          <img src="/assets/img/reg_form_images/female.jpg" alt="" />
        </div>

        <div className="signup-form">
          <form method="POST" className="register-form" id="register-form">
            <h1><u>DOCTOR REGISTRATION FORM</u></h1>

           

            <div className="form-row">
              <div className="form-group">
                <label htmlFor="f_name">First Name :</label>
                <input type="text" maxLength={"25"} name="name" id="f_name" placeholder="John" required onBlur={(event)=>{setFirstname(event.target.value)}} />
              </div>
              <div className="form-group">
                <label htmlFor="l_name">Last Name :</label>
                <input type="text" maxLength={"25"} placeholder="Doe" name="l_name" id="l_name" required onBlur={(event)=>{setLastname(event.target.value)}}/>
              </div>
            </div>

            
            <div className="form-row">
              <div className="form-group">
                <label htmlFor="mobile">Mobile Number :</label>
                <input type="number" maxLength={"14"} name="mobile" id="mobie" placeholder="+91-7387697939"
                  pattern="+[0-9]{2}-[0-9]{10}" required onBlur={(event)=>{setMobnumber(event.target.value)}} />
              </div>
            </div>

            <div className="form-group">
                <label htmlFor="email">Last Name :</label>
                <input type="email" placeholder="abs@gmail.com" name="email" id="email" required onBlur={(event)=>{setEmail(event.target.value)}}/>
              </div>

            
            <br />
            <h1><u>EDUCATION DETAILS</u></h1>
            <div className="form-row">
              <div className="form-group">
                <label htmlFor="name">Degree Name :</label>
                <input type="text" maxLength={"45"} name="degree" id="degree" placeholder="MBBS" required onBlur={(event)=>{setQualification(event.target.value)}}/>
              </div>
              <div className="form-group">
                <label htmlFor="university">University Name :</label>
                <input type="text" maxLength={"45"} placeholder="Savitribai Phule Pune University" name="clg_name"
                  id="clg_name" required onBlur={(event)=>{setUniversity(event.target.value)}}/>
              </div>

              <br />
            </div>
            <div className="form-row">
              <div className="form-group">
                <label htmlFor="name">Specialization :</label>
                <input type="text" name="special" id="special" placeholder="General / Gynac / Any Other " onBlur={(event)=>{setSpecialization(event.target.value)}}/>
              </div>
              <div className="form-group">
                <label htmlFor="pass">Graduation Year :</label>
                <input type="text" maxLength={"4" }placeholder="2012" name="pass" id="pass" required onBlur={(event)=>{setPassingyear(event.target.value)}}/>
              </div>

              <br />
            </div>

            

            <div className="form-row">
              <div className="form-group">
                <label htmlFor="lic_no">License Number :</label>
                <input type="text" placeholder="123456" name="license" id="license" required onBlur={(event)=>{setLicencenumber(event.target.value)}} />
              </div>
              <br />
            </div>
            <div className="form-row">
            <div className="form-group">
              <label htmlFor="copy">License Copy :</label>
              <input type="file" name="copy" id="copy" required onBlur={(event)=>{setLicencecopy(event.target.value)}}/>
            </div>
            <br/>
            <div className="form-group">
              <label htmlFor="image">Image :</label>
              <input type="file" name="image" id="image" required onBlur={(event)=>{setImage(event.target.value)}} />
            </div>
            </div>




            
            <br />
            <h1><u>CLINIC DETAILS</u></h1>
            <div className="form-row"></div>
            <div className="form-group">
              <label htmlFor="clinic_name">Clinic Name :</label>
              <input type="text" name="clinic_name" id="clinic_name" placeholder="WeCare Clinic" required onBlur={(event)=>{setClinicname(event.target.value)}}/>
            </div>

            


            <div className="form-row">
              <div className="form-group">

                <label htmlFor="building_details">Building Details :</label>
                <input type="text" name="building_details" id="building_details"
                  placeholder="Shri Apartment Building No. 1323" required onBlur={(event)=>{setBuildingdetails(event.target.value)}}/>
              </div>

              <div className="form-group">
                <label htmlFor="landmark">Landmark :</label>
                <input type="text" name="landmark" id="landmark" placeholder="Ganpati Temple" required onBlur={(event)=>{setLandmark(event.target.value)}}/>
              </div>

              <div className="form-group">
                <label htmlFor="clinic_address">Street :</label>
                <input type="text" name="clinic_address" id="clinic_address"
                  placeholder="Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016" required onBlur={(event)=>{setStreet(event.target.value)}} />
              </div>
            </div>



            
            <div className="form-row">
              <div className="form-group">
                <label htmlFor="state">State :</label>
                  <input type="text" name="state" id="state" onBlur={(event)=>{setState(event.target.value)}}/>
              </div>

              <div className="form-group">
                <label htmlFor="district">District :</label>
                  <input type="text" name="district" id="district" onBlur={(event)=>{setDistrict(event.target.value)}}/>
              </div>



              <div className="form-group">
                <label htmlFor="city">City :</label>
                  <input type="text" name="city" id="city" onBlur={(event)=>{setCity(event.target.value)}}/>
            </div>

            <div className="form-row">
              <div className="form-group">
                <label htmlFor="pincode">Pincode :</label>
                <input type="text" name="pincode" id="pincode" placeholder="413701 " onBlur={(event)=>{setPincode(event.target.value)}}/>
              </div>
              <div className="form-group">
                <label htmlFor="clinic_contact">Clinic Contact No. :</label>
                <input type="text" placeholder="+91-7387697939" name="contact_no" id="contact_no" required onBlur={(event)=>{setContactno(event.target.value)}}/>
              </div>
              <div className="form-group">

              </div>
          </div>
              <br />
            </div>

            
            
              <div className="form-group">
                <label htmlFor="name">Create Your Password :</label>
                <input type="password" name="password" id="name" required onBlur={(event)=>{setPassword(event.target.value)}}/>
              </div>
           

            

            <div className="form-submit">
              <input type="button" value="Reset All" className="submit" name="reset" id="reset" />
              <input type="button" value="Submit Form" className="submit" name="submit" id="submit" onClick={addDataHandler}/>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
        </>
    )

}
