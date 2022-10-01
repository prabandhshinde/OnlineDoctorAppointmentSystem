export default function DrLists(props) {
  const img = props.img;
  const name = props.name;
  const spec = props.spec;

  return (
    <div class="col-lg-6">
      <div class="member d-flex align-items-start">
        <div class="pic">
          <img
            src="assets/img/doctors/doctors-1.jpg"
            class="img-fluid"
            alt=""
          />
        </div>
        <div class="member-info">
          <h4>{name}</h4>
          <span>{spec}</span>
          <p>Explicabo voluptatem mollitia et repellat qui dolorum quasi</p>
          <p>
            <a href="#doctors" class="appointment-btn scrollto">
              <span class="d-none d-md-inline">Book Appointment</span>
            </a>
          </p>
        </div>
      </div>
    </div>
  );
}
