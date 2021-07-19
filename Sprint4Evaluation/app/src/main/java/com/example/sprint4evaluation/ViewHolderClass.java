package com.example.sprint4evaluation;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;



public class ViewHolderClass extends RecyclerView.ViewHolder {
    TextView mtvText1;
    TextView mtvText2;
    TextView mtvText3;
    TextView mtvText4;
    TextView mtvText5;
    TextView mtvText6;
    TextView mtvText7;
    ImageView mCardView;
    onClickListner onClickListner;


    public ViewHolderClass(@NonNull  View itemView, onClickListner onClickListner) {
        super(itemView);
        this.onClickListner=onClickListner;
        initView(itemView);
    }

    private void initView(View itemView) {
        mtvText1=itemView.findViewById(R.id.Date);
        mtvText2=itemView.findViewById(R.id.Positive);
        mtvText3=itemView.findViewById(R.id.Negative);
        mtvText4=itemView.findViewById(R.id.HospitalziedCurr);
        mtvText5=itemView.findViewById(R.id.OnVentilator);
        mtvText6=itemView.findViewById(R.id.Death);
        mtvText7=itemView.findViewById(R.id.DateChecked);
        mCardView=itemView.findViewById(R.id.cardview);
    }

    public void setData(ResponseDTO responseDTO) {
        mtvText1.setText(responseDTO.getDate()+ "");
        mtvText2.setText(responseDTO.getPositive() + "");
        mtvText3.setText(responseDTO.getNegative() + "");
        mtvText4.setText(responseDTO.getHospitalizedCurrently() + "");
        mtvText5.setText(responseDTO.getOnVentilatorCurrently() + "");
        mtvText6.setText(responseDTO.getDeath()+ "");
        mtvText7.setText(responseDTO.getDateChecked());
       mCardView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               onClickListner.delete(getAdapterPosition());

           }
       });

    }
}
