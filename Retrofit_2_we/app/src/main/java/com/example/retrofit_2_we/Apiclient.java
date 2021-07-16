package com.example.retrofit_2_we;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Apiclient {
    @GET("comments")

    Call<List<Responsemodel>> getAllPosts(@Query("postId")int id);
}
