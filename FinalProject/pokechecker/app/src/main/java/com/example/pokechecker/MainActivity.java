package com.example.pokechecker;

import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

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
    //TODO: REFACTOR: maybe move this function into a different class?
    public void fillElements(Pokemon findPoke) {
        // Lazy NULL Check //TODO: Popup message of pokemon not found
        if (findPoke != null) {
            // Display name. we don't need to check for Null because the object wouldn't exist.
            TextView pokeTxt = findViewById(R.id.pokeTxt);
            pokeTxt.setText(findPoke.getName());
            pokeTxt.setVisibility(View.VISIBLE);

            // Display the Pokemon Types
            // There is always a first type so we don't need to check for null
            TextView typeTxt = findViewById(R.id.typeTxt);
            String typeText = findPoke.getType1();
            if (!findPoke.getType2().equals("Null")) {
                typeText += " , ";
                typeText += findPoke.getType2();
                typeTxt.setText(typeText);
                typeTxt.setVisibility(View.VISIBLE);
            }
            else {
                typeTxt.setText(typeText);
                typeTxt.setVisibility(View.VISIBLE);
            }

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
            // Display Evolve1 image and Name
            ImageButton stage1Btn = findViewById((R.id.stage1Pic));
            if (!findPoke.getStage1().equals("Null")) {
                //TODO: Set the picture of the button to the appropriate picture
                stage1Btn.setContentDescription(findPoke.getStage1());
            }
            TextView stage1Txt = findViewById(R.id.stage1Txt);
            if (!findPoke.getStage1().equals("Null")) {
                stage1Txt.setText(findPoke.getStage1());
                stage1Txt.setVisibility(View.VISIBLE);
            } else {
                // Hide the Text if there is none
                stage1Txt.setVisibility(View.INVISIBLE);
            }
            // Display Evolve2 image and Name
            ImageButton stage2Btn = findViewById(R.id.stage2Pic);
            if (!findPoke.getStage2().equals("Null")) {
                //TODO: Set the picture of the button to the appropriate picture
                stage2Btn.setContentDescription(findPoke.getStage2());
            }
            TextView stage2Txt = findViewById(R.id.stage2Txt);
            if (!findPoke.getStage2().equals("Null")) {
                stage2Txt.setText(findPoke.getStage2());
                stage2Txt.setVisibility(View.VISIBLE);
            } else {
                // Hide the Text if there is none
                stage2Txt.setVisibility(View.INVISIBLE);
            }
            // Display Evolve3 image and Name
            ImageButton stage3Btn = findViewById(R.id.stage3Pic);
            if (!findPoke.getStage3().equals("Null")) {
                //TODO: Set the picture of the button to the appropriate picture
                stage3Btn.setContentDescription(findPoke.getStage3());
            }
            TextView stage3Txt = findViewById(R.id.stage3Txt);
            if (!findPoke.getStage3().equals("Null")) {
                stage3Txt.setText(findPoke.getStage3());
                stage3Txt.setVisibility(View.VISIBLE);
            } else {
                // Hide the Text if there is none
                stage3Txt.setVisibility(View.INVISIBLE);
            }
            //TODO: Weak / Strength algorithm display results, should be function in different class.
            TypeChecker typeChecker = new TypeChecker();
            TextView weakness = findViewById(R.id.weaktypeTxt);
            TextView strength = findViewById(R.id.strtypeTxt);
            // Check the strength and convert it to a string for display
            String strengths1 = typeChecker.convertStringList(typeChecker.getStrength(findPoke.getType1()));
            String weakness1 = typeChecker.convertStringList(typeChecker.getWeakness(findPoke.getType1()));
            // if there is a second type, add it's weaknesses as well
            // TODO: logic to check for duplicate types in weak1 / weak 2 arrays
            if (!findPoke.getType2().equals("Null")) {
                String strengths2 = typeChecker.convertStringList(typeChecker.getStrength(findPoke.getType2()));
                String weakness2 = typeChecker.convertStringList(typeChecker.getWeakness(findPoke.getType2()));
                strength.setText(strengths1 + ","+ strengths2);
                weakness.setText(weakness1 + "," + weakness2);
            }
            else {
                strength.setText(strengths1);
                weakness.setText(weakness1);
            }
            strength.setVisibility(View.VISIBLE);
            weakness.setVisibility(View.VISIBLE);

        }

    }
}
