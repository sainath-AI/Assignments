package com.example.staticfragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

   private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager= getSupportFragmentManager();
       launchFragA();
        launchFragB();

    }

    private void launchFragB() {
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        FragmentA fragmentA = new FragmentA();
        fragmentTransaction.add(R.id.flcontainer1,fragmentA,"fragA").commit();
    }
    private void launchFragA() {
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        FragmentB fragmentB = new FragmentB();
        fragmentTransaction.add(R.id.flcontainer2,fragmentB,"fragB").commit();

    }


}