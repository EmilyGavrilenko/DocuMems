package com.example.documems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Create_New_Trip extends AppCompatActivity {

    Trip trip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create__new__trip);

        Button create_trip_button = (Button) findViewById(R.id.create_trip_button);
        create_trip_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                EditText name_of_trip = (EditText) findViewById(R.id.displayName);
                String name = name_of_trip.getText().toString();

                EditText people_traveling = (EditText) findViewById(R.id.displayTravelers);
                String travelers = people_traveling.getText().toString();

                EditText trip_dates = (EditText) findViewById(R.id.displayDates);
                String dates = trip_dates.getText().toString();

                EditText num_of_days = (EditText) findViewById(R.id.displayNumDays);
                String num_days = num_of_days.getText().toString();
                int days = Integer.parseInt(num_days);

                EditText trip_memo = (EditText) findViewById(R.id.displayMemo);
                String memo = trip_memo.getText().toString();

                //trip = new Trip(name, travelers, dates, days, memo);

                Store_Trips.storeTrips.add(new Trip(name, travelers,dates,days,memo));
                Store_Trips.setI(Store_Trips.lengt);
                Store_Trips.setLengt();


                //create trip and pass parameters
                Intent startIntent = new Intent(getApplicationContext(), View_Trip.class);
                startActivity(startIntent);
            }
        });




    }

}
