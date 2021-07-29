package com.example.reciversappbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Reciverbroadcast extends BroadcastReceiver {


    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent!=null && intent.getExtras()!=null){
            String data = intent.getStringExtra("data");

            Toast.makeText(context, "recived " +data, Toast.LENGTH_SHORT).show();

        }

    }
}

