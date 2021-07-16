package com.example.retrofit_2_we;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.PostProcessor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private EditText metuserId;
    private Button mbtnbutton;
    private RecyclerView recyclerView;
    private Postadapter postadapter;
    private List<Responsemodel> responsemodelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initvies();
        setadapter();
    }

    private void setadapter() {
        postadapter = new Postadapter(responsemodelList);
        GridLayoutManager gridLayoutManager =new GridLayoutManager(this,2);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(postadapter);
    }

    private void initvies() {
        metuserId= findViewById(R.id.etUserId);
        mbtnbutton=findViewById(R.id.btnCallApi);
        recyclerView=findViewById(R.id.recyclerView);
        mbtnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                callApi();
            }
        });


    }
    private void callApi(){
        Apiclient apiclient = Network.getInstance().create(Apiclient.class);
        int id = Integer.parseInt(metuserId.getText().toString());
        apiclient.getAllPosts(id).enqueue(new Callback<List<Responsemodel>>() {
            @Override
            public void onResponse(Call<List<Responsemodel>> call, Response<List<Responsemodel>> response) {
                if(response.body()!=null) {
                    responsemodelList = response.body();
                    postadapter.updatedata(responsemodelList);
                }

            }

            @Override
            public void onFailure(Call<List<Responsemodel>> call, Throwable t) {

            }
        });

    }
}