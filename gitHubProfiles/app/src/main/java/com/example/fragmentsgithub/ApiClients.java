package com.example.fragmentsgithub;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiClients {
    @GET("users/{user}/repos")
    Call<List<ResponseModel>> getResponse(@Path("user") String user);
}
