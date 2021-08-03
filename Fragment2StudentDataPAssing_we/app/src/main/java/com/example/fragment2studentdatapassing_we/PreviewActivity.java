package com.example.fragment2studentdatapassing_we;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PreviewActivity extends AppCompatActivity {

private TextView mtvname;
private  TextView mtvAge;
private  TextView mtvpercentage;
private  TextView mtvgrade;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview);
        initviews();
        getIntentData();
    }

    private void initviews() {
        mtvAge=findViewById(R.id.tvAge);
        mtvname=findViewById(R.id.tvName);
        mtvpercentage=findViewById(R.id.tvpercentage);
        mtvgrade=findViewById(R.id.tvgrade);


    }

    private void getIntentData() {
        if (getIntent()!=null){
            String name = getIntent().getStringExtra("name");
            String age=  getIntent().getStringExtra("age");
            String percentage=getIntent().getStringExtra("percentage");
            String Grade= getIntent().getStringExtra("grade");
            mtvname.setText(name);
            mtvAge.setText(age);
            mtvpercentage.setText(percentage);
            mtvgrade.setText(Grade);

        }
    }
}