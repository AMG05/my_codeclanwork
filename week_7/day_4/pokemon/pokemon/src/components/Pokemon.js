import React from "react";

const PokemonDetail = ({pokemon}) => {

  return (
    <li className="pokemon-list">
        <h2>{pokemon.name}</h2>
        <h3>{pokemon.url}</h3>
    </li>
  )

}

export default PokemonDetail;