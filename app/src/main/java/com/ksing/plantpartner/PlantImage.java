package com.ksing.plantpartner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PlantImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_image);

        String plant = getIntent().getStringExtra("plant");
        System.out.println("MyPlantsActivity: " + plant);

        TextView plant_desc = (TextView)findViewById(R.id.plant_desc);
        TextView plant_title = (TextView)findViewById(R.id.plant_title);

        String pothos_desc = "\t\t\tBasic pothos care is very easy. These plants enjoy a wide range of environments. They do well in bright indirect light as well as low light and can be grown in dry soil or in vases of water. They will thrive in nutrient rich soil, but do almost as well in nutrient poor soil. Pothos plants make a great addition to you bathroom or office because they can tolerate low light. While pothos likes a wide variety of light conditions, they do not do well in direct sunlight.\n " +
                "\t\t\tPothos is very popular due to the fact that it can be grown in water or in dry soil. Cuttings can be taken from a mother plant and rooted in water and kept in water as a houseplant. This is convenient for placing a pothos plant in hard to reach areas in a jug of water where it can remain untouched as long as water remains in the jug. On the opposite end, pothos can also be started in soil and will tolerate moderate periods of dry soil with little effect to the plant. ";
        String hibiscus_desc = "\t\t\tMany people who are growing a hibiscus plant choose to do so in a container. This allows them to move the hibiscus plant to ideal locations, depending on the time of year. Provide the plants with at least six hours of sunlight, especially if you want to see those lovely blooms. Although warm, humid conditions are ideal for tropical hibiscus, you may want to provide a little afternoon shade when it’s overly hot. Again, containers make this easy to do.\n" +
                "\t\t\tWhile most hibiscus plants can only be kept as annuals here since they can’t survive sub-zero winter temperatures, there are a few cold-hardy varieties available that can be planted as perennials. We have brought in a very special Hibiscus that can withstand the coldest temperatures that our climate can subject it to.   With deep green, almost black tinted foliage and 9 inch diameter bright red blooms, this hibiscus is appropriately named the “Holy Grail.” It will come back year after year, growing up to 5 ft in height and spread. The Holy Grail won’t bloom until early August but we promise it will be well worth the wait.";

        switch(plant){
            case "pothos":
                plant_desc.setText(pothos_desc);
                plant_title.setText("Pothos");
                break;
            case "hibiscus":
                plant_desc.setText(hibiscus_desc);
                plant_title.setText("Hibiscus");
                break;
            default:
                break;
        }

    }
}