package com.example.retrofitassignment_02;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {
    private List<ResponseModel> responseModels;

    public MyAdapter(List<ResponseModel> responseModels) {

        this.responseModels=responseModels;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.row,parent,false);

        return new MyHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        ResponseModel model = responseModels.get(position);
        holder.SetData(model);

    }

    @Override
    public int getItemCount() {
        return responseModels.size();
    }

    public void UpdateResponse(List<ResponseModel> responseModels){
        this.responseModels=responseModels;
        notifyDataSetChanged();
    }
}
