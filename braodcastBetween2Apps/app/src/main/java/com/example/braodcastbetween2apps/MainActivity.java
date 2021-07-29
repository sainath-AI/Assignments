package com.example.braodcastbetween2apps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button mBtnbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiview();
        onregister();
    }

    private void onregister() {


    }


    private void intiview() {
        mBtnbutton=findViewById(R.id.button);
        mBtnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction("com.sai.broadcast");
                intent.putExtra("data", "hey from first app");
                sendBroadcast(intent);


            }
        });

    }
}