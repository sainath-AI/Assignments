package com.example.famouspersonalitiesrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements itemclicklistner{

 private ArrayList<Data> dataList;
 private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvRecycle);
        buildRecyclerviewData();
        setRecyclerviewData();

    }
    private void setRecyclerviewData(){
        DataAdapter dataAdapter= new DataAdapter(dataList, this);
        GridLayoutManager linearLayoutManager= new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(dataAdapter);

    }

    private void buildRecyclerviewData(){
        dataList=new ArrayList<>();
        dataList.add(new Data(R.drawable.jeff_bezos , "amazon" , "56","business"));
        dataList.add(new Data(R.drawable.bill_gates1, "microsoft" , "64","business"));
        dataList.add(new Data(R.drawable.prateek_sukla , "masai school" , "31","business"));
        dataList.add(new Data(R.drawable.jeff_bezos , "amazon" , "56","business"));
        dataList.add(new Data(R.drawable.bill_gates1, "microsoft" , "64","business"));
        dataList.add(new Data(R.drawable.prateek_sukla , "masai school" , "31","business"));
        dataList.add(new Data(R.drawable.jeff_bezos , "amazon" , "56","business"));
        dataList.add(new Data(R.drawable.bill_gates1, "microsoft" , "64","business"));
        dataList.add(new Data(R.drawable.prateek_sukla , "masai school" , "31","business"));

    }

    @Override
    public void onItemClicked(int position, Data data) {
        Toast.makeText(MainActivity.this,"name "+data.getCompanyName() + "age "+ data.getAge(),Toast.LENGTH_SHORT).show();
    }
}
