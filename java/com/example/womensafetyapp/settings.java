package com.example.womensafetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
    }

    public void openDashboard(View view) {
        startActivity(new Intent(this,dashboard.class));
    }

    public void openProfile(View view) {
        startActivity(new Intent(this,profile.class));
    }

    public void openAbout_us(View view) {
        startActivity(new Intent(this,AboutUs.class));
    }
}