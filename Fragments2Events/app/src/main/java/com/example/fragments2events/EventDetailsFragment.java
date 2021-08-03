package com.example.fragments2events;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;


public class EventDetailsFragment extends Fragment  {
    private  FragmentCommunicationListner Listner;
    private EditText metTitle;
    private  EditText metDiscription;
    private Button mbtnext;





    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_event_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        iniit(view);

    }



    private void iniit(View view) {
        metTitle=view.findViewById(R.id.etTitle);
        metDiscription=view.findViewById(R.id.etDiscription);
        mbtnext=view.findViewById(R.id.btnNextFrag);
        mbtnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Listner!=null){
                    Bundle bundle= new Bundle();
                    bundle.putString("title",metTitle.getText().toString());
                    bundle.putString("discrip",metDiscription.getText().toString());
                    Listner.onDataRecieved(bundle);
                }
            }
        });
    }
    public void setListner(FragmentCommunicationListner Listner){
        this.Listner= Listner;
    }
    @Override
    public void onAttach(@NonNull Context context) {

        super.onAttach(context);
        Listner=(FragmentCommunicationListner)context;
    }


}