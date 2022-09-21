import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import reportWebVitals from './reportWebVitals';
import { BrowserRouter, Route, Routes } from 'react-router-dom';
import Appointment1 from './Appointment1';
import Home from './Home';
import Drlist from './Drlist';
import DoctorSignUp from './DoctorSignUp';
import DrTimeSlot from './DrTimeSlot';
import { Provider } from 'react-redux';
import Store from './store/reducer';
import Login1 from './Login1';
import PatientSignUp from './PatientSignUp';
import ForgetPassword from './ForgetPassword';
import PatientProfile from './PatientProfile';
import Appointment from './Appointment';
import Logout from './Logout';
import Confirm from './Confirm';
import DoctorProfile from './DoctorProfile';
import PatientHistory from './PatientHistory';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <BrowserRouter>
    <Provider store={Store}>
    <Routes>
      <Route exact path='/' element={<Home/>}></Route>
      <Route path='/login' element={<Login1></Login1>}></Route>
      <Route path='/doctors' element={<Drlist/>}></Route>
      <Route path='/Appointment' element={<Appointment/>}></Route>
      <Route path='/doctor/signup' element={<DoctorSignUp/>}></Route>
      <Route path='/patient/signup' element={<PatientSignUp/>}></Route>
      <Route path='/slots' element={<DrTimeSlot></DrTimeSlot>}></Route>
      <Route path='/forgetpassword' element={<ForgetPassword/>}></Route>

      <Route path='/list' element={<Drlist></Drlist>}></Route>
      <Route path='/patient/profile' element={<PatientProfile/>}></Route>
      <Route path='/doctor/slots' element={<DrTimeSlot/>}></Route>
      <Route path='/logout' element={<Logout></Logout>}></Route>
      <Route path='/confirm' element={<Confirm/>}></Route>
      <Route path='/doctor/profile' element={<DoctorProfile/>}></Route>
      <Route path='/patient/history' element={<PatientHistory/>}></Route>
    </Routes>
    </Provider>
</BrowserRouter>
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
