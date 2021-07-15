package com.example.chatbot;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecieverViewHolder  extends RecyclerView.ViewHolder {

    private TextView mTvReciever;
    private TextView mTvTime;


    public RecieverViewHolder(@NonNull View itemView) {
        super(itemView);
        mTvReciever=itemView.findViewById(R.id.tvReceiverChatMessage);
        mTvTime=itemView.findViewById(R.id.tvTime);

    }
    public void  setData(ReceiverModel receiverModel){
        mTvReciever.setText(receiverModel.getMessage());
        mTvTime.setText(receiverModel.getTime());
    }
}
