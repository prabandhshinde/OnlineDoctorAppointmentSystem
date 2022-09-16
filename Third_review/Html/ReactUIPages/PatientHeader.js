export default function PatientHeader() {
  return (
    <>
      <div id="topbar" className="d-flex align-items-center fixed-top">
        <div className="container d-flex justify-content-between">
          <div className="contact-info d-flex align-items-center">
            <i className="bi bi-envelope"></i>{" "}
            <a href="mailto:contact@example.com">suryakantdhumale@gmail.com</a>
            <i className="bi bi-phone"></i> +91 9049 181 054
          </div>
          <div className="d-none d-lg-flex social-links align-items-center"></div>
        </div>
      </div>
      <header id="header" class="fixed-top">
        <div class="container d-flex align-items-center">
          <h1 class="logo me-auto">
            <a href="#">WeCare</a>
          </h1>

          <a href="index.html" class="logo me-auto">
            <img src="assets/img/logo.png" alt="" class="img-fluid" />
          </a>

          <nav id="navbar" class="navbar order-last order-lg-0">
            <ul>
              <li>
                <a class="nav-link scrollto active" href="/PatientProfile">
                  View Profile
                </a>
              </li>
              <li>
                <a class="nav-link scrollto active" href="/PatientHistory">
                  History
                </a>
              </li>
            </ul>
          </nav>

          <a href="/DrList" class="appointment-btn scrollto">
            <span class="d-none d-md-inline">Book an Appointment</span>
          </a>

          <a href="/" class="appointment-btn scrollto">
            <span class="d-none d-md-inline">LogOut</span>
          </a>
        </div>
      </header>
    </>
  );
}
