package com.example.womensafetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fakeCall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_call);
    }

    public void openFc1(View view) {
        startActivity(new Intent(this,fc1.class));
    }

    public void openDashboard(View view) {
    }

    public void openFc2(View view) {
        startActivity(new Intent(this,fc2.class));
    }

    public void openFc3(View view) {
        startActivity(new Intent(this,fc3.class));
    }

    public void openFc4(View view) {
        startActivity(new Intent(this,fc4.class));
    }
}