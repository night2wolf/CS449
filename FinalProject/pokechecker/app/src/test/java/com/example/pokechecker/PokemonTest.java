package com.example.pokechecker;

import org.junit.Test;

import static org.junit.Assert.*;

public class PokemonTest {
    @Test
    public void pokemon_created() {
        // _id,Name,Type1,Type2,Stage1,Evolve1,Stage2,Evolve2,Stage3
        Pokemon pokemon = new Pokemon();
        pokemon.setId(4);
        pokemon.setName("Charmander");
        pokemon.setType1("Fire");
        pokemon.setType2("Null");
        pokemon.setStage1("Charmander");
        pokemon.setEvolve1("Level 16");
        pokemon.setStage2("Charmeleon");
        pokemon.setEvolve2("Level 32");
        pokemon.setStage3("Charizard");

        assertEquals(pokemon,pokemon);
    }

}