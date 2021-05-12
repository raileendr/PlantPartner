package com.ksing.plantpartner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class IndividualPlant extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_individual_plant);

        String plant = getIntent().getStringExtra("plant");
        System.out.println("Individual Plant: " + plant);
        TextView displayedPlant = (TextView)findViewById(R.id.individualPlant);
        displayedPlant.setText(plant);
    }
}