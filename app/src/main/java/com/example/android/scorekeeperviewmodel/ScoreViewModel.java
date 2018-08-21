package com.example.android.scorekeeperviewmodel;

import android.arch.lifecycle.ViewModel;

public class ScoreViewModel extends ViewModel {

    // Tracks the score for Team A
    private int homeGoals = 0;
    private int homeCorners = 0;
    private int homeYellows = 0;
    private int homeReds = 0;

    // Tracks the score for Team B
    private int awayGoals = 0;
    private int awayCorners = 0;
    private int awayYellows = 0;
    private int awayReds = 0;


    public void setAlltoZero() {
        homeGoals = 0;
        homeCorners = 0;
        homeYellows = 0;
        homeReds = 0;
        awayGoals = 0;
        awayCorners = 0;
        awayYellows = 0;
        awayReds = 0;
    }


    public int getHomeGoals() {
        return homeGoals;
    }

    public void setHomeGoals(int homeGoals) {
        this.homeGoals = homeGoals;
    }

    public int getHomeCorners() {
        return homeCorners;
    }

    public void setHomeCorners(int homeCorners) {
        this.homeCorners = homeCorners;
    }

    public int getHomeYellows() {
        return homeYellows;
    }

    public void setHomeYellows(int homeYellows) {
        this.homeYellows = homeYellows;
    }

    public int getHomeReds() {
        return homeReds;
    }

    public void setHomeReds(int homeReds) {
        this.homeReds = homeReds;
    }

    public int getAwayGoals() {
        return awayGoals;
    }

    public void setAwayGoals(int awayGoals) {
        this.awayGoals = awayGoals;
    }

    public int getAwayCorners() {
        return awayCorners;
    }

    public void setAwayCorners(int awayCorners) {
        this.awayCorners = awayCorners;
    }

    public int getAwayYellows() {
        return awayYellows;
    }

    public void setAwayYellows(int awayYellows) {
        this.awayYellows = awayYellows;
    }

    public int getAwayReds() {
        return awayReds;
    }

    public void setAwayReds(int awayReds) {
        this.awayReds = awayReds;
    }
}
