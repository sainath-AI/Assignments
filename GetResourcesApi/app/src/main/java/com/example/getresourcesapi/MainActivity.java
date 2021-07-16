package com.example.getresourcesapi;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {
     public static EditText metSearch;
    private Button mBtnSearchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
    }

    private void initviews() {
        metSearch=findViewById(R.id.etSearchbar);
        mBtnSearchButton=findViewById(R.id.btSearchButton);
        mBtnSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,ActivitySecond.class);
                startActivity(intent);
            }

        });
    }
}