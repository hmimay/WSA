package com.example.womensafetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class quickFacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quick_facts);
    }

    public void openDashboard(View view) {
        startActivity(new Intent(this,dashboard.class));
    }

    public void openFact1(View view) {
        startActivity(new Intent(this,fact1.class));
    }

    public void openFact2(View view) {
        startActivity(new Intent(this,fact2.class));
    }

    public void openFact3(View view) {
        startActivity(new Intent(this,fact3.class));
    }

    public void openFact4(View view) {
        startActivity(new Intent(this,fact4.class));
    }

    public void openFact6(View view) {
        startActivity(new Intent(this,fact6.class));
    }
    public void openFact5(View view) {
        startActivity(new Intent(this,fact5.class));
    }
}