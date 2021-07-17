package com.example.retrofitassignment_02;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyHolder extends RecyclerView.ViewHolder {

    TextView mtvText;
    TextView mtvText2;
    TextView mtvText3;


    public MyHolder(@NonNull View itemView) {
        super(itemView);

        getinit(itemView);
    }

    private void getinit(View itemView) {

        mtvText=itemView.findViewById(R.id.textShow);
        mtvText2=itemView.findViewById(R.id.textShow1);
        mtvText3=itemView.findViewById(R.id.textShow2);
    }

    public void SetData(ResponseModel responseModel){
        mtvText.setText(responseModel.getUserId()+"");
        mtvText2.setText(responseModel.getId()+"");
        mtvText3.setText(responseModel.getTitle());
    }
}
