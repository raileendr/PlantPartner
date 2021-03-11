package com.ksing.plantpartner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

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
                    plant.setText("Pothos");
                    plant2.setText("Prayer Plant");
                    plant3.setText("Heart-Leaf Philodendron");

                }
                else if(results.get(1).equals("Medium")){
                    plant.setText("Spider Plant");
                    plant2.setText("Peace Lily");
                    plant3.setText("Croton");
                }
                else{
                    plant.setText("Snake Plant");
                    plant2.setText("Jade Plant");
                    plant3.setText("Hibiscus");
                }

                bar.setVisibility(View.GONE);

            }
        }.start();

    }


}