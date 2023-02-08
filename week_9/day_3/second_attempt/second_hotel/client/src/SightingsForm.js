import {useState} from "react";
import { postSighting } from "./SightingService";

const SightingsForm = ({addSighting}) => {
    
    const [formData, setFormData] = useState({
        name: "",
        location: "",
        date: "",
    })

    const onChange = (e) =>{
        const newFormData = Object.assign({}, formData);
        newFormData[e.target.name] = e.target.value;
        setFormData(newFormData);
    }

    const onSubmit = (e) =>{
        e.preventDefault();
        postSighting(formData).then((data)=>{
            addSighting(data);
        })
        // Reset the form input values
        setFormData({
            species: "",
            location: "",
            date: "",
        });
    }

    return (
        <form onSubmit={onSubmit} id="sightings-form" >
            <h2>Add a booking</h2>
            <div className="formWrap">
                <label htmlFor="species">Name:</label>
                <input 
                    onChange={onChange} 
                    type="text" 
                    id="species" 
                    name="species"
                    value={formData.species} />
            </div>
            <div className="formWrap">
                <label htmlFor="location">Email:</label>
                <input 
                    onChange={onChange} 
                    type="text" 
                    id="location" 
                    name="email"
                    value={formData.location} />
            </div>
            <div className="formWrap">
                <label htmlFor="date">Checked in:</label>
                <input 
                    onChange={onChange} 
                    type="checkedIn" 
                    id="date" 
                    name="date" 
                    value={formData.date}/>
            </div>

            <input type="submit" value="Save" id="save"/>
	    </form>

    );
}

export default SightingsForm;