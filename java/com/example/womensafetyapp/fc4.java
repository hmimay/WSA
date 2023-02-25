package com.example.womensafetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class fc4 extends AppCompatActivity {
    MediaPlayer fakeCall4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fc4);
        fakeCall4=MediaPlayer.create(fc4.this,R.raw.fake4);
    }

    public void playIT(View v) {
        fakeCall4.start();
    }

    public void openFake_call(View view) {
        startActivity(new Intent(this,fakeCall.class));
    }
}