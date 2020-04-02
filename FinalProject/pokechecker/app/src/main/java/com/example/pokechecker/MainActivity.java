package com.example.pokechecker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Database;
import androidx.room.RawQuery;
import androidx.room.Room;
import androidx.sqlite.db.SimpleSQLiteQuery;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PokeDatabase db = Room.databaseBuilder(getApplicationContext(),
                PokeDatabase.class, "pokedb")
                .createFromAsset("databases/Pokemon.db")
                .build();
        final PokemonDao pokemonDao = db.pokemonDao();
        Button searchBtn = findViewById(R.id.searchBtn);
        ImageButton stage1Btn = findViewById((R.id.stage1Pic));
        ImageButton stage2Btn = findViewById(R.id.stage2Pic);
        ImageButton stage3Btn = findViewById(R.id.stage3Pic);
        ImageView pokePicture = findViewById(R.id.pokePicture);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // TODO: SQL search functionality
                AutoCompleteTextView searchTxt = findViewById(R.id.autoCompleteTextView);
                Pokemon findPoke = pokemonDao.findByName(searchTxt.toString());
                // TODO: Display results of SQL Search into appropriate views
                TextView weakness = findViewById(R.id.weaktypeTxt);
                TextView strength = findViewById(R.id.strtypeTxt);
                TextView type = findViewById(R.id.typeTxt);
                type.append(findPoke.getType1());
                type.append(" , ");
                type.append(findPoke.getType2());
                TextView evolve1 = findViewById(R.id.evolve1Txtview);
                evolve1.append(findPoke.getEvolve1());
                TextView evolve2 = findViewById(R.id.evolve2Textview);
                evolve2.append(findPoke.getEvolve2());
            }
        });
    }
}
