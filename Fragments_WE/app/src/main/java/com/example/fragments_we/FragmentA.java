package com.example.fragments_we;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;


public class FragmentA extends Fragment {

   private RecyclerView recyclerView;
   private List<Animal>animals;

    public  FragmentA() {

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.RecyclerView);
        builrecycyclerdta();
        setadapter();
    }

    private void setadapter() {
        ANimalAdapeter aNimalAdapeter= new ANimalAdapeter(animals);
        LinearLayoutManager linearLayoutManager =new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(aNimalAdapeter);
    }

    private void builrecycyclerdta() {
        animals = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
          animals.add(new Animal("Dog","https://i.pinimg.com/originals/22/81/89/2281893b67d3f704aacd772f0569e1c4.jpg"));
          animals.add(new Animal("dogs","https://ca-times.brightspotcdn.com/dims4/default/5267edd/2147483647/strip/true/crop/2397x1598+0+0/resize/1486x991!/quality/90/?url=https%3A%2F%2Fcalifornia-times-brightspot.s3.amazonaws.com%2F2d%2Fe3%2F865a333a42c98a822c49fee7cd9b%2Fap19301725142822.jpg"));
        }
    }
}