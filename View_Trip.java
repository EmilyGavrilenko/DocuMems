package com.example.documems;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Arrays;
import java.util.List;


public class View_Trip extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        Trip goal = Store_Trips.storeTrips.get(Store_Trips.i);

        setContentView(R.layout.activity_view__trip);
        TextView textViewName = findViewById(R.id.displayName);
        textViewName.setText(goal.getName());
        TextView textViewTravelers = findViewById(R.id.displayTravelers);
        textViewTravelers.setText(goal.getTravelers());
        TextView textViewDates = findViewById(R.id.displayDates);
        textViewDates.setText(goal.getDates());
        TextView textViewDays = findViewById(R.id.displayNumDays);
        textViewDays.setText(goal.getNum_days_String());
        TextView textViewMemo = findViewById(R.id.displayMemo);
        textViewMemo.setText(goal.getMemo());


        Button home_button = (Button)findViewById(R.id.home_button);
        home_button.setOnClickListener(new View.OnClickListener() {

            @Override
            //currently creates a new database with each "click to begin"
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(),Home.class);
                startActivity(startIntent);
            }
        });

        //Store_Trips str = new Store_Trips();
        //Trip trip = str.getTrip(#);
        //String name = trip.getName();
    }

    /* public void add_Trip(Trip trip) {
        int i = 0;
        while (storeTrips.get(i) != null) {
            i++;
        }
        storeTrips.set(i, trip);
    }*/

   // public int getTripNumber (Trip tripNumber){
     //   return tripNumber;
    }


//Store_Trips needs to return the number of the trip that it adds so that we can access its information after creating a new trip
//Home nees to reutrn the number of the trip that it wants to access
//these can be passed to view_Trip so that we display the right one
