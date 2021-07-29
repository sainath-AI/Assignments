package com.example.broadcastbtwapps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
     private Onregister onregister;
    private Button mBtnbutton;
    private static final int REQ_CODE=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerBroadcast();
        mBtnbutton=findViewById(R.id.button);
        mBtnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,second_acitivity.class);
                intent.setAction("com.sai.broadcast");
                intent.putExtra("data","hey from second activity");
                startActivity(intent);
                sendBroadcast(intent);

            }
        });
    }

    private void registerBroadcast() {
        onregister =new Onregister();
        IntentFilter intentFilter=new IntentFilter("com.sai.broadcast");
        registerReceiver(onregister,intentFilter);

    }

    @Override
    protected void onResume() {
        super.onResume();
        ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CAMERA},REQ_CODE);

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(onregister);
    }

    private class Onregister extends BroadcastReceiver{
        @Override
        public void onReceive(Context context, Intent intent) {
            if(intent!=null&&intent.getExtras()!=null){
                String data=intent.getStringExtra("data");
            }


        }
    }



}