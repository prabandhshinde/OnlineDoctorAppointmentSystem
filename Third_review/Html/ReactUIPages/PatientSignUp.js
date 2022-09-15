export default function PatientSignUp() {
  return (
    <>
      <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta http-equiv="X-UA-Compatible" content="ie=edge" />
        <title>Patient Details</title>

        <link
          rel="stylesheet"
          href="fonts/material-icon/css/material-design-iconic-font.min.css"
        />

        <link rel="stylesheet" href="assets/css/style1.css" />
      </head>
      <body>
        <div class="main">
          <div class="container">
            <div class="signup-content">
              <div class="signup-img">
                <img src="assets/img/reg_form_images/signup.webp" alt="" />
              </div>

              <div class="signup-form">
                <form method="POST" class="register-form" id="register-form">
                  <h2>
                    <u>patient registration form</u>
                  </h2>
                  <div class="form-row">
                    <div class="form-group">
                      <label for="name">First Name :</label>
                      <input
                        type="text"
                        name="name"
                        maxlength="25"
                        id="name"
                        placeholder="John"
                        required
                      />
                    </div>
                    <div class="form-group">
                      <label for="last">Last Name :</label>
                      <input
                        type="text"
                        maxlength="25"
                        placeholder="Doe"
                        name="last"
                        id="last_name"
                        required
                      />
                    </div>
                  </div>
                  <div class="signup-form"></div>
                  <div class="form-group">
                    <label for="address">Mobile Number :</label>
                    <input
                      type="number"
                      maxlength="14"
                      name="mobile"
                      id="address"
                      placeholder="+91-7387697939"
                      pattern="+[0-9]{2}-[0-9]{10}"
                      required
                    />
                    <br />
                  </div>
                  <div class="signup-form"></div>

                  <div class="form-radio">
                    <label for="gender" class="radio-label">
                      Gender :
                    </label>
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

                  <div class="form-group">
                    <label for="birth_date">Date Of Birth :</label>
                    <input type="date" name="birth_date" id="birth_date" />
                  </div>

                  <div class="form-group">
                    <label for="name">Create Your Password :</label>
                    <input type="password" name="password" id="name" required />
                  </div>

                  <div class="form-group">
                    <label for="name">Blood Group :</label>
                    <input type="text" name="blood_group" id="state" required />
                  </div>

                  <div class="form-submit">
                    <input
                      type="submit"
                      value="Reset All"
                      class="submit"
                      name="reset"
                      id="reset"
                    />
                    <input
                      type="submit"
                      value="Submit Form"
                      class="submit"
                      name="submit"
                      id="submit"
                    />
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>

        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="js/main.js"></script>
      </body>

      {/* <body>
        <div class="main">
          <div class="container">
            <div class="signup-content">
              <div class="signup-img">
                <img src="assets/img/reg_form_images/signup.webp" alt="" />
              </div>

              <div class="signup-form">
                <form method="POST" class="register-form" id="register-form">
                  <h2>
                    <u>patient registration form</u>
                  </h2>
                  <div class="form-row">
                    <div class="form-group">
                      <label for="name">First Name :</label>
                      <input
                        type="text"
                        name="name"
                        maxlength="25"
                        id="name"
                        placeholder="John"
                        required
                      />
                    </div>
                    <div class="form-group">
                      <label for="last">Last Name :</label>
                      <input
                        type="text"
                        maxlength="25"
                        placeholder="Doe"
                        name="last"
                        id="last_name"
                        required
                      />
                    </div>
                  </div>
                  <div class="signup-form"></div>
                  <div class="form-group">
                    <label for="address">Mobile Number :</label>
                    <input
                      type="number"
                      maxlength="14"
                      name="mobile"
                      id="address"
                      placeholder="+91-7387697939"
                      pattern="+[0-9]{2}-[0-9]{10}"
                      required
                    />
                    <br />
                  </div>
                  <div class="signup-form"></div>

                  <div class="form-radio">
                    <label for="gender" class="radio-label">
                      Gender :
                    </label>
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

                  <div class="form-group">
                    <label for="birth_date">Date Of Birth :</label>
                    <input type="date" name="birth_date" id="birth_date" />
                  </div>

                  <div class="form-group">
                    <label for="name">Create Your Password :</label>
                    <input type="password" name="password" id="name" required />
                  </div>

                  <div class="form-group">
                    <label for="name">Blood Group :</label>
                    <input type="text" name="blood_group" id="state" required />
                  </div>

                  <div class="form-submit">
                    <input
                      type="submit"
                      value="Reset All"
                      class="submit"
                      name="reset"
                      id="reset"
                    />
                    <input
                      type="submit"
                      value="Submit Form"
                      class="submit"
                      name="submit"
                      id="submit"
                    />
                  </div>
                </form>
              </div>
            </div>
          </div>
        </div>
      </body> */}
    </>
  );
}
