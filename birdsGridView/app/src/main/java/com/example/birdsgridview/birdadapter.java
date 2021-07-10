package com.example.birdsgridview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class birdadapter extends RecyclerView.Adapter<birdviewholder> {
    private ArrayList<bird_model> birdList;
    public  birdadapter(ArrayList<bird_model> birdModelArrayList){
        birdList =birdModelArrayList;
        
    }

    @NonNull
    @Override
    public birdviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.bird_item_layout,parent,false);

        return  new birdviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull birdviewholder holder, int position) {
        bird_model bird= birdList.get(position);
        holder.setdata(bird);


    }

    @Override
    public int getItemCount()
    {
        return birdList.size();
    }
}
