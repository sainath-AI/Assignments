package com.example.anaylasefragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mBtAdda;
    private  Button mBtnAddB;
    private  Button mBtnRemoveA;
    private  Button mBtnRemoveB;
    private  Button mBtnReplaceA;
    private  Button mBtnReplaceB;
    private FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    private void init() {
        mBtAdda= findViewById(R.id.btnAddA);
        mBtnAddB= findViewById(R.id.btnAddB);
        mBtnRemoveA=findViewById(R.id.btnRemoveA);
        mBtnRemoveB=findViewById(R.id.btnRemoveB);
        mBtnReplaceA=findViewById(R.id.btnReplaceAWithB);
     //   mBtnReplaceB.findViewById(R.id.btnReplaceBWithA);
        mBtAdda.setOnClickListener(this);
        mBtnAddB.setOnClickListener(this);
        mBtnRemoveA.setOnClickListener(this);
        mBtnRemoveB.setOnClickListener(this);
        mBtnReplaceA.setOnClickListener(this);
      //  mBtnReplaceB.setOnClickListener(this);
        fragmentManager=getSupportFragmentManager();

    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        switch (id){
            case R.id.btnAddA:
                addA();
                break;
            case  R.id.btnAddB:
                addB();
                break;

            case R.id.btnRemoveA:
                removeA();
                break;
            case R.id.btnRemoveB:
                removeB();
                break;
            case R.id.btnReplaceAWithB:
                replaceA();
                break;
            case R.id.btnReplaceBWithA:
                replaceB();
                break;



        }

    }

    private void replaceB() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentB fragmentB = new FragmentB();
        fragmentTransaction.replace(R.id.flContainer,fragmentB,"fragB").commit();

    }

    private void replaceA() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentA fragmentA = new FragmentA();
        fragmentTransaction.replace(R.id.flContainer,fragmentA,"fraga").commit();
    }

    private void removeB() {
        FragmentB fragmentB = (FragmentB) fragmentManager.findFragmentByTag("FragB");
        if (fragmentB != null) {
            fragmentManager.beginTransaction().remove(fragmentB).commit();
        }
    }

    private void removeA() {
        FragmentA fragmentA = (FragmentA) fragmentManager.findFragmentByTag("FragmentA");
        if (fragmentA != null) {
            fragmentManager.beginTransaction().remove(fragmentA).commit();
        }

    }

    private void addB() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentB fragmentB = new FragmentB();
        fragmentTransaction.add(R.id.flContainer,fragmentB,"fragB").commit();


    }

    private void addA() {
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        FragmentA fragmentA = new FragmentA();
        fragmentTransaction.add(R.id.flContainer,fragmentA,"fraga").commit();

    }
}