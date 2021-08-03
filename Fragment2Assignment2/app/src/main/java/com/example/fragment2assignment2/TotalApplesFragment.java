package com.example.fragment2assignment2;

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


public class TotalApplesFragment extends Fragment {

    EditText mEtTotalApples;
    TextView mtvRemainingApple;
    Button mBtnNext;

    private String Remaining;

    private FragmentCommunication fragmentCommunication;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_total_apples, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);

         getDataBundle();

}

    private void getDataBundle() {

        if(getArguments()!=null){

            Remaining=getArguments().getString("Apple");

            mtvRemainingApple.setText(Remaining);
        }


    }

    private void initViews(View view) {

        mEtTotalApples=view.findViewById(R.id.etTotalApple);
        mtvRemainingApple=view.findViewById(R.id.etRemainingApple);
        mBtnNext=view.findViewById(R.id.btnNext);

        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(fragmentCommunication!=null) {

                    Bundle bundle = new Bundle();

                    String data = mEtTotalApples.getText().toString();
                    bundle.putString("totalApple", data);

                    fragmentCommunication.ReceivedFragmentCommunication(bundle);
                }
            }
        });

    }

    public void SetListeners(FragmentCommunication fragmentCommunication){

        this.fragmentCommunication=fragmentCommunication;


    }
}