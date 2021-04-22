package com.ksing.plantpartner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HomePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // Feature Buttons
        ImageButton plantTracker = (ImageButton)findViewById(R.id.plantTrackerButton);

        // Go to plantTracker
        plantTracker.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                goToPlantTracker();
            }
        });
    }

    // Goes to the PlantTrackerActivity file
    public void goToPlantTracker(){
        Intent intent = new Intent(this, PlantTrackerActivity.class);
        startActivity(intent);
    }
}