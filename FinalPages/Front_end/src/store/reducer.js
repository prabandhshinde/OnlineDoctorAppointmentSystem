import {createStore} from 'redux';
//import { configureStore } from '@reduxjs/toolkit'
const DataReducer = (state={id:0,First_name:"",Last_name:"",doctor_id:0,clinic_id:0},action)=>{

    if(action.type==="save")
    {     console.log(action.payload.id)
        return {
            id:action.payload.id,
            First_name:action.payload.First_name,
            Last_name:action.payload.Last_name,   
        };
    }

    if(action.type==="doctor_select")
    {     console.log(action.payload.doctor_id)
        console.log(action.payload.clinic_id)
        return {
            doctor_id:action.payload.doctor_id,
            clinic_id:action.payload.clinic_id  
        };
    }

    return state;

} 

const Store = createStore(DataReducer);
/*
const store = configureStore({
    counterReducer,
  })
*/
export default Store;
