export default function DoctorDailyAppArray(props) {
  return (
    <>
      <div class="col-lg-6">
        <div class="member d-flex align-items-start">
          <div class="member-info">
            <h2>{props.name}</h2>
            <h5>{props.tm}</h5>
          </div>
        </div>
      </div>
    </>
  );
}
