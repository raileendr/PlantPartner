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

        // View IDs
        TextView plant = (TextView)findViewById(R.id.plantText);
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
                plant.setText("Cactus");
                bar.setVisibility(View.GONE);

            }
        }.start();

    }


}