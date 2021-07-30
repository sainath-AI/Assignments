package com.example.fragments_we;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mbtfrag;
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }

    private void init() {
        mbtfrag=findViewById(R.id.btnLaunchFragments);
        fragmentManager=getSupportFragmentManager();
        mbtfrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launchfrag();

            }
        });

    }
    private  void  launchfrag(){
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentA fragmentA=new FragmentA();
        fragmentTransaction.add(R.id.flContainer,fragmentA,"fragmentA").commit();

    }
}