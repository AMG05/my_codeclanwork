import React, {useState} from 'react';
import './BookingForm.css'

function BookingForm({addBooking, postBooking}){

    const [formData, setFormData] = useState({})

    const onChange = (event) => {
        formData[event.target.id] = event.target.value;
        setFormData(formData);
    }

    const onSubmit = (event) => {
        event.preventDefault();
        postBooking(formData)
        .then(data => addBooking(data))
    }
    
    
    return (
        <form onSubmit={onSubmit}>
            <div className="new-booking">
                <div className="new-booking">
                    <label>Name</label>
                    <input onChange={onChange} type='text' />
            </div> 
            <div className="new-booking">
                    <label>Email</label>
                    <input onChange={onChange} type='email' />
            </div> 
                <div className="new-booking">
                    <label>Checked-in?</label>
                    <input type='checkbox' onChange = {onChange} />
            </div> 
            </div>
            <div className="new-booking-button">
                <button type="submit">Add Booking</button>
            </div>
        </form>
    )

};

export default BookingForm;
