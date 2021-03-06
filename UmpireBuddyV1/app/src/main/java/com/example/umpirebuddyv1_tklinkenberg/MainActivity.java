package com.example.umpirebuddyv1_tklinkenberg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button ResetBtn = (Button) findViewById(R.id.Resetbtn);
        Button BallsBtn = (Button) findViewById(R.id.BallsBtn);
        Button StrikesBtn = (Button) findViewById(R.id.StrikesBtn);
        Button AboutBtn = findViewById(R.id.aboutButton);
        TextView BallsTextView = (TextView) findViewById(R.id.BallsTextView);
        TextView StrikesTextView = (TextView) findViewById(R.id.StrikesTextView);
        // Set Default Text to 0 on create
        StrikesTextView.setText("0");
        BallsTextView.setText("0");
        AboutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAboutDialog();
            }
        });
        ResetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView BallsTextView = (TextView) findViewById(R.id.BallsTextView);
                TextView StrikesTextView = (TextView) findViewById(R.id.StrikesTextView);
                // Reset Text to 0 on reset.
                BallsTextView.setText("0");
                StrikesTextView.setText("0");
            }
        });
        BallsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView BallsTextView = (TextView) (findViewById(R.id.BallsTextView));
                int BallCount = Integer.parseInt(BallsTextView.getText().toString());
                // If we hit 4 Balls it should reset counter to 0 on next click.
                if (BallCount < 4){
                    BallCount ++;
                    BallsTextView.setText(BallCount +"");
                    if (BallCount == 4){
                        openBallDialog();
                        BallsTextView.setText("0");
                    }
                }
            }
        });
        StrikesBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                TextView StrikesTextView = (TextView) (findViewById(R.id.StrikesTextView));

                int BallCount = Integer.parseInt(StrikesTextView.getText().toString());
                // If we hit 3 Strikes it should reset counter to 0 on next click.
                if (BallCount < 3){
                    BallCount ++;
                    StrikesTextView.setText(BallCount +"");
                    if (BallCount == 3){
                        openStrikeDialog();
                        StrikesTextView.setText("0");
                    }
                }

            }
        });
    }
    public void openStrikeDialog(){
        StrikeDialog strikeDialog = new StrikeDialog();
        strikeDialog.show(getSupportFragmentManager(),"StrikeWindow");
    }
    public void openBallDialog(){
        BallDialog ballDialog = new BallDialog();
        ballDialog.show(getSupportFragmentManager(),"BallWindow");
    }
    public void openAboutDialog(){
        AboutDialog aboutDialog = new AboutDialog();
        aboutDialog.show(getSupportFragmentManager(),"AboutWindow");
    }
}
