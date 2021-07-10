package com.example.animalsrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity  implements itemclicklister{

    private ArrayList<Animal_model> AnimalList;
    private RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.animalrrecylcerview);
        buildRecyclerViewData();
        setRecyclerviewAdapter();
    }
    private void setRecyclerviewAdapter(){
        animalAdapter animalAdapter=new animalAdapter(AnimalList,this);
        GridLayoutManager linearLayoutManager= new GridLayoutManager(this, 2);
       recyclerView.setLayoutManager(linearLayoutManager);
       recyclerView.setAdapter(animalAdapter);
    }

    private void buildRecyclerViewData(){
        AnimalList = new ArrayList<>();
        AnimalList.add(new Animal_model(R.drawable.doggy," Dog","mammal"));
        AnimalList.add(new Animal_model(R.drawable.apee," Ape","mammal"));
        AnimalList.add(new Animal_model(R.drawable.simba," lion","mammal"));
        AnimalList.add(new Animal_model(R.drawable.horsepower,"horse","mammal"));
        AnimalList.add(new Animal_model(R.drawable.elephant," ELephant","mammal"));
        AnimalList.add(new Animal_model(R.drawable.cat," cat","mammal"));
        AnimalList.add(new Animal_model(R.drawable.tige," Tiger","mammal"));
        AnimalList.add(new Animal_model(R.drawable.doggy," Dog","mammal"));
        AnimalList.add(new Animal_model(R.drawable.apee," Ape","mammal"));
        AnimalList.add(new Animal_model(R.drawable.simba," lion","mammal"));
        AnimalList.add(new Animal_model(R.drawable.horsepower,"horse","mammal"));
        AnimalList.add(new Animal_model(R.drawable.elephant," ELephant","mammal"));
        AnimalList.add(new Animal_model(R.drawable.cat," cat","mammal"));
        AnimalList.add(new Animal_model(R.drawable.tige," Tiger","mammal"));
        AnimalList.add(new Animal_model(R.drawable.doggy," Dog","mammal"));
        AnimalList.add(new Animal_model(R.drawable.apee," Ape","mammal"));
        AnimalList.add(new Animal_model(R.drawable.simba," lion","mammal"));
        AnimalList.add(new Animal_model(R.drawable.horsepower,"horse","mammal"));
        AnimalList.add(new Animal_model(R.drawable.elephant," ELephant","mammal"));
        AnimalList.add(new Animal_model(R.drawable.cat," cat","mammal"));
        AnimalList.add(new Animal_model(R.drawable.tige," Tiger","mammal"));

    }

    @Override
    public void onItemClickListner(int position ,Animal_model animal_model) {
        Toast.makeText(MainActivity.this, "item is" +animal_model.getName(), Toast.LENGTH_SHORT).show();

    }
}