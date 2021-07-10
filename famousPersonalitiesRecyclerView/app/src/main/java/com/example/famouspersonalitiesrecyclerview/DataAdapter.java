package com.example.famouspersonalitiesrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataviewHolder> {
    private ArrayList<Data> dataList;
    private itemclicklistner itemclicklistner;
    public DataAdapter(ArrayList<Data> dataArrayList, itemclicklistner itemclicklistner){
        dataList=dataArrayList;
        this.itemclicklistner=itemclicklistner;
    }

    @NonNull
    @Override
    public DataviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new DataviewHolder(view,itemclicklistner);
    }

    @Override
    public void onBindViewHolder(@NonNull DataviewHolder holder, int position) {
        Data data=dataList.get(position);
        holder.setData(data);

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }
}
