package com.example.deepa.courtcounterapp;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    int TryA=0;
    int PKA=0;
    int CKA=0;
    int TryB=0;
    int PKB=0;
    int CKB=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    /**
     * Increase the score for Team A by 5 points and try score by 1 point.
     */

    public void addFiveForTeamA(View v){
        scoreTeamA=scoreTeamA+5;
        TryA=TryA+1;
        displayTryAScore(TryA);
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 3 points and conversion Kick  score by 1 point..
     */

    public void addThreeForTeamA(View v){
        scoreTeamA=scoreTeamA+3;
        CKA=CKA+1;
        displayCkAScore(CKA);
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Team A by 2 points and Penalty Kick score by 1 point..
     */

    public void addTwoForTeamA(View v){
        scoreTeamA=scoreTeamA+2;
        PKA=PKA+1;
        displayPkAScore(PKA);
        displayForTeamA(scoreTeamA);
    }



    /**
     * Increase the score for Team B by 5 points and try score by 1 point.
     */

    public void addFiveForTeamB(View v){
        scoreTeamB=scoreTeamB+5;
        TryB=TryB+1;
        displayTryBScore(TryB);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 3 points and conversion Kick  score by 1 point.
     */

    public void addThreeForTeamB(View v){

        scoreTeamB=scoreTeamB+3;
        CKB=CKB+1;
        displayCkBScore(CKB);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Team B by 2 points and Penalty Kick score by 1 point.
     */

    public void addTwoForTeamB(View v){
        scoreTeamB=scoreTeamB+2;
        PKB=PKB+1;
        displayPkBScore(PKB);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Resets the given score for Team A and B.
     */
    public void resetTheScores(View V){
        scoreTeamA=0;
        scoreTeamB=0;
        TryA=0;
        TryB=0;
        CKA=0;
        CKB=0;
        PKA=0;
        PKB=0;
        displayTryAScore(TryA);
        displayCkAScore(CKA);
        displayPkAScore(PKA);
        displayTryBScore(TryB);
        displayCkBScore(CKB);
        displayPkBScore(PKB);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the Try score for Team A.
     */
    public void displayTryAScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.tryAscore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the CK score for Team A.
     */
    public void displayCkAScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ckAscore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the PK score for Team A.
     */
    public void displayPkAScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PKAscore);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Displays the Try score for Team B.
     */
    public void displayTryBScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.tryBscore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the CK score for Team B.
     */
    public void displayCkBScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.ckBscore);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the PK score for Team B.
     */
    public void displayPkBScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.PKBscore);
        scoreView.setText(String.valueOf(score));
    }
}
