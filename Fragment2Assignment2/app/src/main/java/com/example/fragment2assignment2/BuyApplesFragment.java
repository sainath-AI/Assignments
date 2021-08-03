package com.example.fragment2assignment2;

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
import android.widget.TextView;

public class BuyApplesFragment extends Fragment {

    EditText mEtBuyApple;
    Button mBtnPrevious;
    TextView mtvTotalApple;
    TextView mtvRemainingApple;

    private String TotalApple;

    private FragmentListeners listeners;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_buy_apples, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
        getbundle();
    }

    private void getbundle() {

        if(getArguments()!=null){

            TotalApple=getArguments().getString("totalApple");

            mtvTotalApple.setText(TotalApple);


        }
    }

    private void initViews(View view) {

        mEtBuyApple=view.findViewById(R.id.etBuyApple);
        mtvTotalApple=view.findViewById(R.id.gtTotalApple);
        mBtnPrevious=view.findViewById(R.id.btnPreview);

        mBtnPrevious.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                SetData();

                if (listeners != null) {

                    Bundle bundle = new Bundle();

                    String data = mEtBuyApple.getText().toString();

                    bundle.putString("Apple", data);

                    listeners.ReceivedDataToFirst(bundle);



            }}
        });
    }

    private void SetData() {



        }


    public void SetListeners(FragmentListeners listeners){
        this.listeners=listeners;
    }
}