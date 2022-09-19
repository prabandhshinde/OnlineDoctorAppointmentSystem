import React from "react";

export default function Header()
{
    return(
        <div>
            <header id="header" className="fixed-top">
    <div className="container d-flex align-items-center">

      <h1 className="logo me-auto"><a href="index.html">WeCare</a></h1>
      
       <a href="index.html" className="logo me-auto"><img src="/assets/img/logo.png" alt="" className="img-fluid"/></a>

      <nav id="navbar" className="navbar order-last order-lg-0">
    <ul>
      <li><a className="nav-link scrollto active" href="#hero">Home</a></li>
      <li><a className="nav-link scrollto" href="#faq">F.A.Q.</a></li>
      <li><a className="nav-link scrollto" href="#contact">Contact</a></li>
		  <li className="dropdown"><a href="#" className="appointment-btn scrollto"><span className="d-none d-md-inline" style={{"color":"white"}}> Make an Appointment  </span> </a> 
		      <ul>
            <li><a href="#">SignIn</a></li>
            <li className="dropdown"><a href="#"><span>SignUp</span> <i className="bi bi-chevron-right"></i></a>
              <ul>
                  <li><a href="#">As Doctor</a></li>
                  <li><a href="#">As Patient</a></li>
                  <li><a href="#">As Admin</a></li>
                </ul>
              </li>
	        </ul>
      </li>
    </ul>
    <i className="bi bi-list mobile-nav-toggle"></i>
    </nav>
    </div>
  </header>
        </div>
    )
}