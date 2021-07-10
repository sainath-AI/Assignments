package com.example.animalsrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class animalAdapter extends RecyclerView.Adapter<Animalviewholder> {

private ArrayList<Animal_model> AnimalList;
private itemclicklister itemclicklister;

public animalAdapter(ArrayList<Animal_model> animal_modelArrayList, itemclicklister itemclicklister){
AnimalList=animal_modelArrayList;
this.itemclicklister=itemclicklister;
}
    @NonNull
    @Override
    public Animalviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
    return new  Animalviewholder(view,itemclicklister);
    }

    @Override
    public void onBindViewHolder(@NonNull Animalviewholder holder, int position) {
   Animal_model animal_model= AnimalList.get(position);
   holder.setdata(animal_model);
    }

    @Override
    public int getItemCount() {
        return AnimalList.size();
    }
}