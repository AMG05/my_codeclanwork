import React from "react";

const Film = ({name, url}) => {

    return(
      <li>

       <a href={url}> <h4>{name}</h4></a>
        
      </li>
    )
  
  }

export default Film;