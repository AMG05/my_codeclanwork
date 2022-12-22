import React from "react";
import PokemonDetail from "../components/Pokemon";


const PokemonList = ({pokemons, onPockemonClicked}) => {

    const PokemonItems = pokemons.map((pokemon, index) => {
        return <PokemonDetail pokemon = {pokemon} key={index} onPokemonClicked={onPockemonClicked}/>
    })

  return (
    <div className='pokemon-list'>
    <ul>
        {PokemonItems}
    </ul>
    </div>
    
  )

}

export default PokemonList;