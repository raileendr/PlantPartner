package com.ksing.plantpartner;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyPlantsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{



    ListView plantList;
    ArrayList<String> plants = new ArrayList<String>();

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        String plant = getIntent().getStringExtra("FIRST_PLANT");
        System.out.println("MyPlantsActivity: " + plant);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_plants);

        TextView firstPlant = (TextView)findViewById(R.id.firstPlant);
        EditText addPlantText = (EditText)findViewById(R.id.addPlantText);
        addPlantText.setInputType(InputType.TYPE_NULL);
        EditText removePlantText = (EditText)findViewById(R.id.removePlantText);
        removePlantText.setInputType(InputType.TYPE_NULL);
        Button addPlant = (Button)findViewById(R.id.addPlant);
        Button removePlant = (Button)findViewById(R.id.removePlant);
        firstPlant.setText((plant));

        plantList = findViewById(R.id.plantList);

        // GET plants = FROM DATABASE
        plants.add(plant);
        // Not sure what ArrayAdapter does; do more research to understand
        ArrayAdapter<String> plantAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, plants);
        plantList.setAdapter(plantAdapter);
        plantList.setOnItemClickListener(this);


        // Add plant
        addPlant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Add plant button clicked");
                plants.add(addPlantText.getText().toString());
                addPlantText.getText().clear();
                plantAdapter.notifyDataSetChanged();

            }
        });

        // Remove plant
        removePlant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Remove plant button clicked");
                plants.remove(removePlantText.getText().toString());
                removePlantText.getText().clear();
                plantAdapter.notifyDataSetChanged();
            }
        });
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


