package com.example.itunes_api.activity;

public interface OnClickListener {
    void playMusic(int pos, ResultsItem resultsItem);
    void pauseMusic();
    void delete(int pos);
}
