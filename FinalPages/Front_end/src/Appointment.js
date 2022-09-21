import { useNavigate } from "react-router-dom";
import React, { useEffect, useState } from "react";
import { Button } from "react-bootstrap";
import HomeHeader from "./HomeHeader";
import axios from "axios";

export default function Appointment()
{
    /*let[appointment1,setAppointment]=useState([{ t1: "11:00", isSelected: 0 }, { t1: "11:15", isSelected: 0 }, { t1: "11:30", isSelected: 0 }, { t1: "11:45", isSelected: 0 }
    , { t1: "12:00", isSelected: 0 }, { t1: "12:15", isSelected: 0 }, { t1: "12:30", isSelected: 0 }, { t1: "12:45", isSelected: 0 }
    , { t1: "13:00", isSelected: 0 }, { t1: "13:15", isSelected: 0 }, { t1: "13:30", isSelected: 0 }])*/
    let[appointment1,setAppointment]=useState([]);
    let[btn,setBtn]=useState([])
    let navigate=useNavigate();
    useEffect(()=>{
        let doctor=JSON.parse(sessionStorage.getItem('doctor_select'));
        var newdate=new Date();
        let year=newdate.getFullYear();
        let month=newdate.getMonth();
        let day=newdate.getDate();
        let slotdate=year+"-"+(month+1)+"-"+day;
        console.log(slotdate)
        
        let newpatient=JSON.parse(sessionStorage.getItem('patientlogin'));
        if(newpatient!==null)
        {
        axios.get('http://localhost:8080/wecare/getslot/'+doctor.doctor_id+'/'+slotdate)
            .then(Response=>{
                if(Response.status===200)
                {
                    console.log(Response.data);
                   setAppointment(Response.data);
                   handler()
                }else{
                    alert("Data Not Found");
                }
            })
            .catch(e=>{
              console.log(e);
              alert("Something went Wrong Try Again")
            })
        }else{
            alert('Please Login First')
                  navigate('/login')
        }
    })

    let handler=()=>{
        let btn;
        console.log(appointment1);
        btn = appointment1.map((element, index) => {
            if (element.is_booked === true) {
                console.log(element.slot_start_time);
                return ((<Button variant={"outline-danger"} disabled={true} key={index}>{element.slot_start_time}</Button>))
            }
            if (element.is_booked === false) {
                console.log(element.slot_start_time);
                return (<Button key={index} onClick={handler2} value={element.slot_start_time}>{element.slot_start_time}</Button>)
            }
        })
        setBtn(btn);
    }

    let handler2 = (event) => {
        let val = event.target.value;
        console.log(val);
        let newApp = appointment1;
        for(var i=0;i<newApp.length;i++)
        {
            if(newApp[i].slot_start_time===val)
            {
                console.log(val);
                localStorage.setItem('slot_time',val);
                newApp[i].is_booked=true;
                break;
            }
        }
        navigate("/confirm");
        setAppointment(newApp);
        console.log(appointment1)
    }


    return(
        <>
        <div id="booking" className="section">
        <HomeHeader></HomeHeader>
		<div className="section-center">
			<div className="container">
				<div className="row">
					<div className="booking-form">
						<div className="booking-bg">
							<div className="form-header">
								<h2>Make your Appointment</h2>
							
							</div>
						</div>
						         <form>
									<div className="Sign p-3 mb-1 bg-body rounded" >{btn}</div>
								</form>
					</div>
				</div>
			</div>
		</div>
	</div>
        </>
    )
}