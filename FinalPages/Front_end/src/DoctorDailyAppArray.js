export default function DoctorDailyAppArray(props) {
  return (
    <>
      <div class="col-lg-12">
        <div>
          <div class="member-info">
            <div class="row">
              <div class="col-lg-1 ">
                <h4>{props.id} )</h4>
              </div>
              <div class="col-lg-2 ">
                <h4>{props.date}</h4>
              </div>
              <div class="col-lg-2 ">
                <h4>{props.time}</h4>
              </div>
              <div class="col-lg-4">
                  <h4>{props.name}</h4>
              </div>
              <div class="col-lg-3 ">
                <h4>{props.mob}</h4>
              </div>
            </div>
          </div>
        </div>
      </div>
    </>
  );
}
