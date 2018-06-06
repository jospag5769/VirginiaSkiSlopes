package com.androidbootcamp.skislopes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

//This activity is the result of the pressing the button on the main activity
//The data is displayed based on the message received from the main activity
//the message identifies the selected option of the spinner list

public class resultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //The message received from the main activity is used to determine which data is displayed
        //The message is the name of the ski resort
        Intent intent = getIntent();
        String message = intent.getStringExtra("groupChoice");
        TextView textview = findViewById(R.id.txtView);
        textview.setText(message);

        //declarations of the variables used in the this activity
        //each variable signifies an object on the result page
        //the data in the variables vary based on the message (name of ski resort)
        TextView txtSeason = findViewById(R.id.txtSeason);
        TextView txtTrails = findViewById(R.id.txtTrails);
        TextView txtLifts = findViewById(R.id.txtLifts);
        TextView txtLodging = findViewById(R.id.txtLodging);
        TextView txtAddress = findViewById(R.id.txtAddress);
        TextView txtSSCost = findViewById(R.id.txtSSCost);
        TextView txtBib = findViewById(R.id.txtBib);
        TextView txtHelmet  = findViewById(R.id.txtHelmet);
        ImageView imgLocation = findViewById(R.id.imgLocation);

        //This switch determines the information that is displayed
        //each case has its own data
        switch(message) {
            case "Bryce Resort":
                txtSeason.setText("12/16 - 3/25");
                txtTrails.setText("Circle, Square, Black Diamond");
                txtLifts.setText("7");
                txtLodging.setText("Yes");
                txtAddress.setText("1982 Fairway Drive Basye, VA 22810");
                txtSSCost.setText("$35.00");
                txtBib.setText("N/A");
                txtHelmet.setText("$10.00");
                imgLocation.setImageResource(R.drawable.bryce);
                break;
            case "Massanutten":
                txtSeason.setText("12/15 - 3/18");
                txtTrails.setText("Circle, Square, Black Diamond");
                txtLifts.setText("8");
                txtLodging.setText("Yes");
                txtAddress.setText("1822 Resort Drive Massanutten, VA 22840");
                txtSSCost.setText("$36.00");
                txtBib.setText("N/A");
                txtHelmet.setText("$12.00");
                imgLocation.setImageResource(R.drawable.mass);
                break;
            case "The Homestead Ski Area":
                txtSeason.setText("12/22 - 3/10");
                txtTrails.setText("Circle, Square, Double Black Diamond");
                txtLifts.setText("2");
                txtLodging.setText("Yes");
                txtAddress.setText("7696 Sam Snead Highway Hot Springs, VA 24445");
                txtSSCost.setText("From $57.99");
                txtBib.setText("$15.00");
                txtHelmet.setText("$10.00");
                imgLocation.setImageResource(R.drawable.homestead);
                break;
            case "Wintergreen Resort":
                txtSeason.setText("12/15 - 3/18");
                txtTrails.setText("Circle, Square, Black diamond");
                txtLifts.setText("5");
                txtLodging.setText("Yes");
                txtAddress.setText("Route 664 Wintergreen, VA 22958");
                txtSSCost.setText("$39.00");
                txtBib.setText("N/A");
                txtHelmet.setText("$10.00");
                imgLocation.setImageResource(R.drawable.winter);
                break;
        }
    }
}
