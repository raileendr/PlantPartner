package com.ksing.plantpartner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    public Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Creates Login Button to direct to Login Page
        //button = (Button) findViewById(R.id.loginButton);
        //button.setOnClickListener(new View.OnClickListener() {

            //Opens Login Page
           // @Override
            //public void onClick(View v) {
              //Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                //startActivity(intent);
            //}
        //});

        // Creates Button to direct to Quiz
        Button quizBtn = findViewById(R.id.quizButton);
        quizBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                openQuizActivity();
            }
        });
    }

    // Opens the Quiz Activity
    public void openQuizActivity(){
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }


}