package com.example.sprint4evaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginScreen extends AppCompatActivity {


    private EditText mEtEmail;
    private EditText mEtPassword;
    private Button mBtnButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEtEmail = findViewById(R.id.etEmail);
        mEtPassword = findViewById(R.id.etPassWord);
        mBtnButton = findViewById(R.id.btnButton);
        mBtnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //if (isCredentials()) {
                    Intent intent = new Intent(LoginScreen.this, HomeScreen.class);
                    startActivity(intent);
               // }
            }


        });
    }

    private Boolean isCredentials() {
        boolean isDataValid = false;
        if (!mEtEmail.getText().toString().contains("@gmail.com")) {
            mEtEmail.setError("Invalid Name");
            isDataValid = false;
        }

        if (mEtPassword.getText().toString().length() < 6) {
            mEtPassword.setError("Password is very Short");
            isDataValid = false;
        }
        return false;
    }
}