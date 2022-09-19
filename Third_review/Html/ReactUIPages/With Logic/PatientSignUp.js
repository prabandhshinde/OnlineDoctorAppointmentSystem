import axios from "axios";
import React from "react";
import { useNavigate } from "react-router";
import { useState } from "react";
import HomeHeader from "./HomeHeader";

export default function PatientSignUp() {

    let[fname,setFname]=useState("")
    let[lname,setLname]=useState("")
    let[mob,setMob]=useState(0)
    let[password,setPassword]=useState("")
    let[dob,setDob]=useState("")
    let[gender,setGender]=useState("")
    let[blood,setBlood]=useState("")
    let navigate = useNavigate();

    function addDataHandler(event){
      event.preventDefault();
      var patient={
        first_name:fname,
        last_name:lname,
        mob_number:mob,
        password:password,
        date_of_birth:dob,
        gender:gender,
        blood_group:blood
      }
      console.log(patient)
      axios.post('http://localhost:8080/wecare/addpatient',patient)
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

  return (
    <>
    <HomeHeader></HomeHeader>
      <body>
        <div className="main">
          <div className="container">
            <div className="signup-content">
              <div className="signup-img">
                <img src="/assets/img/reg_form_images/signup.webp" alt="" />
              </div>

              <div className="signup-form">
                  <h2>
                    <u>patient registration form</u>
                  </h2>
                  <div className="form-row">
                    <div className="form-group">
                      <label for="fname">First Name :</label>
                      <input
                        type="text"
                        name="fname"
                        maxlength="25"
                        id="fname"
                        placeholder="John"
                        required onChange={(event)=>{setFname(event.target.value)}}
                      />
                    </div>
                    <div className="form-group">
                      <label for="last_name">Last Name :</label>
                      <input
                        type="text"
                        maxlength="25"
                        placeholder="Doe"
                        name="last_name"
                        id="last_name"
                        required onChange={(event)=>{setLname(event.target.value)}}
                      />
                    </div>
                  </div>
                  <div className="signup-form"></div>
                  <div className="form-group">
                    <label for="mobile">Mobile Number :</label>
                    <input
                      type="number"
                      maxlength="14"
                      name="mobile"
                      id="mobile"
                      placeholder="+91-7387697939"
                      pattern="+[0-9]{2}-[0-9]{10}"
                      required onChange={(event)=>{setMob(event.target.value)}}
                    />
                    <br />
                  </div>
                  <div className="signup-form"></div>

                  <div className="form-radio">
                    <label for="gender" className="radio-label">
                      Gender :
                    </label>
                    <div className="form-radio-item">
                      <input type="radio" name="gender" id="male" value="M" onChange={(event)=>{setGender(event.target.value)}}/>
                      <label for="male">Male</label>
                      <span className="check"></span>
                    </div>
                    <div className="form-radio-item">
                      <input type="radio" name="gender" id="female" value="F" onChange={(event)=>{setGender(event.target.value)}}/>
                      <label for="female">Female</label>
                      <span className="check"></span>
                    </div>
                  </div>

                  <div className="form-group">
                    <label for="birth_date">Date Of Birth :</label>
                    <input type="date" name="birth_date" id="birth_date" onChange={(event)=>{setDob(event.target.value)}}/>
                  </div>

                  <div className="form-group">
                    <label for="name">Create Your Password :</label>
                    <input type="password" name="password" id="name" required onChange={(event)=>{setPassword(event.target.value)}}/>
                  </div>

                  <div className="form-group">
                    <label for="name">Blood Group :</label>
                    <input type="text" name="blood_group" id="state" required onChange={(event)=>{setBlood(event.target.value)}}/>
                  </div>

                  <div className="form-submit">
                    <input
                      type="button"
                      value="Reset All"
                      className="submit"
                      name="reset"
                      id="reset"
                    />
                    <input
                      type="button"
                      value="Submit Form"
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
      </body>
    </>
  );
}
