package com.example.womensafetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class fc1 extends AppCompatActivity {
MediaPlayer fakeCall1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fc1);
        fakeCall1=MediaPlayer.create(fc1.this,R.raw.fakecall1);
    }

    public void playIT(View v) {
        fakeCall1.start();
    }

    public void openFake_call(View view) {
        startActivity(new Intent(this,fakeCall.class));
    }
}