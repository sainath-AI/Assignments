package com.example.reciversappbroadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Reciverbroadcast reciverbroadcast;
    private TextView mtvtext1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mtvtext1 = findViewById(R.id.text);
        reciverbroadcast = new Reciverbroadcast();
        IntentFilter intentFilter = new IntentFilter("com.sai.broadcast");
        registerReceiver(reciverbroadcast, intentFilter);

    }


    }
