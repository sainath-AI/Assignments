package com.example.retrofit_we;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


import retrofit2.Call;
import retrofit2.Callback;

public class MainActivity extends AppCompatActivity {
    private EditText mEtEditText;
    private Button mbtnSearchButton;
    private TextView mtvtext1;
    private TextView mtvText2;
    private  TextView mtvtext3;
    private ImageView migImage;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iitviews();
    }

    private void iitviews() {
        mEtEditText=findViewById(R.id.etSearchbar);
        mbtnSearchButton=findViewById(R.id.btserachbutton);
        mtvtext1=findViewById(R.id.tvTextview1);
        mtvText2 =findViewById(R.id.tvTextview2);
        mtvtext3= findViewById(R.id.tvTextview3);
        migImage=findViewById(R.id.igImageview);
        mbtnSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callApi();
            }
        });
    }
     private void callApi(){
        String userId = mEtEditText.getText().toString();
        int id =Integer.parseInt(userId);
        apiclient api = network.getInstance().create(apiclient.class);
        api.getUser(id).enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, retrofit2.Response<Response> response) {
             if(response.body()!=null){
                 updateData(response.body());
             }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {

            }
        });

    }
    private  void updateData(Response response){
        mtvtext1.setText(response.getData().getFirstName());
        mtvText2.setText(response.getData().getLastName());
        mtvtext3.setText(response.getData().getEmail());
        Glide.with(this).load(response.getData().getAvatar()).into(migImage);

    }

}