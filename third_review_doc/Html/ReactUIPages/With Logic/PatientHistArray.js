export default function PatienHistArray(props) {
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
          <h4>Dr. {props.name}</h4>
          <span>{props.clinic}</span>
          <span>{props.date}</span>
          <span>{props.time}</span>
        </div>
      </div>
    </div>
  );
}
