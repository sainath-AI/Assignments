package com.example.birdsgridview;

import android.view.View;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class birdviewholder extends RecyclerView.ViewHolder {
    private ImageView imageView;



    public birdviewholder(@NonNull View itemView)
    {
        super(itemView);
        initview(itemView);
    }

    private void initview(View itemView) {
        imageView=itemView.findViewById(R.id.image1);

    }
    public void setdata(bird_model bird){
        imageView.setImageResource(bird.getImage());

    }
}
