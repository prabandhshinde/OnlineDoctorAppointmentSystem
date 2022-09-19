import axios from "axios";
import React from "react";
import { useNavigate } from "react-router";
import { useState } from "react";
import HomeHeader from "./HomeHeader";

export default function ForgetPassword()
{
    let[mob,setMob]=useState(0);
    let[password,setPassword]=useState("")
    let [role,setRole] = useState("")
    let navigate = useNavigate();

    function PasswordHandler(e)
    {
            e.preventDefault();
            if(role==="Doctor"){
            axios.post('http://localhost:8080/wecare/forgetpassword/doctor/',{mob,password})
            .then(Response=>{
                if(Response.status===200)
                {
                    alert("Password Successfully Changed")
                    navigate("/login")
                }else{
                    alert("Invalid Username")
                }
            })
            .catch(e=>{
              console.log(e)
              alert("Something went Wrong Try Again")
            })
        }else if(role==="Patient"){
            axios.post('http://localhost:8080/wecare/forgetpassword/patient/',{mob,password})
            .then(Response=>{
                if(Response.status===200)
                {
                    alert("Password Successfully Changed")
                    navigate("/login")
                }else{
                    alert("Invalid Username")
                }
            })
            .catch(e=>{
              console.log(e)
              alert("Something went Wrong Try Again")
            })
        }
    }


    return(<>
    <HomeHeader></HomeHeader>
    <section className="vh-100" style={{"backgroundColor": "#fff"}}>
            <div className="container py-5 h-100">
              <div className="row d-flex justify-content-center align-items-center h-100">
                <div className="col col-xl-10">
                  <div className="card" style={{"borderRadius": "1rem"}}>
                    <div className="row g-0">
                      <div className="col-md-6 col-lg-5 d-none d-md-block">
                        <img src="/assets/img/forgotpassword.jpg" width="100%" height="100%"
                       
                       
                          alt="login form"  style={{"borderRadius": "1rem 0 0 1rem"}}  />
                      </div>
                      <div className="col-md-6 col-lg-7 d-flex align-items-center">
                        <div className="card-body p-4 p-lg-5 text-black">
          
                            <div className="d-flex align-items-center mb-3 pb-1">
                              <i className="fas fa-cubes fa-2x me-3" style={{"color": "#ff6219"}}></i>
                              <span className="h1 fw-bold mb-0" style={{"textAlign":"center"}}>Forgot Password</span>
                            </div>
          
                            <div className="form-radio-item">
                                  <label htmlFor="radio"> Doctor </label>  <input type="radio" id="radio" name="r1" style={{"margin-right":"130px"}} value="Doctor" onChange={(event=>{setRole(event.target.value)})}/>
                              </div>
                              <div className="form-radio-item">
                                  <label htmlFor="radio1"> Patient </label> <input type="radio" id="radio1" name="r1"  style={{"margin-right":"130px;"}} value="Patient" onChange={(event=>{setRole(event.target.value)})}/>
                                </div>  
                            
          
                            <div className="form-outline mb-4">
                              <input type="number" id="mob" name="mob" placeholder="Mobile Number "className="form-control form-control-lg" onChange={(event)=>{setMob(event.target.value)}} />
                              <label className="form-label" htmlFor="mob">Mobile Number</label>
                            </div>
          
                            <div className="form-outline mb-4">
                              <input type="password" id="password" placeholder="Password" name="password" className="form-control form-control-lg" onChange={(event)=>{setPassword(event.target.value)}} />
                              <label className="form-label" htmlFor="password">New Password</label>
                            </div>
          
                            <div className="pt-1 mb-4">
                              <button className="btn btn-dark btn-lg btn-block" type="button" onClick={PasswordHandler}>Change Password</button>
                            </div>   
          
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </section>
    </>)
}