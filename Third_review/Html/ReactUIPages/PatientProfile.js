import PatientHeader from "./PatientHeader";
const myStyle={
  backgroundImage: 
  "url('assets/img/login.jpg')",
      
         fontSize:'50px',
         backgroundSize: 'cover',
         backgroundRepeat: 'no-repeat',};
export default function PatientProfile() {
  
  return (
    <div>
      <PatientHeader></PatientHeader>
      
      <div>

        <main id="main">
          <section id="doctors" class="doctors">
            <div class="container">
              <div class="section-title">
                <br />
                <br />
                <br />
                <br />
                <h2>Patioent's Profile</h2>
              </div>
            </div>
            <div class="row">
              <div className="col-lg-4 d-flex ">
                <img
                  src="assets/img/login.jpg"
                  width="100%"
                  height="100%"
                  alt="login form"
                  style={{ "border-radius": "1rem 0 0 1rem;" }}
                />
              </div>
              <div className="col-lg-8 d-flex ">
                <div class="container">
                  <div class="row">
                    <div class="col-lg-4 d-flex ">
                      <div>
                        <h3>First Name</h3>
                        <h3>Last Name</h3>
                        <h3>Mobile Number</h3>
                        <h3>Date of Birth</h3>
                        <h3>Gender</h3>
                        <h3>Blood Group</h3>
                      </div>
                    </div>
                    <div class="col-lg-8 d-flex ">
                      <div>
                        <h3>: Prabandh</h3>
                        <h3>: Shinde</h3>
                        <h3>: 9689361857</h3>
                        <h3>: 25/11/1995</h3>
                        <h3>: Male</h3>
                        <h3>: O +ve</h3>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div style={{"textAlign":"center"}}>
            <a href="/DrList" class="appointment-btn scrollto">
                      <span class="d-none d-md-inline">Edit Profile</span>
                      </a>
            </div>  
          </section>
        </main>
      </div>
    </div>
  );
}
