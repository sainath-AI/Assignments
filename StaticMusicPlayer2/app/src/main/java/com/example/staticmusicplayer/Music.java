package com.example.staticmusicplayer;

import android.widget.LinearLayout;

public class Music {
    private int image;
    private int songs;
    private  String SongName;
    private String SongDuration;


    public Music(int image, int songs, String songName, String songDuration) {
        this.image = image;
        this.songs = songs;
        SongName = songName;
        SongDuration = songDuration;
    }

    public int getImage() {
        return image;
    }

    public int getSongs() {
        return songs;
    }

    public String getSongName() {
        return SongName;
    }

    public String getSongDuration() {
        return SongDuration;
    }
}