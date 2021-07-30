package com.example.fragments_we;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

public class AnimalViewholder  extends RecyclerView.ViewHolder {

    private ImageView miVIMAGE;
    private TextView mTvAnimalname;


    public AnimalViewholder(@NonNull View itemView) {
        super(itemView);
        init(itemView);
    }

    private void init(View itemView) {
        miVIMAGE=itemView.findViewById(R.id.btnImage);
        mTvAnimalname=itemView.findViewById(R.id.tvText1);

    }

    public  void SetData(Animal animal){
        Glide.with(miVIMAGE).load(animal.getUrl()).into(miVIMAGE);
        mTvAnimalname.setText(animal.getName());

    }
}
