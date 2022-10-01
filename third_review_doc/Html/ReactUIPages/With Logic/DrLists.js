import { useDispatch} from "react-redux"
import React from "react";
import { useNavigate } from "react-router-dom";
export default function DrLists(props) {
  const img = props.img;
  const name = props.name;
  const spec = props.spec;
  const clinic=props.clinic;
  const id=props.id;
  const clinic_id=props.clinic_id;
  //const dispatch= useDispatch()
  let navigate=useNavigate();
  function handler1()
  {
    //dispatch({type:"doctor_select",payload:{doctor_id:id,clinic_id:clinic_id}})
    sessionStorage.setItem('doctor_select',JSON.stringify({doctor_id:id,clinic_id:clinic_id,clinic_name:clinic,doctor_name:name}))
    navigate('/Appointment');
  }


  return (
    <div class="col-lg-6">
      <div class="member d-flex align-items-start">
        <div class="pic">
          <img
            src="assets/img/doctors/doctors-1.jpg"
            class="img-fluid"
            alt=""
          />
        </div>
        <div class="member-info">
          <h4>{name}</h4>
          <h3>{clinic}</h3>
          <span>{spec}</span>
          <p>Explicabo voluptatem mollitia et repellat qui dolorum quasi</p>
          <p>
            <a href="#doctors" class="appointment-btn scrollto">
              <span class="d-none d-md-inline" onClick={handler1}>Book Appointment</span>
            </a>
          </p>
        </div>
      </div>
    </div>
  );
}
