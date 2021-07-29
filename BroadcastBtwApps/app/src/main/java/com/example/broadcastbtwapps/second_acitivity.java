 package com.example.broadcastbtwapps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class second_acitivity extends AppCompatActivity {
    private TextView mTvtext1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_acitivity);
        mTvtext1=findViewById(R.id.text1);
        getdatafromextras();
    }

    private void getdatafromextras() {
        if(getIntent()!=null&& getIntent().getExtras()!=null){
            mTvtext1.setText(getIntent().getStringExtra("data"));
        }
    }
}