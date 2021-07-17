package com.example.retrofitassignment_02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ProgressBar progressBar;

    List<ResponseModel> responseModels = new ArrayList<>();

    MyAdapter myAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar=findViewById(R.id.progress);
        recyclerView=findViewById(R.id.Recycler);
        DataAdapter();
        CallApi();
    }

    private void CallApi() {

        ApiClient apiClient =Network.getInstances().create(ApiClient.class);
        apiClient.getResponse().enqueue(new Callback<List<ResponseModel>>() {
            @Override
            public void onResponse(Call<List<ResponseModel>> call, Response<List<ResponseModel>> response) {

                if(response!=null){

                   responseModels=response.body();
                 myAdapter.UpdateResponse(responseModels);
                 progressBar.setVisibility(View.GONE);
                }

            }

            @Override
            public void onFailure(Call<List<ResponseModel>> call, Throwable t) {

            }
        });


    }

    private void DataAdapter() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);


        myAdapter = new MyAdapter(responseModels);

        recyclerView.setAdapter(myAdapter);
    }
}