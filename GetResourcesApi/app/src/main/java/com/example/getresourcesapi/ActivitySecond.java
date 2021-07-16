package com.example.getresourcesapi;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import org.w3c.dom.Text;

import retrofit2.Call;
import retrofit2.Callback;

import static com.example.getresourcesapi.MainActivity.metSearch;

public class ActivitySecond  extends AppCompatActivity {
    private  TextView mtvName;
    private TextView mtvYear;
    private TextView mtvCompany;
    private ProgressBar mprogress;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        initilizeviews();


    }

    private void initilizeviews() {
        mtvName=findViewById(R.id.tvName);
        mtvYear=findViewById(R.id.tvYear);
        mtvCompany=findViewById(R.id.tvCompany);
        mprogress=findViewById(R.id.progressbar);
        callApi();;
    }
    private  void callApi(){
        String userId = metSearch.getText().toString();
        int id =Integer.parseInt(userId);
        ApiService api = Network.getInstance().create(ApiService.class);
        api.getUser(id).enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
                if(response.body()!=null){
                    updateDat(response.body());
                    mprogress.setVisibility(View.GONE);

                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });

    }
    public   void updateDat(Response response){
        mtvName.setText(response.getData().getName());
        mtvYear.setText(response.getData().getYear() + "");
        mtvCompany.setText(response.getData().getColor());
        View view = this.getWindow().getDecorView();
    }
    }
