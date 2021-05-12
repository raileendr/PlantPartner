package com.ksing.plantpartner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomePageActivity extends AppCompatActivity {

    public String myPlantFirstPlant = "";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Data plant retrieved from PlantActivity
        String firstPlant = getIntent().getStringExtra("plant");
        myPlantFirstPlant = firstPlant;
        System.out.println("Homepage: " + firstPlant);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // Feature Buttons
        ImageButton plantTracker = (ImageButton)findViewById(R.id.plantTrackerButton);
        ImageButton myPlants = (ImageButton)findViewById(R.id.myPlantsButton);

        // Go to plantTracker
        plantTracker.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                goToPlantTracker();
            }
        });

        // Go to myPlants
        myPlants.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                goToMyPlants();
            }
        });
    }

    // Goes to the PlantTrackerActivity file
    public void goToPlantTracker(){
        Intent intent = new Intent(this, PlantCalendar.class);
        startActivity(intent);
    }

    // Goes to the myPlantsActivity file
    public void goToMyPlants(){
        Intent intent = new Intent(this, MyPlantsActivity.class);
        intent.putExtra("FIRST_PLANT", myPlantFirstPlant);
        startActivity(intent);

    }
}