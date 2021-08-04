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


public class FragmentB extends Fragment {

    private RecyclerView recyclerView;
    private List<Model> models;

    public static FragmentB newInstance(){
        FragmentB fragmentB = new FragmentB();
        return fragmentB;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_b, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerview);
        buildDAta();
        setadapter();
    }

    private void setadapter() {
        FragmentAdapter fragmentAdapter = new FragmentAdapter(models);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(fragmentAdapter);
    }

    private void buildDAta() {
        models = new ArrayList<>();
        models.add(new Model("NewYork"));
        models.add(new Model("Silicon VAlley"));
        models.add(new Model("Palo Alto"));
        models.add(new Model("California"));
        models.add(new Model("Boca Chica"));
        models.add(new Model("Delhi"));
        models.add(new Model("Bengalore"));
        models.add(new Model("Mumbai"));
        models.add(new Model("Alwar"));
        models.add(new Model("Chicago"));
        models.add(new Model("washington"));
        models.add(new Model("Miami"));


    }
}