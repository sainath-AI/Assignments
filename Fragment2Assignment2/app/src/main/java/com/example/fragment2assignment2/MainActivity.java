package com.example.fragment2assignment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentCommunication,FragmentListeners {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();


    }




    private void initViews() {
        fragmentManager=getSupportFragmentManager();
        launchFragment();

    }


    private void launchFragment() {

        TotalApplesFragment totalApplesFragment= new TotalApplesFragment();
        totalApplesFragment.SetListeners(this);
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.flContainer,totalApplesFragment,"TotalFragment").commit();
    }


    @Override
    public void ReceivedFragmentCommunication(Bundle bundle) {

        BuyApplesFragment buyApplesFragment = new BuyApplesFragment();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.flContainer, buyApplesFragment, "BuyApple").commit();

          launchSecondFragment();
    }



    private void launchSecondFragment() {


        BuyApplesFragment buyApplesFragment= new BuyApplesFragment();
        buyApplesFragment.SetListeners(this);
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flContainer,buyApplesFragment,"BuyApple").commit();
    }



    @Override
    public void ReceivedDataToFirst(Bundle bundle) {

        TotalApplesFragment totalApplesFragment = new TotalApplesFragment();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.flContainer,totalApplesFragment,"TotalFragment").commit();

    }

    }
