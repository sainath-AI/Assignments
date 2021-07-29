package com.example.broadcast_reciverwe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private WithinAppbroadcast withinAppbroadcast;
    private TextView mTvname;
    private  TextView mTvage;
    private Button mBtnSendtext;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        registerLocalbroadcast();
        initviews();
    }


    private void initviews() {
        mTvname=findViewById(R.id.tvname);
        mBtnSendtext=findViewById(R.id.btnbutton);
        mBtnSendtext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent("com.sai.broadcast.masai");
                intent.putExtra("data","Hello masai school");
                sendBroadcast(intent);
            }
        });
    }
    private void registerLocalbroadcast() {
        withinAppbroadcast=new WithinAppbroadcast();
        IntentFilter intentFilter=new IntentFilter("com.sai.broadcast.masai");
        registerReceiver(withinAppbroadcast,intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(withinAppbroadcast);
    }

    private class WithinAppbroadcast extends BroadcastReceiver {

        @Override
        public void onReceive(Context context, Intent intent) {
            if(intent!=null && intent.getExtras()!=null){
                String data = intent.getStringExtra("data");
                mTvname.setText(data);


            }

        }
    }
}