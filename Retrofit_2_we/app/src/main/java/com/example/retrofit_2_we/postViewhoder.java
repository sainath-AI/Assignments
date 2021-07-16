package com.example.retrofit_2_we;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

public class postViewhoder  extends RecyclerView.ViewHolder {
    private TextView mtvName;
    private  TextView mtvemail;
    private  TextView mtvBody;



    public postViewhoder(@NonNull View itemView) {
        super(itemView);
        initviews(itemView);

    }

    private void initviews(View itemView) {
        mtvName=itemView.findViewById(R.id.tvName);
        mtvemail=itemView.findViewById(R.id.tvEmail);
        mtvBody=itemView.findViewById(R.id.tvBody);


    }
    public void setdata(Responsemodel responsemodel){
        mtvName.setText(responsemodel.getName());
        mtvemail.setText(responsemodel.getEmail());
        mtvBody.setText(responsemodel.getBody());


    }
}
