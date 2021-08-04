package com.example.viewpagerwithtabs;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class FragmentA extends Fragment {

    private List<Model>models;
    private RecyclerView recyclerView;

    public static  FragmentA newInstance(){
        FragmentA fragmentA = new FragmentA();
        return fragmentA;
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
        recyclerView=view.findViewById(R.id.recyclerview);
        BUildDAta();
        setadapterclass();

    }

    private void setadapterclass() {
        FragmentAdapter fragmentAdapter = new FragmentAdapter(models);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(fragmentAdapter);

    }

    private void BUildDAta() {
        models=new ArrayList<>();
        models.add(new Model("Elon Musk"));
        models.add(new Model("jeff bezoz"));
        models.add(new Model("Bill gates"));
        models.add(new Model("mark Zuckerberg"));
        models.add(new Model("Warren buffet"));
        models.add(new Model("Carlos"));
        models.add(new Model("Mukesk Amabani"));
        models.add(new Model("Jack ma"));
        models.add(new Model("sainath Reddy"));
        models.add(new Model("neymar"));
        models.add(new Model("Ronaldo"));
        models.add(new Model("Virat kohli"));
        models.add(new Model("Dhoni"));
        models.add(new Model("Narendra modi"));






    }
}