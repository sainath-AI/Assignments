package com.example.fragments2events;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class PriceDetailsFragment extends Fragment {

    private EditText mEtprice;
    private EditText mEtCurrency;
    private Button mBtnPreview;
    private  String title;
    private  String  discrip;
    private  String SD;
    private  String ED;
    private  String ST;
    private  String ET;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_price_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initview(view);
        getDatafrombundle();

    }

    private void getDatafrombundle() {

        title=getArguments().getString("title");
        discrip=getArguments().getString("discrip");
        SD=getArguments().getString("sdate");
        ED=getArguments().getString("edate");
        ST=getArguments().getString("stime");
        ET=getArguments().getString("etime");


    }

    private void initview(View view) {
        mEtprice=view.findViewById(R.id.etPrice);
        mEtCurrency=view.findViewById(R.id.etCurrency);
        mBtnPreview=view.findViewById(R.id.openPreview);
        mBtnPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LaunchPreviewActivity();
            }

            private void LaunchPreviewActivity() {
                Intent intent = new Intent(getContext(),Previwer.class);
                intent.putExtra("title",title);
                intent.putExtra("discrip",discrip);
                intent.putExtra("sdate",SD);
                intent.putExtra("edate",ED);
                intent.putExtra("stime",ST);
                intent.putExtra("etime",ET);
                intent.putExtra("price",mEtprice.getText().toString());
                startActivity(intent);

            }
        });
    }
}