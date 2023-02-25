package com.example.womensafetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class fc2 extends AppCompatActivity {
    MediaPlayer fakeCall2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fc2);
        fakeCall2=MediaPlayer.create(fc2.this,R.raw.fake2);
    }

    public void playIT1(View v) {
        fakeCall2.start();
    }

    public void openFake_call(View view) {
        startActivity(new Intent(this,fakeCall.class));
    }
}