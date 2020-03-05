package com.example.pokechecker;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.RawQuery;
import androidx.sqlite.db.SupportSQLiteQuery;

import java.util.List;
//https://developer.android.com/training/data-storage/room
@Dao
public interface PokemonDao {
    @Query("SELECT * FROM pokemon")
    List<Pokemon> getAll();
    @Query("SELECT * FROM pokemon WHERE uid IN (:userIds)")
    List<Pokemon> loadAllByIds(int[] userIds);
    @Query("SELECT * FROM pokemon WHERE Name LIKE :name LIMIT 1")
    Pokemon findByName(String name);
    @Insert
    void insertAll(Pokemon... pokemons);
    @RawQuery
    Boolean insertDataRawFormat(SupportSQLiteQuery query);
    @Delete
    void delete(Pokemon pokemon);
}