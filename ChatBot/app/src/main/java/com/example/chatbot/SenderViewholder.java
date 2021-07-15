package com.example.chatbot;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SenderViewholder extends RecyclerView.ViewHolder {

    private TextView mTvSenderMessage;


    public SenderViewholder(@NonNull View itemView) {
        super(itemView);
        mTvSenderMessage=itemView.findViewById(R.id.tvSenderChatMessage);

    }
    public void  setsenderData(SenderModel senderModel){
        mTvSenderMessage.setText(senderModel.getMessage());
    }
}
