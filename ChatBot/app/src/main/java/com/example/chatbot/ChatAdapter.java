package com.example.chatbot;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private List<ChatModel>  chatModelList;

    public ChatAdapter(List<ChatModel> chatModelList) {
        this.chatModelList = chatModelList;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch(viewType){
            case 1:
                view= LayoutInflater.from(parent.getContext()).inflate(R.layout.senderlayout,parent, false);
                return new SenderViewholder(view);
            case 2:
                view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recieverlayout,parent,false);
                return new RecieverViewHolder(view);
        }

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
       int itemType = chatModelList.get(position).getType();
       ChatModel chatModel = chatModelList.get(position);
       switch (itemType){
           case 1:
               if(holder instanceof  SenderViewholder){
                   ((SenderViewholder) holder).setsenderData((SenderModel) chatModel);
               }
               break;
           case 2:
               if(holder instanceof  RecieverViewHolder) {
                   ((RecieverViewHolder)holder).setData((ReceiverModel) chatModel);

               }
               break;
               }
    }

    @Override
    public int getItemViewType(int position) {
        return chatModelList.get(position).getType();
    }

    @Override
    public int getItemCount() {
        return chatModelList.size();
    }
}
