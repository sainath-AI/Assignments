package com.example.staticmusicplayer;

import android.media.MediaPlayer;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MusicViewHolder extends RecyclerView.ViewHolder {

    private ArrayList<Music> musicArrayList;
    private OnItemCLicked onItemCLicked;
    private ImageView image;
    private TextView SongName;
    private TextView songDuration;
    private Button mBtnPlay;
    private Button mbtnPause;
    private Button MbtnDelete;




    public MusicViewHolder(@NonNull View itemView, OnItemCLicked onItemCLicked) {
        super(itemView);
        this.onItemCLicked=onItemCLicked;
        initViewa(itemView);
    }

    private void initViewa(View itemView) {
        image=itemView.findViewById(R.id.trackImage);
        SongName=itemView.findViewById(R.id.SongName);
        songDuration=itemView.findViewById(R.id.songDuration);
        mBtnPlay=itemView.findViewById(R.id.btnPlay);
        mbtnPause=itemView.findViewById(R.id.btnPause);
        MbtnDelete=itemView.findViewById(R.id.btnDelete);



    }

    public void setdata(Music music) {
        image.setImageResource(music.getImage());
        SongName.setText(music.getSongName());
        songDuration.setText(music.getSongDuration());
        final MediaPlayer mediaPlayer = MediaPlayer.create(SongName.getContext(),music.getSongs());

        mBtnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!mediaPlayer.isPlaying()){
                    mediaPlayer.start();
                }
            }
        });
        mbtnPause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.pause();
                }

            }
        });
        MbtnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onItemCLicked.delete(getAdapterPosition());
            }
        });
    }
}
