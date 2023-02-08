const PokemonSelector = ({pokemons, OnPokemonSelected}) => {

    const handleChange=  function(event) {
        const chosenPokemon = pokemons[event.target.value];
        OnPokemonSelected(chosenPokemon);


    const PokemonOptions = pokemons.map((pokemons, index)) => {
        return <PokemonItem key={index} pokemon={pokemon} id={index}/>

   
    // return (
    //     <select defaultValue="" onChange={handleChange}>
    //         <option value="" selected>What's the abilites of this pokemon</option>
    //         {pokemonOptions}
    //     </select>
    // )
}

export default PokemonSelector;
    

