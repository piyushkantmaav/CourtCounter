package com.example.hppc.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    public void incrementBy3ForA(View view){
        scoreTeamA  = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);

    }
    public void incrementBy2ForA(View view){
        scoreTeamA = scoreTeamA +2;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowForA(View view){
        scoreTeamA  = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score){
        TextView scoreView = (TextView)findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score){
        TextView scoreView  = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void incrementBy3ForB(View view) {
        scoreTeamB  = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void incrementBy2ForB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowForB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);
        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }
}
