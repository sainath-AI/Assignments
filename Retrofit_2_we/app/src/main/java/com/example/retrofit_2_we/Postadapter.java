package com.example.retrofit_2_we;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Postadapter  extends RecyclerView.Adapter<postViewhoder> {

    private List<Responsemodel> responsemodelList;

    public  Postadapter(List<Responsemodel> responsemodelList){
       this.responsemodelList=responsemodelList;
    }
    @NonNull
    @Override
    public postViewhoder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new postViewhoder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull postViewhoder holder, int position) {
Responsemodel responsemodel= responsemodelList.get(position);
holder.setdata(responsemodel);
    }


    @Override
    public int getItemCount()
    {
        return  responsemodelList.size();
    }
    public void updatedata(List<Responsemodel> responsemodelList){
        this.responsemodelList=responsemodelList;
        notifyDataSetChanged();
    }
}
