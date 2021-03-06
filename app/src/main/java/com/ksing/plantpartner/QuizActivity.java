package com.ksing.plantpartner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.*;

public class QuizActivity extends AppCompatActivity {

    // Quiz Questions
    public String Questions[] = {
            "What plant size do you prefer?",
            "How strong is the lighting?",
            "How much time a week do you want to dedicate to plant care?",
            "What is your preferred watering schedule?"
    };

    // Quiz Choices
    public String Choices[][] = {
            {"Small", "Medium", "Large"},
            {"Little", "Moderate", "A lot"},
            {"Little", "A good amount", "All my free time"},
            {"Daily", "Weekly", "Monthly"}
    };

    // User's answers
    public List<String> answers = new ArrayList<String>();


    int questionNum = 0;
    int progressNum = 0;
    ProgressBar pb;
    Button quizAnswer1, quizAnswer2, quizAnswer3;
    TextView question;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        // prog() controlls the progress bar
        prog();

        question = (TextView) findViewById(R.id.quizText);
        // Initializes the first question
        question.setText(Questions[0]);

        // Answer button IDs
        quizAnswer1 = (Button)findViewById(R.id.answer1);
        quizAnswer2 = (Button)findViewById(R.id.answer2);
        quizAnswer3 = (Button)findViewById(R.id.answer3);

        // Initialize answer choices
        quizAnswer1.setText(Choices[0][0]);
        quizAnswer2.setText(Choices[0][1]);
        quizAnswer3.setText(Choices[0][2]);

        // OnClickListeners will call the updateQuestion method
        quizAnswer1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(questionNum == 3){
                    quizOver();
                }
                else{
                    questionNum += 1;
                    progressNum += 25;
                    updateQuestion(questionNum);
                    answers.add(quizAnswer1.getText().toString());
                    prog();
                }
            }
        });

        // OnClickListeners will call the updateQuestion method
        quizAnswer2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(questionNum == 3){
                    quizOver();
                }
                else{
                    questionNum += 1;
                    progressNum += 25;
                    updateQuestion(questionNum);
                    answers.add(quizAnswer2.getText().toString());
                    prog();
                }

            }
        });

        // OnClickListeners will call the updateQuestion method
        quizAnswer3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                if(questionNum == 3){
                    quizOver();
                }
                else{
                    questionNum += 1;
                    progressNum += 25;
                    updateQuestion(questionNum);
                    answers.add(quizAnswer3.getText().toString());
                    prog();
                }
            }
        });


    }

    // Sets the progress on the progress bar
    public void prog(){
        pb = (ProgressBar) findViewById(R.id.progressBar2);
        pb.setProgress(progressNum);
    }

    // Changes the next question and answer choices
    public void updateQuestion(int questionNum){
        TextView question = findViewById(R.id.quizText);
        question.setText(Questions[questionNum]);

        quizAnswer1.setText(Choices[questionNum][0]);
        quizAnswer2.setText(Choices[questionNum][1]);
        quizAnswer3.setText(Choices[questionNum][2]);

    }

    // When the quiz is over, it will move on to the next activity -> PlantActivity
    public void quizOver(){
        Intent intent = new Intent(this, PlantActivity.class);
        startActivity(intent);
    }

}