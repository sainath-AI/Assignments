package com.example.staticmusicplayer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnItemCLicked {

    private ArrayList<Music> musicArrayList;
    private RecyclerView recyclerView;
    private MusicAdapter musicAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvDataFetch);
        buildRecyclerviewData();
        setRecyclerviewData();

    }

    private void setRecyclerviewData() {
         musicAdapter= new MusicAdapter(musicArrayList,this);
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(musicAdapter);
    }

    private void buildRecyclerviewData() {
        musicArrayList=new ArrayList<>();
        musicArrayList.add(new Music(R.drawable.images1 ,R.raw.song1, "bekalyali" , "3 mins 50 sec"));
        musicArrayList.add(new Music(R.drawable. images2,R.raw.song2, "blinding ligths" , "3 mins 50 sec"));
        musicArrayList.add(new Music(R.drawable. images3,R.raw.song3, "Divine" , "3 mins 50 sec"));
        musicArrayList.add(new Music(R.drawable. images4,R.raw.song4, "Aduri kahani" , "3 mins 50 sec"));
        musicArrayList.add(new Music(R.drawable. images5,R.raw.song5, "Zara Zara" , "3 mins 50 sec"));
        musicArrayList.add(new Music(R.drawable. images1,R.raw.song6, "Bewafa" , "3 mins 50 sec"));
        musicArrayList.add(new Music(R.drawable. images2,R.raw.song7, "Let me down slowly" , "3 mins 50 sec"));
        musicArrayList.add(new Music(R.drawable. images3,R.raw.song8, "Let her go" , "3 mins 50 sec"));
        musicArrayList.add(new Music(R.drawable. images5,R.raw.song9, "Malang" , "3 mins 50 sec"));

    }


    @Override
    public void delete( int pos) {
        musicArrayList.remove(pos);
        musicAdapter.notifyDataSetChanged();

    }
}