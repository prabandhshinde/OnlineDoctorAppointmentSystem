import React from "react"
import { useSelector } from "react-redux";
import HomeHeader from "./HomeHeader";
export default function Home()
{
  const id = useSelector((state)=>{return state.id});
  const FirstName = useSelector((state)=>{return state.First_name});
  console.log(id+" "+FirstName);
  console.log(sessionStorage.getItem('doctorlogin'))
    return(

<div>
  <HomeHeader></HomeHeader>
  <main id="main">
  <section id="hero" className="d-flex align-items-center">
        <div className="Default-Container">
          <h1 style={{"textTransform":"inherit"}}>Welcome to WeCare</h1>
            <h4>We here provide platform for online Appointment booking of doctor.. </h4>
        </div>
      </section>


      <section id="why-us" className="why-us">
      <div className="container">

      <div className="row">
          <div className="col-lg-4 d-flex align-items-stretch">
            <div className="content">
              <h3>Why Choose WeCare</h3>
              
                <ul>
                <li> You can easily findout Doctor nearer to you. </li>
                <li> 100% verified Doctor</li>
                <li> Online book the appointment without tension of Queue. Visit the hospital according to your appointment time. </li>
                
              </ul>
            
            </div>
          </div>
          <div className="col-lg-8 d-flex align-items-stretch">
            <div className="icon-boxes d-flex flex-column justify-content-center">
              <div className="row">
                <div className="col-xl-4 d-flex align-items-stretch">
                  <div className="icon-box mt-4 mt-xl-0">
            
                    <h4>Avoid Rush</h4>
                    <p>without knowing the time of appointment people gather and generate the rush. chances of infection increases. to avoid rush book online and visit according to time slot</p>
                  </div>
                </div>
                <div className="col-xl-4 d-flex align-items-stretch">
                  <div className="icon-box mt-4 mt-xl-0">
  
                    <h4>Selection according to speciality</h4>
                    <p>you can choose the dr according to there speciality and book the appointment with minimum fees.</p>
                  </div>
                </div>
                <div className="col-xl-4 d-flex align-items-stretch">
                  <div className="icon-box mt-4 mt-xl-0">
            
                    <h4>New in City.??</h4>
                    <p>select dr nearer to you by reviews and feedback.</p>
                  </div>
                </div>
              </div>
            </div>
        </div></div></div>
    </section>


    <section id="counts" className="counts">
      <div className="container">

        <div className="row">

          <div className="col-lg-4 col-md-6">
            <div className="count-box">
              <i className="fas fa-user-md"></i>
              <span data-purecounter-start="0" data-purecounter-end="85" data-purecounter-duration="1" className="purecounter"></span>
              <p>Number of Doctors Connected</p>
            </div>
          </div>

          <div className="col-lg-4 col-md-6 mt-5 mt-md-0">
            <div className="count-box">
              <i className="bi bi-people"></i>
              <span data-purecounter-start="0" data-purecounter-end="18" data-purecounter-duration="1" className="purecounter"></span>
              <p>Number of Patients Connected</p>
            </div>
          </div>

          <div className="col-lg-4 col-md-6 mt-5 mt-lg-0">
            <div className="count-box">
              <i className="far fa-hospital"></i>
              <span data-purecounter-start="0" data-purecounter-end="12" data-purecounter-duration="1" className="purecounter"></span>
              <p>Number of Clinics Connected</p>
            </div>
          </div>

        </div>

      </div>
    </section>



    <section id="faq" className="faq section-bg">
      <div className="container">

        <div className="section-title">
          <h2>How can we help</h2>
          <h6>Below are some question frequently asked to us. If you don't get your question in the list or not satisfied with answer <a href="#contact">Contact</a> us</h6>
        </div>

        <div className="faq-list">
          <ul>
            <li data-aos="fade-up">
              <i className="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" className="collapse" data-bs-target="#faq-list-1">Whats the procedure of Doctor verification? <i className="bx bx-chevron-down icon-show"></i><i className="bx bx-chevron-up icon-close"></i></a>
              <div id="faq-list-1" className="collapse show" data-bs-parent=".faq-list">
                <p>
                  You have to signUp as doctor on the site. Need to upload license or medicle degree certificate. After registration there will be physical verification. after successfull verification profile will be reflect.
                </p>
              </div>
            </li>

            <li data-aos="fade-up" data-aos-delay="100">
              <i className="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-2" className="collapsed">Is registration fees refundable? <i className="bx bx-chevron-down icon-show"></i><i className="bx bx-chevron-up icon-close"></i></a>
              <div id="faq-list-2" className="collapse" data-bs-parent=".faq-list">
                <p>
                  Yes. After successfull verification fee will be refund by deducting or not deducting some charges.
                </p>
              </div>
            </li>

            <li data-aos="fade-up" data-aos-delay="200">
              <i className="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-3" className="collapsed">can we cancelled the appointment? <i className="bx bx-chevron-down icon-show"></i><i className="bx bx-chevron-up icon-close"></i></a>
              <div id="faq-list-3" className="collapse" data-bs-parent=".faq-list">
                <p>
                  Yes. Both Doctor and patient can cancelled the appointment. If patient cancelled appointment some charges will be deduct according to clinic policy and if Doctor cancelled the appointment all fee will be refund.
                </p>
              </div>
            </li>

            <li data-aos="fade-up" data-aos-delay="300">
              <i className="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-4" className="collapsed">Incase patient delayed for appointment. Appointment get cancelled or appointment get rescheduled? <i className="bx bx-chevron-down icon-show"></i><i className="bx bx-chevron-up icon-close"></i></a>
              <div id="faq-list-4" className="collapse" data-bs-parent=".faq-list">
                <p>
                  As appointment slots time fixed, so it will be decision of clinic or Doctor.
                </p>
              </div>
            </li>

            <li data-aos="fade-up" data-aos-delay="400">
              <i className="bx bx-help-circle icon-help"></i> <a data-bs-toggle="collapse" data-bs-target="#faq-list-5" className="collapsed">Can we book appointment for doctor from  third person account? <i className="bx bx-chevron-down icon-show"></i><i className="bx bx-chevron-up icon-close"></i></a>
              <div id="faq-list-5" className="collapse" data-bs-parent=".faq-list">
                <p>
                  There is no such facility. You need to register yourself and book appointment for yourself.
                </p>
              </div>
            </li>

          </ul>
        </div>

      </div>
    </section>

    <section id="contact" className="contact">
      <div className="container">

        <div className="section-title">
          <h2>Contact</h2>
          <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
        </div>
      </div>

      <div className="row">
        <div className="col-lg-4 d-flex align-items-stretch">
          <div className="container">
            <iframe style={{"border":"0", "width": "100%", "height": "350px"}}src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d12097.433213460943!2d-74.0062269!3d40.7101282!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xb89d1fe6bc499443!2sDowntown+Conference+Center!5e0!3m2!1smk!2sbg!4v1539943755621" frameBorder="0" allowFullScreen></iframe>
          </div>
        </div>
        <div className="col-lg-8 d-flex align-items-stretch">
          <div className="container">
            <div className="row mt-5">
    
              <div className="col-lg-4">
                <div className="info">
                  <div className="address">
                    <i className="bi bi-geo-alt"></i>
                    <h4>Location:</h4>
                    <p>A108 Adam Street, New York, NY 535022</p>
                  </div>
    
                  <div className="email">
                    <i className="bi bi-envelope"></i>
                    <h4>Email:</h4>
                    <p>info@example.com</p>
                  </div>
    
                  <div className="phone">
                    <i className="bi bi-phone"></i>
                    <h4>Call:</h4>
                    <p>+1 5589 55488 55s</p>
                  </div>
    
                </div>
    
              </div>
    
              <div className="col-lg-8 mt-5 mt-lg-0">
    
                <form action="forms/contact.php" method="post" role="form" className="php-email-form">
                  <div className="row">
                    <div className="col-md-6 form-group">
                      <input type="text" name="name" className="form-control" id="name" placeholder="Your Name" required/>
                    </div>
                    <div className="col-md-6 form-group mt-3 mt-md-0">
                      <input type="email" className="form-control" name="email" id="email" placeholder="Your Email" required/>
                    </div>
                  </div>
                  <div className="form-group mt-3">
                    <input type="text" className="form-control" name="subject" id="subject" placeholder="Subject" required/>
                  </div>
                  <div className="form-group mt-3">
                    <textarea className="form-control" name="message" rows="5" placeholder="Message" required></textarea>
                  </div>
                  <div className="my-3">
                    <div className="loading">Loading</div>
                    <div className="error-message"></div>
                    <div className="sent-message">Your message has been sent. Thank you!</div>
                  </div>
                  <div className="text-center"><button type="submit">Send Message</button></div>
                </form>
    
              </div>
    
            </div>
    
          </div>
        </div>
      </div>
      
    </section>
</main>
    <footer id="footer">

    <div className="footer-top">
      <div className="container">
        <div className="row">

          <div className="col-lg-3 col-md-6 footer-contact">
            <h3>Medilab</h3>
            <p>
              A108 Adam Street <br/>
              New York, NY 535022<br/>
              United States <br/><br/>
              <strong>Phone:</strong> +1 5589 55488 55<br/>
              <strong>Email:</strong> info@example.com<br/>
            </p>
          </div>

          <div className="col-lg-2 col-md-6 footer-links">
            <h4>Useful Links</h4>
            <ul>
              <li><i className="bx bx-chevron-right"></i> <a href="#">Home</a></li>
              <li><i className="bx bx-chevron-right"></i> <a href="#">About us</a></li>
              <li><i className="bx bx-chevron-right"></i> <a href="#">Services</a></li>
              <li><i className="bx bx-chevron-right"></i> <a href="#">Terms of service</a></li>
              <li><i className="bx bx-chevron-right"></i> <a href="#">Privacy policy</a></li>
            </ul>
          </div>

          <div className="col-lg-3 col-md-6 footer-links">
            <h4>Our Services</h4>
            <ul>
              <li><i className="bx bx-chevron-right"></i> <a href="#">Web Design</a></li>
              <li><i className="bx bx-chevron-right"></i> <a href="#">Web Development</a></li>
              <li><i className="bx bx-chevron-right"></i> <a href="#">Product Management</a></li>
              <li><i className="bx bx-chevron-right"></i> <a href="#">Marketing</a></li>
              <li><i className="bx bx-chevron-right"></i> <a href="#">Graphic Design</a></li>
            </ul>
          </div>

          <div className="col-lg-4 col-md-6 footer-newsletter">
            <h4>Join Our Newsletter</h4>
            <p>Tamen quem nulla quae legam multos aute sint culpa legam noster magna</p>
            <form action="" method="post">
              <input type="email" name="email"/><input type="submit" value="Subscribe"/>
            </form>
          </div>

        </div>
      </div>
    </div>

    <div className="container d-md-flex py-4">

      <div className="me-md-auto text-center text-md-start">
        <div className="copyright">
          &copy; Copyright <strong><span>WeCare</span></strong>. All Rights Reserved
        </div>
        <div className="credits">
          
          Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
        </div>
      </div>
      <div className="social-links text-center text-md-right pt-3 pt-md-0">
        <a href="#" className="twitter"><i className="bx bxl-twitter"></i></a>
        <a href="#" className="facebook"><i className="bx bxl-facebook"></i></a>
        <a href="#" className="instagram"><i className="bx bxl-instagram"></i></a>
        <a href="#" className="google-plus"><i className="bx bxl-skype"></i></a>
        <a href="#" className="linkedin"><i className="bx bxl-linkedin"></i></a>
      </div>
    </div>
  </footer>
  
</div>
    )
    
}