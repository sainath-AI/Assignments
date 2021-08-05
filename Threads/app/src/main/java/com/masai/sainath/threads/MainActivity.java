package com.masai.sainath.threads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    private Button task1;
    private Button task2;
    private WorkingThread workingThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        task1=findViewById(R.id.button);
        task2=findViewById(R.id.button2);
        workingThread=new WorkingThread();
        workingThread.start();

        task1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                workingThread.addTaskToMessageQueue(taskOne);

            }
        });
        task2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                workingThread.addTaskToMessageQueue(taskTwo);


            }
        });

    }
    private Runnable taskOne=new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    };
    private Runnable taskTwo = new Runnable() {
        @Override
        public void run() {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    };
}