package com.example.fragment2studentdatapassing_we;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;


public class StudentPersonnelDetailsFragment extends Fragment {
    private EditText mEtStudentname;
    private  EditText mEtStudentAge;
    private Button mBtnNext;
    private   Fragmentcommunicationlistner Listner;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student_personnel_details, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initviews(view);
    }

    private void initviews(View view) {
        mEtStudentname=view.findViewById(R.id.etUsername);
        mEtStudentAge=view.findViewById(R.id.etUserAge);
        mBtnNext=view.findViewById(R.id.btnLaunchFragment);
        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Listner!=null){
                    Bundle bundle = new Bundle();
                    bundle.putString("name",mEtStudentname.getText().toString());
                    bundle.putString("Age", mEtStudentAge.getText().toString());
                    Listner.onDataRecived(bundle);
                }

            }
        });

    }
    public  void setLlistner(Fragmentcommunicationlistner llistner){
        this.Listner=Listner;
        
    }
    @Override
     public  void onAttach(@NonNull Context context){
        super.onAttach(context);
        Listner=(Fragmentcommunicationlistner) context;
     }


}