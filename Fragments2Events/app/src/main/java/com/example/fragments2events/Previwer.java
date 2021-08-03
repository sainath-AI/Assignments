package com.example.fragments2events;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Previwer extends AppCompatActivity {

    private TextView mTvTitle;
    private  TextView mTvDiscrip;
    private  TextView mTvSD;
    private  TextView mTvED;
    private  TextView mTvST;
    private  TextView mTvET;
    private  TextView mTvPrice;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preview);
        initviews();
        getInentData();

    }

    private void getInentData() {
        if(getIntent()!=null){
            String Title=getIntent().getStringExtra("title");
            String DIscrip=getIntent().getStringExtra("discrip");
            String SD=getIntent().getStringExtra("sdate");
            String ED=getIntent().getStringExtra("edate");
            String  ST=getIntent().getStringExtra("stime");
            String ET=getIntent().getStringExtra("etime");
            String Price=getIntent().getStringExtra("price");
            mTvTitle.setText(Title);
            mTvDiscrip.setText(DIscrip);
            mTvSD.setText(SD);
            mTvED.setText(ED);
            mTvST.setText(ST);
            mTvET.setText(ET);
            mTvPrice.setText(Price);
        }
    }

    private void initviews() {
        mTvTitle=findViewById(R.id.tvTitle);
        mTvDiscrip=findViewById(R.id.tvDIscrip);
        mTvSD=findViewById(R.id.tvStartDate);
        mTvED=findViewById(R.id.tvEndDate);
        mTvST=findViewById(R.id.tvStartTime);
        mTvET=findViewById(R.id.tvEndTime);
        mTvPrice=findViewById(R.id.tvPrice);
    }

}