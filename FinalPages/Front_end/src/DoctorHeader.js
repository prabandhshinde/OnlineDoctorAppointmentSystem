export default function DoctorHeader() {
    return (
      <>
        <div id="topbar" className="d-flex align-items-center fixed-top">
          <div className="container d-flex justify-content-between">
            <div className="contact-info d-flex align-items-center">
           </div>
            <div className="d-none d-lg-flex social-links align-items-center"></div>
          </div>
        </div>
        <header id="header" class="fixed-top">
          <div class="container d-flex align-items-center">
            <h1 class="logo me-auto">
              <a href="/">WeCare</a>
            </h1>
  
            <a href="/" class="logo me-auto">
              <img src="assets/img/logo.png" alt="" class="img-fluid" />
            </a>
  
            <nav id="navbar" class="navbar order-last order-lg-0">
              <ul>
                <li>
                  <a class="nav-link scrollto active" href="/doctor/profile">
                    View Profile
                  </a>
                </li>
                <li>
                  <a class="nav-link scrollto active" href="#">
                    Today's Slot
                  </a>
                </li>

                <li>
                  <a class="nav-link scrollto active" href="#">
                    History
                  </a>
                </li>

              </ul>
            </nav>
  
            <a href="/doctor/slots" class="appointment-btn scrollto">
              <span class="d-none d-md-inline">Fill the Slot</span>
            </a>
          </div>
        </header>
      </>
    );
  }
  