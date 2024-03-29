import DoctorHeader from "./DoctorHeader";

export default function DrTimeSlot() {
  return (
    <>
      <head>
        <meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <meta http-equiv="X-UA-Compatible" content="ie=edge" />
        <title>Doctor Time Slot Details</title>

        <link
          rel="stylesheet"
          href="fonts/material-icon/css/material-design-iconic-font.min.css"
        />

        <link rel="stylesheet" href="assets/css/style1.css" />

        <style></style>
      </head>
      <DoctorHeader></DoctorHeader>
      <body style={{ backgroundColor: "white" }}>
        <div class="main">
          <div class="container">
            <div class="signup-content">
              <div class="signup-img">
                <img
                  src="assets/img/reg_form_images/3-2147941723.jpg"
                  alt=""
                  width="100%"
                  height="100%"
                />
              </div>
              <div class="signup-form">
                <form method="POST" class="register-form" id="register-form">
                  <h2>
                    <u>Doctor Time Slot Scheduling form</u>
                  </h2>
                  <div class="form-row"></div>

                  <div class="form-row">
                    <div class="form-group">
                      <label for="name">Start Date :</label>
                      <input
                        type="date"
                        min="09/13/2022"
                        name="start_date"
                        id="end_date"
                        required
                      />
                    </div>
                    <div class="form-group">
                      <label for="address">End Date :</label>
                      <input
                        type="date"
                        name="end_date"
                        id="end_date"
                        placeholder="12:00 AM"
                        required
                      />
                    </div>
                  </div>
                  <div class="form-row">
                    <div class="form-group">
                      <label for="name">Start Time :</label>
                      <input
                        type="time"
                        name="start"
                        id="start"
                        placeholder="12:00 AM"
                        required
                      />
                    </div>
                    <div class="form-group">
                      <label for="address">End Time :</label>
                      <input
                        type="time"
                        name="end"
                        id="end"
                        placeholder="12:00 AM"
                        required
                      />
                    </div>
                  </div>

                  <div class="form-row">
                    <div class="form-group">
                      <label for="address">
                        Average Patient Checking Time :
                      </label>
                      <input
                        type="time"
                        name="end"
                        id="end"
                        placeholder="12:00 AM"
                        required
                      />
                      <br />
                    </div>
                    <div class="form-group">
                      <label for="address">Buffer Time :</label>
                      <input
                        type="time"
                        name="end"
                        id="end"
                        placeholder="12:00 AM"
                        required
                      />
                      <br />
                    </div>
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
                      value="Make Slots"
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
      </body>
    </>
  );
}
