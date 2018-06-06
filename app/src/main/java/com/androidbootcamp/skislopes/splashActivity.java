package com.androidbootcamp.skislopes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;


//This is a splash activity and the timer is set for five seconds
//The main activity starts after the timer runs out
public class splashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        TimerTask task = new TimerTask()
        {
            @Override
            public void run() {
                finish();
                startActivity(new Intent(splashActivity.this, MainActivity.class));
            }
        };

        Timer opening = new Timer();
        opening.schedule(task, 5000);
    }
}
