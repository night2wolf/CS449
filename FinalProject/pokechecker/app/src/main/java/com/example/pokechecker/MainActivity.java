package com.example.pokechecker;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button searchBtn = findViewById(R.id.searchBtn);
        searchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //TODO: fill pokemon picture
                ImageView pokePicture = findViewById(R.id.pokePicture);
                AutoCompleteTextView searchTxt = findViewById(R.id.autoCompleteTextView);
                Pokechecker checker = new Pokechecker();
                Pokemon findPoke = checker.findPokemon(getApplicationContext(),searchTxt.getText().toString());
                fillElements(findPoke);
                }
        });
        ImageButton stage1Btn = findViewById((R.id.stage1Pic));
        stage1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton stage1Btn = findViewById((R.id.stage1Pic));
                // Get existing Content Description and search for that pokemon
                stage1Btn.getContentDescription();
                if(!stage1Btn.getContentDescription().toString().equals("")){
                    Pokechecker checker = new Pokechecker();
                    Pokemon findPoke = checker.findPokemon(getApplicationContext(),stage1Btn.getContentDescription().toString());
                    fillElements(findPoke);
                    }
                }

        });
        ImageButton stage2Btn = findViewById((R.id.stage1Pic));
        stage2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ImageButton stage2Btn = findViewById((R.id.stage1Pic));
                // Get existing Content Description and search for that pokemon
                stage2Btn.getContentDescription();
                if(!stage2Btn.getContentDescription().toString().equals("")){
                    Pokechecker checker = new Pokechecker();
                    Pokemon findPoke = checker.findPokemon(getApplicationContext(),stage2Btn.getContentDescription().toString());
                    fillElements(findPoke);
                }
            }
        });
    }
    public void fillElements(Pokemon findPoke) {
        // Lazy NULL Check //TODO: Popup message of pokemon not found
        if (findPoke != null) {
            // TODO: Display results of SQL Search into appropriate elements
            TextView type = findViewById(R.id.typeTxt);
            String typetext = "";
            // Display the Pokemon Types
            typetext = findPoke.getType1();
            if (!findPoke.getType2().equals("Null")) {
                typetext += " , ";
                typetext += findPoke.getType2();
            }
            type.setText(typetext);
            type.setVisibility(View.VISIBLE);
            //Display Pokemon First Evolve Requirements
            TextView evolve1 = findViewById(R.id.evolve1Txtview);
            if (!findPoke.getEvolve1().equals("Null")) {
                evolve1.setText(findPoke.getEvolve1());
                evolve1.setVisibility(View.VISIBLE);
            } else {
                // Hide the Text if there is none
                evolve1.setVisibility(View.INVISIBLE);
            }
            //Display Pokemon Second Evolve Requirements
            TextView evolve2 = findViewById(R.id.evolve2Textview);
            if (!findPoke.getEvolve2().equals("Null")) {
                evolve2.setText(findPoke.getEvolve2());
                evolve2.setVisibility(View.VISIBLE);
            } else {
                // Hide the Text if there is none
                evolve2.setVisibility(View.INVISIBLE);
            }
            ImageButton stage1Btn = findViewById((R.id.stage1Pic));
            if (!findPoke.getStage1().equals("Null")) {
                //TODO: Set the picture of the button to the appropriate picture
                stage1Btn.setContentDescription(findPoke.getStage1());
            }
            ImageButton stage2Btn = findViewById(R.id.stage2Pic);
            if (!findPoke.getStage2().equals("Null")) {
                //TODO: Set the picture of the button to the appropriate picture
                stage2Btn.setContentDescription(findPoke.getStage2());
            }
            ImageButton stage3Btn = findViewById(R.id.stage3Pic);
            if (!findPoke.getStage3().equals("Null")) {
                //TODO: Set the picture of the button to the appropriate picture
                stage3Btn.setContentDescription(findPoke.getStage3());
            }

            //TODO: Weak / Strength algorithm display results
            TextView weakness = findViewById(R.id.weaktypeTxt);
            TextView strength = findViewById(R.id.strtypeTxt);

        }

    }
}
