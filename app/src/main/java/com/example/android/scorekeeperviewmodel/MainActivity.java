package com.example.android.scorekeeperviewmodel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.arch.lifecycle.ViewModelProviders;
public class MainActivity extends AppCompatActivity {
    // setting up fields to manipulate textViews
    private TextView homeGoalsView;
    private TextView awayGoalsView;
    private TextView homeCornersView;
    private TextView awayCornersView;
    private TextView homeYellowsView;
    private TextView awayYellowsView;
    private TextView homeRedsView;
    private TextView awayRedsView;

    private ScoreViewModel scoreViewModel;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // creating ViewModel association
        scoreViewModel = ViewModelProviders.of(this).get(ScoreViewModel.class);

        setUpUi();
        refreshUi();


    }

    // method to update scores on all textViews
    private void updateScores(TextView textView) {
        textView.setText(String.valueOf(Integer.valueOf(textView.getText().toString()) + 1));
    }

    private void setUpUi(){
        // setting variables to later apply listener to buttons
        final Button homeCorner = findViewById(R.id.bttnHomeCorner);
        final Button awayCorner = findViewById(R.id.bttnAwayCorner);
        final Button homeYellow = findViewById(R.id.bttnHomeYellowCard);
        final Button awayYellow = findViewById(R.id.bttnAwayYellowCard);
        final Button homeRed = findViewById(R.id.bttnHomeRedCard);
        final Button awayRed = findViewById(R.id.bttnAwayRedCard);
        final Button homeGoal = findViewById(R.id.bttnHomeGoal);
        final Button awayGoal = findViewById(R.id.bttnAwayGoal);
        final Button resetBttn = findViewById(R.id.resetBttn);

        // initialising textView fields
        homeCornersView = findViewById(R.id.corner_home_text);
        awayCornersView = findViewById(R.id.corner_away_text);
        homeYellowsView = findViewById(R.id.yellow_card_home_text);
        awayYellowsView = findViewById(R.id.yellow_card_away_text);
        homeRedsView = findViewById(R.id.red_card_home_text);
        awayRedsView = findViewById(R.id.red_card_away_text);
        homeGoalsView = findViewById(R.id.homeTeamScoreTextView);
        awayGoalsView = findViewById(R.id.awayTeamScoreTextView);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            // sorting method to identify button clicked and apply new score to relevant textView
            // also to deal with reset button click
            public void onClick(View view) {
                if (view.getId() == homeCorner.getId()) {
                    scoreViewModel.setHomeCorners(scoreViewModel.getHomeCorners() + 1);
                    refreshUi();
                } else if (view.getId() == homeYellow.getId()) {
                    scoreViewModel.setHomeYellows(scoreViewModel.getHomeYellows() + 1);

                    refreshUi();
                } else if (view.getId() == homeRed.getId()) {

                    scoreViewModel.setHomeReds(scoreViewModel.getHomeReds() + 1);
                    refreshUi();
                } else if (view.getId() == homeGoal.getId()) {
                    scoreViewModel.setHomeGoals(scoreViewModel.getHomeGoals() + 1);
                    refreshUi();
                } else if (view.getId() == awayCorner.getId()) {
                    scoreViewModel.setAwayCorners(scoreViewModel.getAwayCorners() + 1);
                    refreshUi();

                } else if (view.getId() == awayYellow.getId()) {
                    scoreViewModel.setAwayYellows(scoreViewModel.getAwayYellows() + 1);
                    refreshUi();
                } else if (view.getId() == awayRed.getId()) {
                    scoreViewModel.setAwayReds(scoreViewModel.getAwayReds() + 1);
                    refreshUi();

                } else if (view.getId() == awayGoal.getId()) {
                    scoreViewModel.setAwayGoals(scoreViewModel.getAwayGoals() + 1);
                    refreshUi();


                } else {
                   scoreViewModel.setAlltoZero();
                   refreshUi();
                }
            }
        };
        // applying listener to all buttons
        resetBttn.setOnClickListener(listener);
        homeCorner.setOnClickListener(listener);
        awayCorner.setOnClickListener(listener);
        homeYellow.setOnClickListener(listener);
        awayYellow.setOnClickListener(listener);
        homeRed.setOnClickListener(listener);
        awayRed.setOnClickListener(listener);
        homeGoal.setOnClickListener(listener);
        awayGoal.setOnClickListener(listener);


    }
    public void refreshUi(){
        homeCornersView.setText(String.valueOf(scoreViewModel.getHomeCorners()));
        awayCornersView.setText(String.valueOf(scoreViewModel.getAwayCorners()));
        homeYellowsView.setText(String.valueOf(scoreViewModel.getHomeYellows()));
        awayYellowsView.setText(String.valueOf(scoreViewModel.getAwayYellows()));
        homeRedsView.setText(String.valueOf(scoreViewModel.getHomeReds()));
        awayRedsView.setText(String.valueOf(scoreViewModel.getAwayReds()));
        homeGoalsView.setText(String.valueOf(scoreViewModel.getHomeGoals()));
        awayGoalsView.setText(String.valueOf(scoreViewModel.getAwayGoals()));

    }

}
