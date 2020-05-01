package com.example.pokechecker;

import android.content.Context;

import androidx.room.Room;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class Picturetest {
    @Test
    public void pictureTest(){
        PokeDatabase db;
        Context context = ApplicationProvider.getApplicationContext();
        db = Room.databaseBuilder(context,
                PokeDatabase.class, "Pokemon")
                .createFromAsset("databases/Pokemon.db")
                .build();
        PokemonDao pokemonDao = db.pokemonDao();
        Pokemon pokemon = new Pokemon();
        pokemon = pokemonDao.findByName("Raticate (alolan form)");
        // String manipulation to remove parentheses and add underscores for alolan/galar forms.
        String fixname = pokemon.getName().replaceAll("[()]", "");
        fixname = fixname.replaceAll(" ","_").toLowerCase();
        assertEquals(fixname,"raticate_alolan_form");


    }
}
