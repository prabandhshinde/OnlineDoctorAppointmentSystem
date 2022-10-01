import { useState } from "react"
//import { useDispatch} from "react-redux"
import { useNavigate } from "react-router"
import axios from "axios"
import HomeHeader from "./HomeHeader"

export default function Login1()
{

  let [mob,setMob] = useState("")
  let [password,setPassword] = useState("")
  let [role,setRole] = useState("")
  let navigate = useNavigate()
  
  //const dispatch= useDispatch()
 
  function loginHandler()
  {
        console.log({mob,password})
        console.log(role)
      if(role==="Doctor"){
        axios.post('http://localhost:8080/wecare/login/doctor',{mob,password})
      .then(data =>{
            console.log(data.data)
           if(data.data === "password incorrect" || data.data === "incorrect username")
           {
            alert(data.data)
              navigate("/login")
           }else{
            var verifieduser=data.data
           // dispatch({type:"save",payload:{id:verifieduser.doctor_id,First_name:verifieduser.first_name,Last_name:verifieduser.last_name}})
            sessionStorage.setItem('doctorlogin',JSON.stringify(verifieduser));
            navigate("/doctor/profile")
           }
      } );
              
 }else if(role==="Patient")
  {
    axios.post('http://localhost:8080/wecare/login/patient',{mob,password})
      .then(data =>{
            console.log(data.data)
           if(data.data === "password incorrect" || data.data === "incorrect username")
           {
            alert(data.data)
              navigate("/login")
           }else{
            var verifieduser=data.data
          //  dispatch({type:"save",payload:{id:verifieduser.patient_id,First_name:verifieduser.first_name,Last_name:verifieduser.last_name}})
            sessionStorage.setItem('patientlogin',JSON.stringify(verifieduser));
            navigate("/patient/profile")
           }
      } );
  }
}


    return(
        <>
        <HomeHeader></HomeHeader>
        <section className="vh-100" style={{"backgroundColor": "#b6c6d8"}}>
            <div className="container py-5 h-100">
              <div className="row d-flex justify-content-center align-items-center h-100">
                <div className="col col-xl-10">
                  <div className="card" style={{"borderRadius": "1rem"}}>
                    <div className="row g-0">
                      <div className="col-md-8 col-lg-6 d-none d-md-block">
                        <img src="/assets/img/login.jpg" width="100%" height="100%"
                          alt="login form"  style={{"borderRadius": "1rem 0 0 1rem"}}  />
                      </div>
                      <div className="col-md-4 col-lg-6 d-flex align-items-center">
                        <div className="card-body p-4 p-lg-5 text-black">
          
                            <div className="d-flex align-items-center mb-3 pb-1">
                              <i className="fas fa-cubes fa-2x me-3" style={{"color": "#ff6219"}}></i>
                              <span className="h1 fw-bold mb-0" style={{"text-align":"center"}}>Sign In</span>
                            </div>
          
                            <div className="form-radio-item">
                                    <label for="radio"> Doctor </label>
                                    <input type="radio" name="r1" id="radio" value="Doctor" onClick={(event=>{setRole(event.target.value);console.log(role)})}/>
                                    <span className="check"></span>
                            </div>

                            <div className="form-radio-item">
                                    <label for="radio1"> Patient </label>
                                    <input type="radio" name="r1" id="radio1" value="Patient" onClick={(event=>{setRole(event.target.value);console.log(role)})}/>
                                    <span className="check"></span>
                            </div>
          
                            <div className="form-outline mb-4">
                              <input type="email" id="form2Example17" name="uname" placeholder=" Email/Mobile Number "className="form-control form-control-lg" onBlur={(e)=>{setMob(e.target.value)}}/>
                              <label className="form-label" htmlFor="form2Example17">Email address</label>
                            </div>
          
                            <div className="form-outline mb-4">
                              <input type="password" id="form2Example27" placeholder="Password" name="password" className="form-control form-control-lg" onBlur={(e)=>{setPassword(e.target.value)}}/>
                              <label className="form-label" htmlFor="form2Example27">Password</label>
                            </div>
          
                            <div className="pt-1 mb-4">
                              <button className="btn btn-dark btn-lg btn-block" type="button" onClick={loginHandler}>Sign In</button>
                            </div>
          
                            <a className="small text-muted" href="/forgetpassword">Forgot password?</a>
                            <p className="mb-5 pb-lg-2" style={{"color": "#393f81"}}>Don't have an account? <a href="#!"
                                style={{"color": "#393f81"}}>Register here</a></p>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </section>

        </>
    )
}