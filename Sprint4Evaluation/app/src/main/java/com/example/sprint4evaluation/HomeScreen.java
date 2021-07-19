package com.example.sprint4evaluation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeScreen extends AppCompatActivity implements onClickListner{

    private RecyclerView mRecyclerView;
    private List<ResponseDTO> responseDTOS=new ArrayList<>();
    AdapterClass adapterClass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        mRecyclerView=findViewById(R.id.mRecyclerView);
        DataAdapter();
        callApi();


    }

    private void callApi() {
        ApiService apiService=Network.getInstances().create(ApiService.class);
        apiService.getData().enqueue(new Callback<List<ResponseDTO>>() {
            @Override
            public void onResponse(Call<List<ResponseDTO>> call, Response<List<ResponseDTO>> response) {
                if (response!=null){
                    responseDTOS=response.body();
                    adapterClass.UpdateResponse(responseDTOS);

                }
            }

            @Override
            public void onFailure(Call<List<ResponseDTO>> call, Throwable t) {

            }
        });

    }

    private void DataAdapter() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);


        adapterClass = new AdapterClass(responseDTOS,this);

        mRecyclerView.setAdapter(adapterClass);
    }

    @Override
    public void delete(int pos) {
        responseDTOS.remove(pos);
        adapterClass.UpdateResponse(responseDTOS);

    }
}