package com.example.fragment2studentdatapassing_we;

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


public class StudentPerformanceDetailsFragment extends Fragment {

private EditText metTotalmarks;
private  EditText mEtPercentage;
private  EditText mEtGrade;
private Button mBtnPreview;
private  String name;
private  String  age;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_student_performance_details, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initviews(view);
        getdatafrombundle();

    }

    private void getdatafrombundle() {

        if(getArguments()!=null){
            name=getArguments().getString("name");
            age= getArguments().getString("age");
        }
    }

    private void initviews(View view) {
        metTotalmarks=view.findViewById(R.id.etmarks);
        mEtPercentage=view.findViewById(R.id.etpercentage);
        mEtGrade=view.findViewById(R.id.etgrade);
        mBtnPreview=view.findViewById(R.id.btnpreview);
        mBtnPreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
          launchpreviewActivity();
            }

            private void launchpreviewActivity() {
                Intent intent = new Intent(getContext(),PreviewActivity.class);
                intent.putExtra("name",name);
                intent.putExtra("age",age);
                intent.putExtra("percentage",mEtPercentage.getText().toString());
                intent.putExtra("grade",mEtGrade.getText().toString());
                startActivity(intent);

            }
        });
    }
    
}