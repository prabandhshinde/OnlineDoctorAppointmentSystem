import DoctorDailyAppArray from "./DoctorDailyAppArray";
import DoctorHeader from "./DoctorHeader";
import Footer from "./Footer";

export default function DoctorDailyAppointment() {
  let Appointment = [
    { id: 1, name: "Ankit", tm: "12:00" },
    { id: 2, name: "tm", tm: "12:10" },
    { id: 3, name: "pratik", tm: "12:20" },
    { id: 4, name: "surya", tm: "12:30" },
    { id: 5, name: "astha", tm: "12:40" },
    { id: 6, name: "sumedh", tm: "12:50" },
  ];

  return (
    <>
      <DoctorHeader></DoctorHeader>
      <main id="main">
        <section id="doctors" class="doctors">
          <div class="container">
            <div class="section-title">
              <br />
              <br />
              <br />
              <br />
              <h2>Slot</h2>
              <br />
              Select Date :{" "}
              <input
                type="date"
                min="09/13/2022"
                name="start_date"
                id="end_date"
                required
              />
              <br />
              <br />
              <p>
                Appointment of Patient for -------selected Date-------- are :{" "}
              </p>
            </div>
            <div class="row">
              <center>
                <div class="col-lg-12">
                  <div>
                    <div class="member-info">
                      <div class="row">
                        <div class="col-lg-2 ">
                          <h3>Sr. No.</h3>
                        </div>
                        <div class="col-lg-2">
                          <p>
                            <h3>Time</h3>
                            &ensp;&ensp;&emsp;&emsp;
                          </p>
                        </div>
                        <div class="col-lg-4 ">
                          <h3>Name</h3>
                        </div>
                        <div class="col-lg-4 ">
                          <h3>Contact Number</h3>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
                {Appointment.map((eve) => {
                  return (
                    <DoctorDailyAppArray
                      key={eve.id}
                      id={eve.id}
                      name={eve.name}
                      tm={eve.tm}
                    />
                  );
                })}
              </center>
            </div>

            {/* <table border={"2"} str>
              <thead>
                <tr>
                  <td>sr No</td>
                  <td>Name</td>
                  <td>time</td>
                  <td>contact number</td>
                </tr>
              </thead>
              <tbody>
                {Appointment.map((eve) => {
                  return (
                    <DoctorDailyAppArray
                      key={eve.id}
                      id={eve.id}
                      name={eve.name}
                      tm={eve.tm}
                    />
                  );
                })}
              </tbody>
            </table> */}
          </div>
        </section>
      </main>

      <Footer></Footer>
    </>
  );
}
