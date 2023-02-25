package com.example.womensafetyapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void openLoading_screen(View view) {
        startActivity(new Intent(this,loadingScreen.class));
    }

    public void openAdd_contact(View view) { startActivity(new Intent(this,addContact.class));
    }
}