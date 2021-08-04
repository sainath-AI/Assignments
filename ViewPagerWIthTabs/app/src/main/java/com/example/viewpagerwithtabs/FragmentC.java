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

public class FragmentC extends Fragment {

    private RecyclerView recyclerView;
    private List<Model> models;


    public  static  FragmentC newInstance(){
        FragmentC fragmentC = new FragmentC();
        return fragmentC;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_c, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerview);
        buildDAta();
        setadapter();
    }

    private void buildDAta() {
        models = new ArrayList<>();
        models.add(new Model("Munnar"));
        models.add(new Model("Manali"));
        models.add(new Model("WAyanad"));
        models.add(new Model("taj mahal"));
        models.add(new Model("Abbe Falls"));
        models.add(new Model("Love LAke"));
        models.add(new Model("burj kalifa"));
        models.add(new Model("Kanya kumari"));
        models.add(new Model("india gate"));
        models.add(new Model("Nayagra falls"));
        models.add(new Model("kilimanjaro"));
        models.add(new Model("mount Everst"));

    }

    private void setadapter() {
        FragmentAdapter fragmentAdapter = new FragmentAdapter(models);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(fragmentAdapter);
    }

}