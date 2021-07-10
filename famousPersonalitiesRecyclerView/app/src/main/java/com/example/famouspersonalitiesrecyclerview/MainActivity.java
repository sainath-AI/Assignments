package com.example.famouspersonalitiesrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
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
        AlertDialog alertDialog = new AlertDialog.Builder(this)
                .setTitle("Hey this is the Data")
                .setMessage(
                        data.getCompanyName() + "\n"
                                + data.getAge() + "\n"
                        + data.getOccupation()

                ).
                        setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }).
                        show();    }
}
