package com.example.pokechecker;

import android.content.Context;

import androidx.room.Room;

public class Pokechecker{
    public Pokemon findPokemon(Context context, String pokeName){
        Pokemon findPoke = new Pokemon();
        PokeDatabase db = Room.databaseBuilder(context,
                PokeDatabase.class, "Pokemon")
                .createFromAsset("databases/Pokemon.db")
                .allowMainThreadQueries() // Should remove this due to potential lock ups eventually
                .build();
        PokemonDao pokemonDao = db.pokemonDao();
        findPoke = pokemonDao.findByName(pokeName);

        return findPoke;
    }

}
