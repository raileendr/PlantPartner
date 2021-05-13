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
        ImageButton discoverButton = (ImageButton)findViewById(R.id.discoverButton);

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

        // Go to discoverActivity
        discoverButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToDiscover();
            }
        });
    }

    // Goes to the PlantCalendar file
    public void goToPlantTracker(){
        Intent intent = new Intent(this, PlantCalendar.class);
        intent.putExtra("FIRST_PLANT", myPlantFirstPlant);
        startActivity(intent);
    }

    // Goes to the myPlantsActivity file
    public void goToMyPlants(){
        Intent intent = new Intent(this, MyPlantsActivity.class);
        intent.putExtra("FIRST_PLANT", myPlantFirstPlant);
        startActivity(intent);

    }

    // Goes to the DiscoverActivity file
    public void goToDiscover(){
        Intent intent = new Intent(this, DiscoverActivity.class);
        startActivity(intent);
    }
}