package edu.asu.stopwatch;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class StopWatchActivity extends AppCompatActivity {
    private int seconds = 0;
    private boolean running;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);
    }

    //Start the stopwatch running when the start button is clicked
    public void onClickStart(View view){
        running = true;
    }

    //Stop the stopwatch running when the stop button is clicked
    public void onClickStop(View view){
        running = false;
    }

    

}
