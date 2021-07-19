package com.example.sprint4evaluation;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Part;
import retrofit2.http.Path;

public interface ApiService {
    @GET("v1/us/daily.json")
    Call<List<ResponseDTO>> getData();

}
