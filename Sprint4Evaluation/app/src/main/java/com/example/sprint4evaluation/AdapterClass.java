package com.example.sprint4evaluation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AdapterClass extends RecyclerView.Adapter<ViewHolderClass> {

    List<ResponseDTO> responseDTOS;
    onClickListner onClickListner;

    public AdapterClass(List<ResponseDTO> responseDTOS,onClickListner onClickListner) {
        this.responseDTOS = responseDTOS;
        this.onClickListner=onClickListner;
    }

    @NonNull
    @Override
    public ViewHolderClass onCreateViewHolder(@NonNull  ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new ViewHolderClass(view,onClickListner);
    }

    @Override
    public void onBindViewHolder(@NonNull  ViewHolderClass holder, int position) {
        ResponseDTO responseDTO= responseDTOS.get(position);
        holder.setData(responseDTO);

    }

    @Override
    public int getItemCount() {
        return responseDTOS.size();
    }
    public void UpdateResponse(List<ResponseDTO> responseDTOS){
        this.responseDTOS=responseDTOS;
        notifyDataSetChanged();
    }
}
