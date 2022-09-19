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
              <h2>Todays Slot</h2>
              <p>Todays Appointment of Patient are : </p>
            </div>
            <div class="row">
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
            </div>
          </div>
        </section>
      </main>

      <Footer></Footer>
    </>
  );
}
