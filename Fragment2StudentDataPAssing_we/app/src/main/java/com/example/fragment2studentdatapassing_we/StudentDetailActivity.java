package com.example.fragment2studentdatapassing_we;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class StudentDetailActivity extends AppCompatActivity implements Fragmentcommunicationlistner {

    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initdata();
        LaunchStudentDetailsFragment();
    }

    private void initdata() {
        fragmentManager =getSupportFragmentManager();

    }

    private void LaunchStudentDetailsFragment() {
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        StudentPersonnelDetailsFragment studentPersonnelDetailsFragment= new StudentPersonnelDetailsFragment();
        studentPersonnelDetailsFragment.setLlistner(this);
        fragmentTransaction.add(R.id.flContaiiner,studentPersonnelDetailsFragment,"DetailsFragment")
        .commit();
    }

    @Override
    public void onDataRecived(Bundle bundle) {
       StudentPerformanceDetailsFragment fragment =new StudentPerformanceDetailsFragment();
       FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
       fragment.setArguments(bundle);
       fragmentTransaction.replace(R.id.flContaiiner,fragment,"performfrag").addToBackStack("performFrag").commit();


    }
}