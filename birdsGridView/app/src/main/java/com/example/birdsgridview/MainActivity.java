package com.example.birdsgridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<bird_model> birdList;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.Recyclerview);
        buildData();
        setrecycleviewadapter();
    }

    private void setrecycleviewadapter() {
        birdadapter adapter= new birdadapter(birdList);
        GridLayoutManager gridLayoutManager =new GridLayoutManager(this,4, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);

    }

    private void buildData() {
        birdList=new ArrayList<>();
        for(int i=0;i<100;i++){
            if(i%4==0) {
                birdList.add(new bird_model(R.drawable.eagle));
            }else if(i%4==1){
                birdList.add(new bird_model(R.drawable.bird2));

            }else if(i%4==2){
                birdList.add(new bird_model(R.drawable.bird3));

            }else if(i%4==3){
                birdList.add(new bird_model(R.drawable.bird4));

            }

        }

    }


}