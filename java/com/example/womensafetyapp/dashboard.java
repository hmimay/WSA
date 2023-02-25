package com.example.womensafetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
    }

    public void openFake_call(View view) {
        startActivity(new Intent(this, fakeCall.class));
    }

    public void openHelp_centers(View view) {
        startActivity(new Intent(this, helpCenters.class));
    }

    public void openLogin(View view) {
        startActivity(new Intent(this, login.class));
    }

    public void openSettings(View view) {
        startActivity(new Intent(this, settings.class));
    }

    public void openQuick_facts(View view) {
        startActivity(new Intent(this, quickFacts.class));
    }

    public void openContact_list(View view) {
        startActivity(new Intent(this, contactList.class));
    }
}