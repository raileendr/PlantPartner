package com.ksing.plantpartner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MyPlantsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{

    ListView plantList;
    ArrayList<String> plants = new ArrayList<String>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        String plant = getIntent().getStringExtra("FIRST_PLANT");
        System.out.println("MyPlantsActivity: " + plant);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_plants);

        TextView firstPlant = (TextView)findViewById(R.id.firstPlant);
        firstPlant.setText((plant));

        plantList = findViewById(R.id.plantList);

        // GET plants = FROM DATABASE
        plants.add(plant);
        plants.add("Temp");
        plants.add("Temp2");
        // Not sure what ArrayAdapter does; do more research to understand
        ArrayAdapter<String> plantAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, plants);
        plantList.setAdapter(plantAdapter);
        plantList.setOnItemClickListener(this);

    }


    // Handles Item click
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String plant = plantList.getItemAtPosition(position).toString();
        System.out.println("Item Clicked: " + plant);
        Intent intent = new Intent(this, PlantTrackerActivity.class);
        intent.putExtra("plant", plant);
        startActivity(intent);
    }
}