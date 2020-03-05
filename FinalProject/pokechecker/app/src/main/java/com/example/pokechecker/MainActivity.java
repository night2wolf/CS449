package com.example.pokechecker;

import androidx.appcompat.app.AppCompatActivity;
import androidx.room.Room;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button searchBtn = findViewById(R.id.searchBtn);
        ImageButton stage1Btn = findViewById((R.id.stage1Pic));
        ImageButton stage2Btn = findViewById(R.id.stage2Pic);
        ImageButton stage3Btn = findViewById(R.id.stage3Pic);
        ImageView pokePicture = findViewById(R.id.pokePicture);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO: SQL search functionality
                // TODO: Display results of SQL Search into appropriate views
                TextView weakness = findViewById(R.id.weaktypeTxt);
                TextView strength = findViewById(R.id.strtypeTxt);
                TextView type = findViewById(R.id.typeTxt);
                TextView evolve1 = findViewById(R.id.evolve1Txtview);
                TextView evolve2 = findViewById(R.id.evolve2Textview);
                //TODO: fill the above text views and images based on results of search
            }
        });
    }
}
