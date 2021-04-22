package com.ksing.plantpartner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.ArrayList;

public class PlantActivity extends AppCompatActivity {

    ProgressBar bar;
    int total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant);
        ArrayList<String> results = (ArrayList<String>)getIntent().getSerializableExtra("RESULTS");

        // View IDs
        TextView plant = (TextView)findViewById(R.id.plantText);
        TextView plant2 = (TextView)findViewById(R.id.plantText2);
        TextView plant3 = (TextView)findViewById(R.id.plantText3);

        // Set Buttons
        Button plantButton = (Button)findViewById(R.id.plantButton);
        Button plantButton2 = (Button)findViewById(R.id.plantButton2);
        Button plantButton3 = (Button)findViewById(R.id.plantButton3);
        plantButton.setVisibility(View.INVISIBLE);
        plantButton2.setVisibility(View.INVISIBLE);
        plantButton3.setVisibility(View.INVISIBLE);

        // Progress bar
        bar = (ProgressBar) findViewById(R.id.loadingPlant);

        // Sets a delay on the loading circle
        bar.setProgress(total);
        int oneMin= 1 * 3 * 1000; // 1 minute in milli seconds

        /** CountDownTimer starts with 1 minutes and every onTick is 1 second */
        CountDownTimer cdt = new CountDownTimer(oneMin, 1000) {

            public void onTick(long millisUntilFinished) {

                int timePassed = 0;
                total = (int) ((timePassed / 60) * 100);
                bar.setProgress(total);
            }

            public void onFinish() {
                System.out.println(results.get(0));
                if(results.get(1).equals("Low")){
                    plantButton.setVisibility(View.VISIBLE);
                    plantButton2.setVisibility(View.VISIBLE);
                    plantButton3.setVisibility(View.VISIBLE);
                    plantButton.setText("Pothos");
                    plantButton2.setText("Prayer Plant");
                    plantButton3.setText("Heart-Leaf Philodendron");

                }
                else if(results.get(1).equals("Medium")){
                    plantButton.setVisibility(View.VISIBLE);
                    plantButton2.setVisibility(View.VISIBLE);
                    plantButton3.setVisibility(View.VISIBLE);
                    plantButton.setText("Spider Plant");
                    plantButton2.setText("Peace Lily");
                    plantButton3.setText("Croton");
                }
                else{
                    plantButton.setVisibility(View.VISIBLE);
                    plantButton2.setVisibility(View.VISIBLE);
                    plantButton3.setVisibility(View.VISIBLE);
                    plantButton.setText("Snake Plant");
                    plantButton2.setText("Jade Plant");
                    plantButton3.setText("Hibiscus");
                }

                bar.setVisibility(View.GONE);

            }
        }.start();

        // Plant Buttons will go to Homepage
        plantButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                goToHomePage();
            }
        });

        plantButton2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                goToHomePage();
            }
        });

        plantButton3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                goToHomePage();
            }
        });

    }

    // When the user selects a plant, they will be directed to the HomePageActivity
    public void goToHomePage(){
        Intent intent = new Intent(this, HomePageActivity.class);
        startActivity(intent);

    }


}