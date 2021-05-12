package com.ksing.plantpartner;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

public class PlantTrackerActivity extends AppCompatActivity {

    // Progress level
    int progressLevel = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_tracker);

        // REMEMBER TO GET PROGRESS FROM DATABASE FOR EACH PLANT
        String plant = getIntent().getStringExtra("plant");
        System.out.println("Individual Plant: " + plant);
        TextView displayedPlant = (TextView)findViewById(R.id.individualPlant);
        displayedPlant.setText(plant);

        // Circular Progress Bar
//        CircularProgressBar progressBar = findViewById(R.id.circularProgressBar);
//        progressBar.setProgressBarColor(Color.GREEN);
//
//        // Water Progress Text
//        TextView waterText = (TextView)findViewById(R.id.waterProgressText);
//
//        // Water Button
//        Button waterButton = (Button)findViewById(R.id.waterButton);

        // Water ClickListener will change the progress bar and percentage text
//        waterButton.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                // NEED TO CHANGE THE PROGRESS DEPENDING ON HOW MUCH WATER THE PLANT NEEDS!!
//                // ProgressBar Change
//                progressLevel += 10;
//                progressBar.setProgressWithAnimation(progressLevel, (long) 1000);
//
//                // Water text change
//                if(progressLevel != 100){
//                    waterText.setText(progressLevel + "%");
//                }
//                else{
//                    waterText.setText("Plant has received enough water today!");
//                }
//                System.out.println("Progress Bar clicked!");
//
//            }
//        });




    }
}