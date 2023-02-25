package com.example.womensafetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class helpCenters extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_centers);
    }

    public void openDashboard(View view) {
        startActivity(new Intent(this,dashboard.class));
    }

    public void openHospital(View view) {
        startActivity(new Intent(this,hospital.class));
    }

    public void openBarangay_halls(View view) {
        startActivity(new Intent(this,barangayHalls.class));
    }

    public void openPolice_station(View view) {
        startActivity(new Intent(this,policeStation.class));
    }
}