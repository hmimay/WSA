package com.example.womensafetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class fc3 extends AppCompatActivity {
    MediaPlayer fakeCall3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fc3);
        fakeCall3=MediaPlayer.create(fc3.this,R.raw.fake3);
    }

    public void playIT2(View v) {
        fakeCall3.start();
    }

    public void openFake_call(View view) {
        startActivity(new Intent(this,fakeCall.class));
    }
}