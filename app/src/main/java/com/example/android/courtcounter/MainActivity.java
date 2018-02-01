package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    static int teamAScore=0;
    static int teamBScore=0;

    public void displayForATeam(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreePoints(View v){
        teamAScore+=3;
        displayForATeam(teamAScore);
    }
    public void addTwoPoints(View v){
        teamAScore+=2;
        displayForATeam(teamAScore);
    }
    public void addOnePoint(View v){
        teamAScore+=1;
        displayForATeam(teamAScore);
    }

    public void displayForBTeam(int score){
        TextView scoreView= (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void addThreePointsB(View v){
        teamBScore+=3;
        displayForBTeam(teamBScore);
    }
    public void addTwoPointsB(View v){
        teamBScore+=2;
        displayForBTeam(teamBScore);
    }
    public void addOnePointB(View v){
        teamBScore+=1;
        displayForBTeam(teamBScore);
    }
    public void resetScore(View v){
        teamAScore=0;
        teamBScore=0;
        displayForATeam(teamAScore);
        displayForBTeam(teamBScore);
    }
}
