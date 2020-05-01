package com.example.pokechecker;
import android.content.Context;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;
import static org.junit.Assert.*;
@RunWith(AndroidJUnit4.class)
public class StringDataTests {
    @Test
    public void typeValueTest(){
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
        String typetext = "";
        typetext  = dbpokemon.getType1();
        if (!dbpokemon.getType2().equals("Null")) {
            typetext += " , ";
            typetext += dbpokemon.getType2();
        }
        assertEquals(typetext, "Fire");
        db.close();
    }
    @Test
    public void evolveStringTest(){
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
        String evolve1Text = "";
        if(!dbpokemon.getEvolve1().equals("Null")) {
            evolve1Text = dbpokemon.getEvolve1();
        }
        assertEquals(evolve1Text,"Level 16");
        String evolve2Text = "";
        if(!dbpokemon.getEvolve2().equals("Null")) {
            evolve2Text = dbpokemon.getEvolve2();
        }
        assertEquals(evolve2Text,"Level 36");
    }

}
