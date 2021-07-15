package com.example.chatbot;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


import java.sql.Timestamp;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<ChatModel> chatModelList= new ArrayList<>();
    private EditText   mEtChatMessage;
    private EditText mEtType;
    private Button mBtnSend;
    private RecyclerView mRecyclerView;
    private ChatAdapter chatAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initview();
        setrecyclerAdapter();
        buildChatList();

    }

    private void setrecyclerAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        chatAdapter= new ChatAdapter(chatModelList);
        mRecyclerView.setAdapter(chatAdapter);

    }

    private void initview() {
        mRecyclerView=findViewById(R.id.recyclerView);
        mEtChatMessage=findViewById(R.id.etChatMessage);
        mEtType=findViewById(R.id.etSenderOrReceiver);
        mBtnSend=findViewById(R.id.btnSend);
        mBtnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buildChatList();
            }
        });
    }

    private void buildChatList() {
        if(mEtType.getText().toString().equals("1")){
            chatModelList.add(new SenderModel(mEtChatMessage.getText().toString()));
        }else if(mEtType.getText().toString().equals("2")){
            chatModelList.add(new ReceiverModel(mEtChatMessage.getText().toString(),getFormattedDate()));
        }
        chatAdapter.notifyDataSetChanged();
    }
    public String getFormattedDate() {
        Timestamp stamp = new Timestamp(System.currentTimeMillis());
        Date date = new Date(stamp.getTime());
        Format hourMinFormat = new SimpleDateFormat("HH.mm");
        return hourMinFormat.format(date);
    }
}