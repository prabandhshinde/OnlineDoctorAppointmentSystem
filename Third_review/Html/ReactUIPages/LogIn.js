

export default function LogIn()
{
    return(
        <>
    <body>
        <section className="vh-100" style={{"background-color": "#b6c6d8;"}}>
            <div className="container py-5 h-100">
              <div className="row d-flex justify-content-center align-items-center h-100">
                <div className="col col-xl-10">
                  <div className="card" style={{"border-radius": "1rem;"}}>
                    <div className="row g-0">
                      <div className="col-md-8 col-lg-6 d-none d-md-block">
                        <img src="assets/img/login.jpg" width="100%" height="100%"
                          alt="login form"  style={{"border-radius": "1rem 0 0 1rem;"}}  />
                      </div>
                      <div className="col-md-4 col-lg-6 d-flex align-items-center">
                        <div className="card-body p-4 p-lg-5 text-black">
          
                          <form>
          
                            <div className="d-flex align-items-center mb-3 pb-1">
                              <i className="fas fa-cubes fa-2x me-3" style={{"color": "#ff6219;"}}></i>
                              <span className="h1 fw-bold mb-0" style={{"text-align":"center"}}>Sign In</span>
                            </div>
          
                            <div className="form-outline mb-4">
                              <h6> Doctor <input type="radio" name="r1" style={{"margin-right":"130px"}}/>
                                   Patient <input type="radio" name="r1"  style={{"margin-right":"130px;"}}/></h6>
                              </div>
          
                            <div className="form-outline mb-4">
                              <input type="email" id="form2Example17" name="uname" placeholder=" Email/Mobile Number "className="form-control form-control-lg" />
                              <label className="form-label" for="form2Example17">Email address</label>
                            </div>
          
                            <div className="form-outline mb-4">
                              <input type="password" id="form2Example27" placeholder="Password" name="password" className="form-control form-control-lg" />
                              <label className="form-label" for="form2Example27">Password</label>
                            </div>
          
                            <div className="pt-1 mb-4">
                              <button className="btn btn-dark btn-lg btn-block" type="button">Sign In</button>
                            </div>
          
                            <a className="small text-muted" href="#!">Forgot password?</a>
                            <p className="mb-5 pb-lg-2" style={{"color": "#393f81;"}}>Don't have an account? <a href="#!"
                                style={{"color": "#393f81;"}}>Register here</a></p>
                            
                          </form>
          
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
          </section>
    </body>

        </>
    )
}