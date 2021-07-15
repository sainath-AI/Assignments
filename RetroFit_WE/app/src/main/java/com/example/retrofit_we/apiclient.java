package com.example.retrofit_we;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface apiclient {
    @GET("api/users/{userId}")
    Call<Response> getUser(@Path("userId") int id);
}
