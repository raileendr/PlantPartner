package com.ksing.plantpartner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class PlantTrackerActivity extends AppCompatActivity {

    // Plant Info Arrays
    ArrayList<String> pothos = new ArrayList<>();
    ArrayList<String> prayer_plant = new ArrayList<>();
    ArrayList<String> heart = new ArrayList<>();
    ArrayList<String> spider = new ArrayList<>();
    ArrayList<String> peace = new ArrayList<>();
    ArrayList<String> croton = new ArrayList<>();
    ArrayList<String> snake = new ArrayList<>();
    ArrayList<String> jade = new ArrayList<>();
    ArrayList<String> hibiscus = new ArrayList<>();

    // Progress level
    int progressLevel = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        // Pothos information
        pothos.add("Thrives in bright, indirect light, but can tolerate medium to low indirect light.");
        pothos.add("Needs watering every 1-2 weeks.");
        pothos.add("Don't sweat it. Any humidity level will do.");
        pothos.add("Average home temperature of 65-75°F.");

        // Prayer Plant information
        prayer_plant.add("Avoid putting it in direct sun-too much sun will fade the leaf colours and burn the foilage.");
        prayer_plant.add("Use warm water and feed prayer plants every two weeks.");
        prayer_plant.add("Prayer plants enjoy a humid environment, ideally a humidity level of 50 percent or more.");
        prayer_plant.add("Your plant will grow well in temperatures between 68-85°F.");

        // Heart Leaf Philodendron
        heart.add("These plants enjoy bright diffuse light but avoid direct sunlight as this can burn the leaves.");
        heart.add("Needs watering every 1-2 weeks.");
        heart.add("This tropical plants thrives at about 40 percent humidity.");
        heart.add("The ideal temperature for a philodendron is between 65-78°F.");

        // Spider plant
        spider.add("Keep plants in bright to moderate indirect sunlight.");
        spider.add("Watering once per week should be sufficient.");
        spider.add("This plant does well in low humidity but will thrive with a bit more humidity.");
        spider.add("Your plant prefers temperature between 60-80°F.");

        // Peace lily
        peace.add("Peace lily prefers to have medium, indirect sunlight.");
        peace.add("Watering once per week should keep your plant hydrated.");
        peace.add("This plant does well in low humidity but will thrive with a bit more humidity.");
        peace.add("Peace lilies enjoy warm conditions between 68-85°F.");

        // Croton plant
        croton.add("These plants require/prefer full and direct sunlight.");
        croton.add("One inch of water each week is recommended.");
        croton.add("Keep the humidity level at 40 to 80 percent.");
        croton.add("Keep the room above 60°F and do not expose the plant to cold drafts.");

        // Snake plant
        snake.add("Snake plants prefer bright, indirect light and can tolerate some direct sunlight.");
        snake.add("Use a maximum 1/4 cup of water every few weeks.");
        snake.add("Snake plants thrive in average humidity levels ranging between 40-50 percent.");
        snake.add("They prefer temperatures of 55-85°F.");

        // Jade plant
        jade.add("Jade plants need at least 4 hours of direct sunlight each day.");
        jade.add("Watering once every 2 to 3 weeks is recommended.");
        jade.add("Low humidity levels of 30 to 50 percent is best.");
        jade.add("Jade plants grow best at room temperatures of 65-75°F.");

        // Hibiscus plant
        hibiscus.add("Jade plants need at least 4 hours of direct sunlight each day.");
        hibiscus.add("Watering once 3 to 4 weeks is recommended.");
        hibiscus.add("Hibiscus does well in moderate to high humidity.");
        hibiscus.add("Hibiscus like temperatures between 60-85°F.");


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_tracker);

        // REMEMBER TO GET PROGRESS FROM DATABASE FOR EACH PLANT
        String plant = getIntent().getStringExtra("plant");
        System.out.println("Individual Plant: " + plant);
        TextView displayedPlant = (TextView)findViewById(R.id.individualPlant);
        TextView sunlight = (TextView)findViewById(R.id.sunlightText);
        TextView water = (TextView)findViewById(R.id.waterText);
        TextView humidity = (TextView)findViewById(R.id.humidityText);
        TextView temperature = (TextView)findViewById(R.id.temperatureText);
        Button logButton = (Button)findViewById(R.id.logButton);

        displayedPlant.setText(plant);

        switch(plant){
            case "Pothos":
                sunlight.setText(pothos.get(0));
                water.setText(pothos.get(1));
                humidity.setText(pothos.get(2));
                temperature.setText(pothos.get(3));
                break;
            case "Prayer Plant":
                sunlight.setText(prayer_plant.get(0));
                water.setText(prayer_plant.get(1));
                humidity.setText(prayer_plant.get(2));
                temperature.setText(prayer_plant.get(3));
                break;
            case "Heart-Leaf Philodendron":
                sunlight.setText(heart.get(0));
                water.setText(heart.get(1));
                humidity.setText(heart.get(2));
                temperature.setText(heart.get(3));
                break;
            case "Spider Plant":
                sunlight.setText(spider.get(0));
                water.setText(spider.get(1));
                humidity.setText(spider.get(2));
                temperature.setText(spider.get(3));
                break;
            case "Peace Lily":
                sunlight.setText(peace.get(0));
                water.setText(peace.get(1));
                humidity.setText(peace.get(2));
                temperature.setText(peace.get(3));
                break;
            case "Croton":
                sunlight.setText(croton.get(0));
                water.setText(croton.get(1));
                humidity.setText(croton.get(2));
                temperature.setText(croton.get(3));
                break;
            case "Snake Plant":
                sunlight.setText(snake.get(0));
                water.setText(snake.get(1));
                humidity.setText(snake.get(2));
                temperature.setText(snake.get(3));
                break;
            case "Jade Plant":
                sunlight.setText(jade.get(0));
                water.setText(jade.get(1));
                humidity.setText(jade.get(2));
                temperature.setText(jade.get(3));
                break;
            case "Hibiscus":
                sunlight.setText(hibiscus.get(0));
                water.setText(hibiscus.get(1));
                humidity.setText(hibiscus.get(2));
                temperature.setText(hibiscus.get(3));
                break;
            default:
                break;
        }

        logButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToCalendar();
            }
        });



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

    // Goes to the myPlantsActivity file
    public void goToCalendar(){
        Intent intent = new Intent(this, PlantCalendar.class);
        intent.putExtra("LOGGED", "true");
        startActivity(intent);
    }
}