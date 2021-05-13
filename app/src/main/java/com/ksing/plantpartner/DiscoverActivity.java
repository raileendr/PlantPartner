package com.ksing.plantpartner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DiscoverActivity extends AppCompatActivity {

    public String plantName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_discover);

        ImageView plant1 = (ImageView)findViewById(R.id.plant1);
        ImageView plant2 = (ImageView)findViewById(R.id.plant2);

        plant1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                plantName = "pothos";
                System.out.println("Clicked!");
                Intent intent = new Intent(DiscoverActivity.this, PlantImage.class);
                intent.putExtra("plant", plantName);
                startActivity(intent);
            }
        });

        plant2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                plantName = "hibiscus";
                System.out.println("Clicked!");
                Intent intent = new Intent(DiscoverActivity.this, PlantImage.class);
                intent.putExtra("plant", plantName);
                startActivity(intent);
            }
        });

    }
}