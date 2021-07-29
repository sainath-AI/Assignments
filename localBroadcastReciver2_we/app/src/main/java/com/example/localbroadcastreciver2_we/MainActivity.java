package com.example.localbroadcastreciver2_we;

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


    private  LocalBroadcatReciver localBroadcatReciver;
    private TextView mTvtextview;
    private Button mBtnbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        regiterLocalBroadcast();
        initviews();
    }

    private void initviews() {
        mTvtextview=findViewById(R.id.tvDAta);
        mBtnbutton=findViewById(R.id.btnbutton);
        mBtnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.llod.local.broadcast.masai");
                intent.putExtra("data","hello masai School");
                sendBroadcast(intent);
            }
        });
    }
    private void regiterLocalBroadcast(){
        localBroadcatReciver= new LocalBroadcatReciver();
        IntentFilter intentFilter=new IntentFilter("com.llod.local.broadcast.masai");
        registerReceiver(localBroadcatReciver,intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(localBroadcatReciver);
    }

    private class LocalBroadcatReciver extends BroadcastReceiver{

        @Override
        public void onReceive(Context context, Intent intent) {

            if(intent!=null && intent.getExtras()!=null){
                String data = intent.getStringExtra("data");
                mTvtextview.setText(data);
            }
        }
    }
}