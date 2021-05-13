package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //wenn Methode ausgeführt wird öffnet sich PlayerSetup Activity
    public void playButtonClick(android.view.View view) {
        Intent intent = new Intent(this, PlayerSetup.class);
        startActivity(intent);

    }
}