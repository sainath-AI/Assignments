package com.example.getresourcesapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {
@GET("api/unknown/{userId}")
    Call<Response>getUser(@Path("userId") int id);

}
