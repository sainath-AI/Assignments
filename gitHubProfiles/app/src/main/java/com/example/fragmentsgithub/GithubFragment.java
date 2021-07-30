package com.example.fragmentsgithub;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class GithubFragment extends Fragment {
    private EditText mEtSearch;
    private Button mBtnCallApi;
    private List<ResponseModel> responseModelList=new ArrayList<>();
    private RecyclerView recyclerView;
    private PostAdapter postAdapter;


    public GithubFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_github, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView=view.findViewById(R.id.recyclerView);
        mEtSearch=view.findViewById(R.id.etUser);
        mBtnCallApi=view.findViewById(R.id.btnCallApi);
        mBtnCallApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callApi();
            }
        });

        setRecyclerData();
    }

    private void setRecyclerData() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        postAdapter=new PostAdapter(responseModelList);
        recyclerView.setAdapter(postAdapter);
    }

    private void callApi() {
        ApiClients apiClients=Network.getInstance().create(ApiClients.class);
        apiClients.getResponse(mEtSearch.getText().toString()).enqueue(new Callback<List<ResponseModel>>() {
            @Override
            public void onResponse(Call<List<ResponseModel>> call, Response<List<ResponseModel>> response) {
                if (response.body()!=null){
                   responseModelList=response.body();
                   postAdapter.updateData(responseModelList);
                }
            }

            @Override
            public void onFailure(Call<List<ResponseModel>> call, Throwable t) {

            }
        });
    }
}