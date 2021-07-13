package com.example.recyclerview_3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ItemClickListener {
    private RecyclerView mRVrecyclerView;
    private ArrayList<Employee> employeesList;
    private CardView mEditCardView;
    private EditText mEtName;
    private EditText mEtAge;
    private EditText mEtAddress;
    private Button mBtnDone;

    private EmployeeAdapter employeeAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intiViews();
        BuildList();
        setRecyclrAdapter();

    }

    private void setRecyclrAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRVrecyclerView.setLayoutManager(linearLayoutManager);
        employeeAdapter = new EmployeeAdapter(employeesList, this);
        mRVrecyclerView.setAdapter(employeeAdapter);

    }

    private void BuildList() {

        employeesList = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            employeesList.add(new Employee("Sai Krishna", 20 + i, "banglore"));

        }
    }

    private void intiViews() {
        mRVrecyclerView = findViewById(R.id.recyclerView);
        mEditCardView = findViewById(R.id.editCardView);
        mEtName = findViewById(R.id.etName);
        mEtAge = findViewById(R.id.etAge);
        mEtAddress = findViewById(R.id.etAddress);
        mBtnDone = findViewById(R.id.btnDone);


    }

    @Override
    public void onItemClicked(Employee employee, int position) {
        mEditCardView.setVisibility(View.VISIBLE);
        mEtName.setText(employee.getName());
        mEtAge.setText(employee.getAge() + "");
        mEtAddress.setText(employee.getAddress());
        mBtnDone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Employee employee1 = new Employee(mEtName.getText().toString(), Integer.parseInt(mEtAge.getText().toString()), mEtAddress.getText().toString());
                mEditCardView.setVisibility(View.GONE);
                employeesList.set(position, employee1);
                employeeAdapter.notifyItemChanged(position);


            }
        });
    }
}