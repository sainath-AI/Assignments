package com.example.staticmusicplayer;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MusicAdapter extends RecyclerView.Adapter<MusicViewHolder> {

    private ArrayList<Music> musicArrayList;
    private OnItemCLicked onItemCLicked;

    public MusicAdapter(ArrayList<Music> musicArrayList,OnItemCLicked onItemCLicked){
        this.musicArrayList=musicArrayList;
        this.onItemCLicked=onItemCLicked;
    }

    @NonNull
    @Override
    public MusicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new MusicViewHolder(view,onItemCLicked);
    }

    @Override
    public void onBindViewHolder(@NonNull MusicViewHolder holder, int position) {
        Music music=musicArrayList.get(position);
        holder.setdata(music);

    }

    @Override
    public int getItemCount() {
        return musicArrayList.size();
    }
}
