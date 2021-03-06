package com.ksing.plantpartner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


import android.widget.Toast;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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