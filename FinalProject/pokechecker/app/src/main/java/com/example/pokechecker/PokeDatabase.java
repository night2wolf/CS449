package com.example.pokechecker;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;
// https://developer.android.com/training/data-storage/room
public abstract class PokeDatabase extends RoomDatabase {
    public abstract  PokemonDao pokemonDao();
    private  static PokeDatabase mINSTANCE;
    public static PokeDatabase getPokeDatabase(Context context){
        if (mINSTANCE == null) {
            mINSTANCE = Room.databaseBuilder(context.getApplicationContext(), PokeDatabase.class, "pokedatabase")
                    .allowMainThreadQueries()
                    .build();
        }
        return mINSTANCE;
        }
    public static void destroyInstance(){
        mINSTANCE = null;
}

}
