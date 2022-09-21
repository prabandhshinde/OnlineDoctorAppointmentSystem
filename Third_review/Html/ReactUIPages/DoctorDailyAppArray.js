export default function DoctorDailyAppArray(props) {
  return (
    <>
      <div class="col-lg-12">
        <div>
          <div class="member-info">
            <div class="row">
              <div class="col-lg-2 ">
                <h4>1)</h4>
              </div>
              <div class="col-lg-2">
                <p>
                  <h4>{props.tm}</h4>
                  &ensp;&ensp;&emsp;&emsp;
                </p>
              </div>
              <div class="col-lg-4 ">
                <h4>{props.name}</h4>
              </div>
              <div class="col-lg-4 ">
                <h4>9689361857</h4>
              </div>
            </div>
          </div>
        </div>
      </div>
      {/* <tr>
        <td></td>
        <td>{props.name}</td>
        <td>{props.tm}</td>
        <td></td>
      </tr> */}
    </>
  );
}
