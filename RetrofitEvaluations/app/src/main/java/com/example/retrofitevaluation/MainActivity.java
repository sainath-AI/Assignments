package com.example.retrofitevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText mtvCity;
    Button mtvBtn;
    TextView Humidity;
    TextView Description;
    TextView Temp;
    TextView Speed;
    TextView Name;

    private static final String API_KEY = "6699c70179c894baaa21d440091b9a55";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViewsAndListeners();
    }

    private void initViewsAndListeners() {

        mtvCity = findViewById(R.id.City);
        mtvBtn = findViewById(R.id.btnShowResponse);
        Humidity = findViewById(R.id.getHumidity);
        Description = findViewById(R.id.getDescription);
        Temp = findViewById(R.id.gettemperature);
        Speed = findViewById(R.id.getSpeed);
        Name = findViewById(R.id.getName);


        mtvBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                ApiClient apiClient = Network.getInstances().create(ApiClient.class);

                apiClient.getAllResponse().enqueue(new Callback<ResponseModel>() {
                    @Override
                    public void onResponse(Call<ResponseModel> call, Response<ResponseModel> response) {
                        if (response.body() != null) {

                            ResponseModel responseModel = response.body();

                            SysModel model = responseModel.getSys();

                            model.getCountry();

                            MainModel mainModel = responseModel.getMain();
                            mainModel.getHumidity();

                            CoordModel coordModel = responseModel.getCoord();

                            WindModel windModel = responseModel.getWind();
                            windModel.getSpeed();


                            UpdateData(response.body());
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseModel> call, Throwable t) {

                    }
                });

            }


            public void UpdateData(ResponseModel responseModel) {


                Name.setText(responseModel.getName());
                Humidity.setText(responseModel.getSys().getCountry());
                Description.setText(responseModel.getTimezone() + "");
                Humidity.setText(responseModel.getMain().getHumidity() + "");
                Speed.setText(responseModel.getWind().getSpeed() + "");
                Temp.setText(responseModel.getWind().getDeg() + "");


                Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("Name",Name.getText().toString());
                intent.putExtra("Desc",Description.getText().toString());
                intent.putExtra("Humidity",Humidity.getText().toString());
                intent.putExtra("Speed",Speed.getText().toString());
                intent.putExtra("Temp",Temp.getText().toString());
                startActivity(intent);


            }
        });
    }
}
