package com.example.itunes_api.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.itunes_api.R;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;


public class MainActivity extends AppCompatActivity implements OnClickListener {
    private Button button;
    private RecyclerView recyclerView;
    private Responses responseList = new Responses();
   private DataAdapter dataAdapter;
   private EditText etSearch;
    public MediaPlayer mediaPlayer = new MediaPlayer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btnFetch);
        recyclerView = findViewById(R.id.rvDataFetch);
        etSearch = findViewById(R.id.etSearch);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callApi();
            }
        });

    }

    private void callApi() {
        String str = etSearch.getText().toString();
        ApiService apiService = Network.getInstance().create(ApiService.class);
        apiService.getUser(str).enqueue(new Callback<Responses>() {
            @Override
            public void onResponse(Call<Responses> call, retrofit2.Response<Responses> response) {
                 setRecyclerView(responseList);
                if (response.body() != null) {
                    responseList = response.body();
                    dataAdapter.updateList(responseList);
                }
            }

            @Override
            public void onFailure(Call<Responses> call, Throwable t) {

            }
        });
    }

    private void setRecyclerView(Responses responseList) {

        dataAdapter = new DataAdapter(responseList, this);
        dataAdapter.notifyDataSetChanged();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(dataAdapter);
    }

    @Override
    public void playMusic(int pos, ResultsItem resultsItem) {
        mediaPlayer.reset();
        if (mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
        }
        mediaPlayer.setAudioStreamType(AudioManager.STREAM_MUSIC);
        try {
            mediaPlayer.setDataSource(resultsItem.getPreviewUrl());
            mediaPlayer.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mediaPlayer.start();
    }

    @Override
    public void pauseMusic() {
        mediaPlayer.stop();
    }

    @Override
    public void delete(int pos) {
        responseList.getResults().remove(pos);
        dataAdapter.updateList(responseList);
    }
}