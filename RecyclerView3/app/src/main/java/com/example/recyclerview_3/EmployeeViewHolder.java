package com.example.recyclerview_3;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EmployeeViewHolder extends RecyclerView.ViewHolder {
    private TextView mTvName;
    private TextView mTvAge;
    private TextView mTvAddress;
    private ItemClickListener itemClickListener;
    private ImageView mIvEdit;

    public EmployeeViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initView(itemView);
    }

    private void initView(View itemView) {

        mTvName = itemView.findViewById(R.id.tvName);
        mTvAge = itemView.findViewById(R.id.tvAge);
        mTvAddress = itemView.findViewById(R.id.tvAddress);
        mIvEdit = itemView.findViewById(R.id.ivEdit);
    }


    public void Setdata(Employee employee) {
        mTvName.setText(employee.getName());
        mTvAge.setText(employee.getAge() + "");
        mTvAddress.setText(employee.getAddress());

        mIvEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onItemClicked(employee,getAdapterPosition());
            }
        });


    }
}
