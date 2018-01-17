package com.grow_with_google.udacity.courtcounter;



import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {


    int finalScoreA = 0; //final score for team a
    int finalScoreB = 0; //final scroe for team b

    private TextView finalScoreTeamA;
    private TextView finalScoreTeamB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
        finalScoreTeamA = (TextView) findViewById(R.id.finalScoreTeamA);
        finalScoreTeamB = (TextView) findViewById(R.id.finalScoreTeamB);


    }


    /**
     * These methods are called when the - buttons are clicked.
     *
     * Minus buttons are on the score keeper in case the wrong points
     * are given to the wrong team or the wrong amount of points are given so an adjustment
     * needsto be made.
     *
     */


    //free throws

    public void decrementA1(View view) {

        finalScoreA = finalScoreA - 1;

        finalScoreTeamA.setText(String.valueOf(finalScoreA));


    }

    public void decrementB1(View view) {

        finalScoreB = finalScoreB - 1;

        finalScoreTeamB.setText(String.valueOf(finalScoreB));


    }

    //2 pointers

    public void decrementA2(View view) {

        finalScoreA = finalScoreA - 2;

        finalScoreTeamA.setText(String.valueOf(finalScoreA));
    }

    public void decrementB2(View view) {


        finalScoreB = finalScoreB - 2;

        finalScoreTeamB.setText(String.valueOf(finalScoreB));

    }

    //3 pointers

    public void decrementA3(View view) {

        finalScoreA = finalScoreA - 3;

        finalScoreTeamA.setText(String.valueOf(finalScoreA));
    }

    public void decrementB3(View view) {

        finalScoreB = finalScoreB - 3;

        finalScoreTeamB.setText(String.valueOf(finalScoreB));
    }

    /**
     * These methods are called when the + buttons are clicked.
     */

    //free throws

    public void incrementA1(View view) {

        finalScoreA = finalScoreA + 1;

        finalScoreTeamA.setText(String.valueOf(finalScoreA));


    }

    public void incrementB1(View view) {

        finalScoreB = finalScoreB + 1;

        finalScoreTeamB.setText(String.valueOf(finalScoreB));


    }

    //2 pointers

    public void incrementA2(View view) {

        finalScoreA = finalScoreA + 2;

        finalScoreTeamA.setText(String.valueOf(finalScoreA));
    }

    public void incrementB2(View view) {


        finalScoreB = finalScoreB + 2;

        finalScoreTeamB.setText(String.valueOf(finalScoreB));

    }

    //3 pointers

    public void incrementA3(View view) {

        finalScoreA = finalScoreA + 3;

        finalScoreTeamA.setText(String.valueOf(finalScoreA));
    }

    public void incrementB3(View view) {

        finalScoreB = finalScoreB + 3;

        finalScoreTeamB.setText(String.valueOf(finalScoreB));
    }

    //called when the end game button is clicked

    public void endgame(View view) {

        finalScoreA = 0;
        finalScoreB = 0;

        finalScoreTeamA.setText(String.valueOf(finalScoreA));
        finalScoreTeamB.setText(String.valueOf(finalScoreB));


    }


}