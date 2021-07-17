package com.example.retrofitevaluation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    TextView mtvHumidity;
    TextView mtvDescription;
    TextView mtvTemp;
    TextView mtvSpeed;
    TextView mtvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        initViews();

    }

    private void initViews() {

        mtvHumidity = findViewById(R.id.setHumidity);
        mtvDescription = findViewById(R.id.setDescription);
        mtvTemp = findViewById(R.id.settemperature);
        mtvSpeed = findViewById(R.id.setSpeed);
        mtvName = findViewById(R.id.setName);

        Bundle bundle=getIntent().getExtras();

        String Humidity=bundle.getString("Humidity");
        String Description=bundle.getString("Desc");
        String Temp= bundle.getString("Temp");
        String Speed=bundle.getString("Speed");
        String Name=bundle.getString("Name");


        mtvHumidity.setText(Humidity);
        mtvDescription.setText(Description);
        mtvTemp.setText(Temp);
        mtvSpeed.setText(Speed);
        mtvName.setText(Name);




    }

}