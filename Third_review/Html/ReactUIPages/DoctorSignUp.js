

export default function DoctorSignUp()
{
    return(
        <>
        <head>
  <meta charset="UTF-8" />
  <meta name="viewport" content="width=device-width, initial-scale=1.0" />
  <meta http-equiv="X-UA-Compatible" content="ie=edge" />
  <title>Doctor Details</title>

  
  <link rel="stylesheet" href="fonts/material-icon/css/material-design-iconic-font.min.css" />

 
  <link rel="stylesheet" href="assets/css/style1.css" />
</head>

<body>
  <div class="main">
    <div class="container">
      <div class="signup-content">
        <div class="signup-img">
          <img src="assets/img/reg_form_images/female.jpg" alt="" />
        </div>

        <div class="signup-form">
          <form method="POST" class="register-form" id="register-form">
            <h1><u>DOCTOR REGISTRATION FORM</u></h1>

           

            <div class="form-row">
              <div class="form-group">
                <label for="name">First Name :</label>
                <input type="text" maxlength="25" name="name" id="name" placeholder="John" required />
              </div>
              <div class="form-group">
                <label for="l_name">Last Name :</label>
                <input type="text" maxlength="25" placeholder="Doe" name="l_name" id="l_name" required />
              </div>
            </div>

            
            <div class="form-row">
              <div class="form-group">
                <label for="mobile">Mobile Number :</label>
                <input type="number" maxlength="14" name="mobile" id="mobie" placeholder="+91-7387697939"
                  pattern="+[0-9]{2}-[0-9]{10}" required />
              </div>
            </div>

            
            <div class="form-radio">
              <label for="gender" class="radio-label">Gender :</label>
              <div class="form-radio-item">
                <input type="radio" name="gender" id="male" />
                <label for="male">Male</label>
                <span class="check"></span>
              </div>
              <div class="form-radio-item">
                <input type="radio" name="gender" id="female" />
                <label for="female">Female</label>
                <span class="check"></span>
              </div>
            </div>

            
            <br />
            <h1><u>EDUCATION DETAILS</u></h1>
            <div class="form-row">
              <div class="form-group">
                <label for="name">Degree Name :</label>
                <input type="text" maxlength="45" name="degree" id="degree" placeholder="MBBS" required />
              </div>
              <div class="form-group">
                <label for="university">University Name :</label>
                <input type="text" maxlength="45" placeholder="Savitribai Phule Pune University" name="clg_name"
                  id="clg_name" required />
              </div>

              <br />
            </div>
            <div class="form-row">
              <div class="form-group">
                <label for="name">Specialization :</label>
                <input type="text" name="special" id="special" placeholder="General / Gynac / Any Other " />
              </div>
              <div class="form-group">
                <label for="university">Passing Year :</label>
                <input type="text" maxlength="4" placeholder="2012" name="pass" id="pass" required />
              </div>

              <br />
            </div>

            

            <div class="form-row">
              <div class="form-group">
                <label for="name">Experience(in yrs (If Any) ) :</label>
                <input type="text" name="exp" id="exp" placeholder="1.5 ( 1 year 5 months ) " required />
              </div>
              <div class="form-group">
                <label for="lic_no">License Number :</label>
                <input type="text" placeholder="123456" name="license" id="license" required />
              </div>

              <br />
            </div>

            <div class="form-group">
              <label for="name">License Copy :</label>
              <input type="file" name="copy" id="copy" required />
            </div>




            
            <br />
            <h1><u>CLINIC DETAILS</u></h1>
            <div class="form-row"></div>
            <div class="form-group">
              <label for="clinic_name">Clinic Name :</label>
              <input type="text" name="clinic_name" id="clinic_name" placeholder="WeCare Clinic" required />
            </div>

            


            <div class="form-row">
              <div class="form-group">

                <label for="building_details">Building Details :</label>
                <input type="text" name="building_details" id="building_details"
                  placeholder="Shri Apartment Building No. 1323" required />
              </div>

              <div class="form-group">
                <label for="landmark">Landmark :</label>
                <input type="text" name="landmark" id="landmark" placeholder="Ganpati Temple" required />
              </div>

              <div class="form-group">
                <label for="clinic_address">Street :</label>
                <input type="text" name="clinic_address" id="clinic_address"
                  placeholder="Akshya Nagar 1st Block 1st Cross, Rammurthy nagar, Bangalore-560016" required />
              </div>
            </div>



            
            <div class="form-row">
              <div class="form-group">
                <label for="state">State :</label>
                <div class="form-select">
                  <select name="state" id="state">
                    <option value=""></option>
                    <option value="mh">Maharashtra</option>
                    <option value="cg">Chhattisgarh</option>
                  </select>
                  <span class="select-icon"><i class="zmdi zmdi-chevron-down"></i></span>
                </div>
              </div>

              <div class="form-group">
                <label for="district">District :</label>
                <div class="form-select">
                  <select name="district" id="district">
                    <option value=""></option>
                    <option value="pune">Pune</option>
                    <option value="mumbai">Mumbai</option>
                  </select>
                  <span class="select-icon"><i class="zmdi zmdi-chevron-down"></i></span>
                </div>
              </div>



              <div class="form-group">
                <label for="city">City :</label>
                <div class="form-select">
                  <select name="city" id="city">
                    <option value=""></option>
                    <option value="losangeles">Los Angeles</option>
                    <option value="washington">Washington</option>
                  </select>
                  <span class="select-icon"><i class="zmdi zmdi-chevron-down"></i></span>
                </div>
              </div>
            </div>

            <div class="form-row">
              <div class="form-group">
                <label for="pincode">Pincode :</label>
                <input type="text" name="pincode" id="pincode" placeholder="413701 " />
              </div>
              <div class="form-group">
                <label for="clinic_contact">Clinic Contact No. :</label>
                <input type="text" placeholder="+91-7387697939" name="contact_no" id="contact_no" required />
              </div>
              <div class="form-group">

              </div>

              <br />
            </div>


            
            
              <div class="form-group">
                <label for="name">Create Your Password :</label>
                <input type="password" name="password" id="name" required />
              </div>
           

            

            <div class="form-submit">
              <input type="submit" value="Reset All" class="submit" name="reset" id="reset" />
              <input type="submit" value="Submit Form" class="submit" name="submit" id="submit" />
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>
</body>
        </>
    )

}