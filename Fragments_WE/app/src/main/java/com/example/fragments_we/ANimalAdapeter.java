package com.example.fragments_we;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ANimalAdapeter extends RecyclerView.Adapter<AnimalViewholder> {
    private List<Animal> animals;

    public  ANimalAdapeter(List<Animal> animalList){
        this.animals=animalList;
    }



    @NonNull
    @Override
    public AnimalViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);

        return  new AnimalViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalViewholder holder, int position) {
     Animal animal=animals.get(position);
     holder.SetData(animal);
       }

    @Override
    public int getItemCount() {
        return animals.size();
    }
}
