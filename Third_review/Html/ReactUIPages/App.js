import DrList from "./DrList";
import DrTimeSlot from "./DrTimeSlot";
import Home from "./Home";
import LogIn from "./LogIn";
import {
  BrowserRouter as Roter,
  Switch,
  Route,
  Link,
  Router,
  Routes,
  BrowserRouter,
} from "react-router-dom";
import { Provider } from "react";
import DoctorSignUp from "./DoctorSignUp";
import PatientSignUp from "./PatientSignUp";
import PatientProfile from "./PatientProfile";
import PatientHistory from "./PatientHistory";
import DoctorDailyAppointment from "./DoctorDailyAppointment";

function App() {
  return (
    <>
      {/*<DrTimeSlot></DrTimeSlot> */}
      {/* <Home></Home>*/}
      {/* <DrList></DrList>*/}

      {/* <LogIn></LogIn>*/}
      {/*<DrTimeSlot></DrTimeSlot>

        <DoctorSignUp></DoctorSignUp>*/}

      <BrowserRouter>
        <Routes>
          <Route exact path="/" element={<Home />}></Route>
          <Route path="/LogIn" element={<LogIn />} />
          <Route path="/DrList" element={<DrList />} />
          <Route path="/DoctorSignUp" element={<DoctorSignUp />} />
          <Route path="/PatientSignUp" element={<PatientSignUp />} />
          <Route path="/PatientProfile" element={<PatientProfile />} />
          <Route path="/PatientHistory" element={<PatientHistory />} />
          <Route path="/DrTimeSlot" element={<DrTimeSlot />} />
          <Route
            path="/DoctorDailyAppointment"
            element={<DoctorDailyAppointment />}
          />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
