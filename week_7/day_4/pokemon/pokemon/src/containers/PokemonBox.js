import React, {useState, useEffect} from "react";
import PokemonList from "../components/PokemonList";


const PokemonBox = () => {
     const [pokemons, setPokemons] = useState([]);

     useEffect(() => {
        getPokemons();
      }, [])

     const getPokemons = function(){
        fetch('https://pokeapi.co/api/v2/pokemon')
        .then(res => res.json())
        .then(pokemons => setPokemons(pokemons.results))
     }
    
    return (
        <div className="main-container">
        <h1>Pokemon Characters</h1>
        <PokemonList pokemons={pokemons}/>
        </div>
    )
}

export default PokemonBox;