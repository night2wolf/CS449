package com.example.pokechecker;

import androidx.room.Database;
import androidx.room.RoomDatabase;

// https://developer.android.com/training/data-storage/room
@Database(entities = {Pokemon.class}, version = 1)
public abstract class PokeDatabase extends RoomDatabase {
    public abstract PokemonDao pokemonDao();

}
