package com.example.retrofitevaluation;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.HTTP;
import retrofit2.http.Header;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiClient {
    @GET("data/2.5/weather?q=Mangalore&appid=6699c70179c894baaa21d440091b9a55")
    Call<ResponseModel> getAllResponse();

}
