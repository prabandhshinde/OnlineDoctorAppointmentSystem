import PatienHistArray from "./PatientHistArray";
import PatientHeader from "./PatientHeader";
import Footer from "./Footer";
export default function PatientHistory() {
  let Appointment = [
    { id: 1, Doc: "Ankit", date: "25/10/2021", time: "12:00", spec: "gyno" },
    { id: 3, Doc: "Surya", date: "25/10/2021", time: "12:00", spec: "gen" },
    { id: 4, Doc: "Pratik", date: "25/10/2021", time: "12:00", spec: "gen" },
    { id: 5, Doc: "Astha", date: "25/10/2021", time: "12:00", spec: "gyno" },
    { id: 6, Doc: "Astha", date: "25/10/2021", time: "12:00", spec: "neuro" },
  ];
  return (
    <>
      <div>
        <>
          <PatientHeader></PatientHeader>

          <main id="main">
            <section id="doctors" class="doctors">
              <div class="container">
                <div class="section-title">
                  <br />
                  <br />
                  <br />
                  <br />
                  <h2>History</h2>
                  <p>History of patient Visited the Doctor</p>
                </div>
                <div class="row">
                  {Appointment.map((eve) => {
                    return (
                      <PatienHistArray
                        key={eve.id}
                        name={eve.Doc}
                        date={eve.date}
                        time={eve.time}
                        spec={eve.spec}
                      />
                    );
                  })}
                </div>
              </div>
            </section>
          </main>
          <Footer></Footer>
        </>
      </div>
    </>
  );
}
