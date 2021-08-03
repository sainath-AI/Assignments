package com.example.fragments2events;

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


public class TimeAndDateFragment extends Fragment {
    private EditText metstartdate;
    private  EditText metendDate;
    private  EditText metstarttime;
    private  EditText metendTime;
    private Button mbtnnettFrag2;
    private  String title;
    private  String  discrip;

    private   FragmentCommunicationListner Listner;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_time_and_date, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initviews(view);
        getDatafrombundle();


    }
    private void getDatafrombundle() {
        if (getArguments() != null) {

            title = getArguments().getString("title");
            discrip = getArguments().getString("discrip");
        }
    }

    private void initviews(View view) {
        metstartdate= view.findViewById(R.id.EventStartDate);
        metendDate=view.findViewById(R.id.EventEndDate);
        metstarttime=view.findViewById(R.id.EventStartTime);
        metendTime=view.findViewById(R.id.EventEndtime);
        mbtnnettFrag2=view.findViewById(R.id.btnnxtfrg2);
        mbtnnettFrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Listner!=null){
                    Bundle bundle = new Bundle();
                    bundle.putString("title",title);
                    bundle.putString("discrip",discrip);
                    bundle.putString("sdate",metstartdate.getText().toString());
                    bundle.putString("edate",metendDate.getText().toString());
                    bundle.putString("stime",metstarttime.getText().toString());
                    bundle.putString("etime",metendTime.getText().toString());
                    Listner.onDAtaTimeRecicived(bundle);


                }
            }
        });

    }
    public void setListner(FragmentCommunicationListner Listner){
        this.Listner=Listner;
    }



    @Override
    public  void onAttach(@NonNull Context context){
        super.onAttach(context);
        Listner=(FragmentCommunicationListner) context;
    }
}