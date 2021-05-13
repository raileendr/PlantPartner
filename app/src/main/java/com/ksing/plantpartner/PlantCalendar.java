package com.ksing.plantpartner;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class PlantCalendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plant_calendar);
        CalendarView plantCalendar = (CalendarView) findViewById(R.id.calendarView);
        TextView dateTimeDisplay = (TextView)findViewById(R.id.dateTimeDisplay);


        String plant = getIntent().getStringExtra("FIRST_PLANT");
        System.out.println("Plant Calendar: " + plant);


        String date;
        date = new SimpleDateFormat("MM/dd/yyyy", Locale.getDefault()).format(new Date());
        dateTimeDisplay.setText("Check your plants for " + date);




        plantCalendar.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = month + 1 + "/" + dayOfMonth + "/" + year;
                System.out.println(date);
                dateTimeDisplay.setText("Check your plants for " + date);
            }
        });
    }

}