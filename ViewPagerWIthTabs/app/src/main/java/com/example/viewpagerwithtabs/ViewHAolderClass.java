package com.example.viewpagerwithtabs;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;



public class ViewHAolderClass extends RecyclerView.ViewHolder {


    private TextView  mTvString;

    public ViewHAolderClass(@NonNull View itemView) {
        super(itemView);
        mTvString=itemView.findViewById(R.id.tvString);
    }
    public  void setData(Model model){
        mTvString.setText(model.getName());

    }
}
