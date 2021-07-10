package com.example.animalsrecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class Animalviewholder  extends RecyclerView.ViewHolder {
    private ImageView imageView;
    private TextView mtvitemname;
    private TextView mtvitemtype;
    private CardView cardView;
    private  itemclicklister itemclicklister;
    public Animalviewholder(@NonNull View itemView ,itemclicklister itemclicklister) {
        super(itemView);
        initviews(itemView);
        this .itemclicklister=itemclicklister;
    }
    private void initviews(View itemview){
        imageView=itemview.findViewById(R.id.imageView);
        mtvitemname=itemview.findViewById(R.id.name);
        mtvitemtype=itemview.findViewById(R.id.type);
        cardView=itemview.findViewById(R.id.rvcard);

    }
    public void setdata(Animal_model animal_model){
        imageView.setImageResource(animal_model.getImage());
        mtvitemname.setText(animal_model.getName());
        mtvitemtype.setText(animal_model.getType());
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemclicklister.onItemClickListner(getAdapterPosition(),animal_model);

            }
        });
    }
}