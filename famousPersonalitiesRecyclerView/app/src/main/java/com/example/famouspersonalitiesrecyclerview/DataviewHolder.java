package com.example.famouspersonalitiesrecyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class DataviewHolder extends RecyclerView.ViewHolder {


    private ImageView imageView;
    private TextView mTvCompany;
    private TextView mTvAge;
    private CardView cardView;
    private TextView mTvOccupation;
    private itemclicklistner itemclicklistner;

    public DataviewHolder(@NonNull View itemView, itemclicklistner itemclicklistner) {
        super(itemView);
        initViews(itemView);
        this.itemclicklistner=itemclicklistner;
    }
    private void initViews( View itemView) {
        imageView = itemView.findViewById(R.id.imageView);
        mTvCompany = itemView.findViewById(R.id.textView);
        mTvAge = itemView.findViewById(R.id.textView2);
        mTvOccupation = itemView.findViewById(R.id.textView3);
        cardView=itemView.findViewById(R.id.rvcard);

    }
   public   void setData(Data data){
        imageView.setImageResource(data.getImage());
        mTvCompany.setText(data.getCompanyName());
        mTvAge.setText(data.getAge());
        mTvOccupation.setText(data.getOccupation());
       cardView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               itemclicklistner.onItemClicked(getAdapterPosition(),data);
           }
       });


    }
}
