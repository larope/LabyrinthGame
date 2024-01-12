package com.example.labyrinthgame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    // TO BE CHANGED LATER
    private boolean _soundIsOn = true;
    // TO BE CHANGED LATER

    private ImageButton _playButton;
    private ImageButton _settingsButton;
    private ImageButton _soundButton;



    private Drawable _soundOnButtonImage;
    private Drawable _soundOffButtonImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _playButton = (android.widget.ImageButton) findViewById(R.id.playButton);
        _settingsButton = (android.widget.ImageButton) findViewById(R.id.settingsButton);

        _soundButton = (android.widget.ImageButton) findViewById(R.id.soundButton);

        _soundOnButtonImage =  ContextCompat.getDrawable(this, R.drawable.btn_soundon);
        _soundOffButtonImage =  ContextCompat.getDrawable(this, R.drawable.btn_soundoff);

        _playButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Levels.class);
                startActivity(i);
                Log.d("BUTTONS", "Entered levels menu.");
            }
        });
        _settingsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,Settings.class);
                startActivity(i);
                Log.d("BUTTONS", "Entered settings menu.");
            }
        });

        _soundButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                _soundButton.setImageDrawable(_soundIsOn ? _soundOffButtonImage : _soundOnButtonImage);
                _soundIsOn = !_soundIsOn;
                Log.d("BUTTONS", "Sound is ." + (_soundIsOn ? "On." : "Off."));
            }
        });
    }
}


