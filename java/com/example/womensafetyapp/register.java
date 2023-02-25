package com.example.womensafetyapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class register extends AppCompatActivity {

    private FirebaseAuth auth;
    private EditText emailAdd, password;
    private Button registerButton;
    private TextView loginRedirectText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        auth = FirebaseAuth.getInstance();
        emailAdd  = findViewById(R.id.editTextTextEmailAddress3);
        password = findViewById(R.id.editTextTextPassword2);
        registerButton = findViewById(R.id.button6);
        loginRedirectText = findViewById(R.id.loginRedirectText);
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user = emailAdd.getText().toString().trim();
                String pass = password.getText().toString().trim();

                if (user.isEmpty()) {
                    emailAdd.setError("Email cannot be empty");
                }
                if (pass.isEmpty()){
                    password.setError("Password cannot be empty");
                } else {
                    auth.createUserWithEmailAndPassword(user, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(register.this, "Register Successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(register.this, login.class));
                            } else {
                                Toast.makeText(register.this, "Register Failed" + task, Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });
        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(register.this, login.class));
            }
        });
    }

    public void openLogin_register(View view) {
        startActivity(new Intent(this,loginRegister.class));
    }
}