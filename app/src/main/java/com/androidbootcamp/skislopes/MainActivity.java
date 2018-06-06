package com.androidbootcamp.skislopes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;

//This activity is the main page of the application.
//This page gives the user options as to which ski resort the would like to find information about
//Select the option in the spinner list
//After the button is pressed the resultActivity is started

public class MainActivity extends AppCompatActivity {
    //String is used to get and store the selection in the spinner list.
    static String groupChoice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //the id of the button btnRide is stored in a button variable
        //setting a click listener event for when the the button is pressed
        Button ride = (Button) findViewById(R.id.btnRide);
        ride.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendMessage(view);
            }
        });
    }

    public void sendMessage(View view){
        //The values in the txtGroup are displayed in the spinner named spinner group
        //the selected option by the user is found and the result activity is started
        //The message is saved in the intent and will be used in the result activity
        final Spinner group = (Spinner)findViewById(R.id.txtGroup);
        Intent intent = new Intent(this, resultActivity.class);
        groupChoice = group.getSelectedItem().toString();
        intent.putExtra("groupChoice", groupChoice);
        startActivity(intent);

    }
}
