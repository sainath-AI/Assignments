package com.example.fragments2events;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements FragmentCommunicationListner {

    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        LaunchEventDetailsFragment();
    }

    private void initviews() {
        fragmentManager =getSupportFragmentManager();

    }

    private void LaunchEventDetailsFragment() {
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        EventDetailsFragment eventDetailsFragment= new EventDetailsFragment();
        eventDetailsFragment.setListner(this);
        fragmentTransaction.add(R.id.flContainer,eventDetailsFragment,"EventFragment").commit();
    }




    @Override
    public void onDataRecieved(Bundle bundle) {
        TimeAndDateFragment timeAndDateFragment =new TimeAndDateFragment();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        timeAndDateFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.flContainer,timeAndDateFragment,"timeFrag").commit();
        timeAndDateFragment.setListner(this);

    }


    @Override
    public void onDAtaTimeRecicived(Bundle bundle) {
        PriceDetailsFragment priceDetailsFragment =new PriceDetailsFragment();
        FragmentTransaction fragmentTransaction =fragmentManager.beginTransaction();
        priceDetailsFragment.setArguments(bundle);
        fragmentTransaction.replace(R.id.flContainer,priceDetailsFragment,"pricefrag").commit();
    }
}