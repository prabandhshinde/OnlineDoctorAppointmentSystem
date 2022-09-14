import DrList from "./DrList";
import DrTimeSlot from "./DrTimeSlot";
import Home from "./Home";
import LogIn from "./LogIn";
import { BrowserRouter as Roter, Switch, Route, Link, Router, Routes, BrowserRouter
}  from "react-router-dom";
import { Provider } from "react";
import DoctorSignUp from "./DoctorSignUp";


function App() {
  return (
    <>
        {/*<DrTimeSlot></DrTimeSlot> */}
       {/* <Home></Home>*/}
         {/* <DrList></DrList>*/}

        {/* <LogIn></LogIn>*/}
        {/*<DrTimeSlot></DrTimeSlot>*/}

        <DoctorSignUp></DoctorSignUp>


{/*
      <BrowserRouter >
    
    <Routes>
      <Route exact path="/" element={<Home />}>
      </Route>
      
      <Route path="/LogIn" element={ <LogIn />}/>
      <Route path="/DrList" element={ <DrList />}/>
      
      
    </Routes>
   
  </BrowserRouter>  */}

  


    </>
  );
}

export default App;
