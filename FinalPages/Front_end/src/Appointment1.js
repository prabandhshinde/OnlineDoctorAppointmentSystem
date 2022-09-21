import { Component } from "react";
import 'bootstrap/dist/css/bootstrap.min.css'
import { Button } from "react-bootstrap";

export default class Appointment1 extends Component {

    constructor() {
        super();
        this.state = {
            appointment1: [{ t1: "11:00", isSelected: 0 }, { t1: "11:15", isSelected: 0 }, { t1: "11:30", isSelected: 0 }, { t1: "11:45", isSelected: 0 }
                , { t1: "12:00", isSelected: 0 }, { t1: "12:15", isSelected: 0 }, { t1: "12:30", isSelected: 0 }, { t1: "12:45", isSelected: 0 }
                , { t1: "13:00", isSelected: 0 }, { t1: "13:15", isSelected: 0 }, { t1: "13:30", isSelected: 0 }], btn1: []
        }
    }

    componentDidMount() {
        let btn;
        btn = this.state.appointment1.map((element, index) => {
            if (element.isSelected === 1) {
                return ((<Button variant="outline-danger" disabled={true} key={index}>{element.t1}</Button>))
            }
            if (element.isSelected === 0) {
                return (<Button key={index} onClick={this.handler2} value={element.t1}>{element.t1}</Button>)
            }
        })
        this.setState({btn1:btn});
        //console.log(this.state.appointment1)
    }

    handler2 = (event) => {
        let val = event.target.value;
        console.log(val)
        let newApp = this.state.appointment1;
        for(var i=0;i<newApp.length;i++)
        {
            if(newApp[i].t1===val)
            {
                newApp[i].isSelected=1;
                break;
            }
        }
        this.setState({appointment1:newApp});
        this.componentDidMount();
        console.log(this.state.appointment1)
    }

    render() {
        return (
            <div>
                <div id="booking" className="section">
		<div className="section-center">
			<div className="container">
				<div className="row">
					<div className="booking-form">
						<div className="booking-bg">
							<div className="form-header">
								<h2>Make your Appointment</h2>
							
							</div>
						</div>
						         <form>
									<div className="Sign p-3 mb-1 bg-body rounded" >{this.state.btn1}</div>
								</form>
					</div>
				</div>
			</div>
		</div>
	</div>
            </div >
        )
    }
}