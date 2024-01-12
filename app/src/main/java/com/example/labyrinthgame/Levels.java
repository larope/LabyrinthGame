package com.example.labyrinthgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Levels extends AppCompatActivity {

    ImageButton _backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levels);

        _backButton = (android.widget.ImageButton) findViewById(R.id.backButton);

        _backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Levels.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}