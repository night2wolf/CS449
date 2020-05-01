package com.example.pokechecker;
import android.content.Context;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
@RunWith(AndroidJUnit4.class)
public class DBtest {
        @Test
        public void pokedbTest(){
            PokeDatabase db;
            Context context = ApplicationProvider.getApplicationContext();
            db = Room.databaseBuilder(context,
                    PokeDatabase.class, "Pokemon")
                    .createFromAsset("databases/Pokemon.db")
                    .build();
            PokemonDao pokemonDao = db.pokemonDao();
            Pokemon pokemon = new Pokemon();
            pokemon.setName("Charmander");
            Pokemon dbpokemon = pokemonDao.findByName("Charmander");
            assertEquals(pokemon.getName(), dbpokemon.getName());
            db.close();
        }
}

