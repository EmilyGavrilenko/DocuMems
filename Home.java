package com.example.documems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button trip1_button = (Button)findViewById(R.id.trip1_button);
        trip1_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Store_Trips.setI(0);
                Intent startIntent = new Intent (getApplicationContext(),View_Trip.class);
                startActivity(startIntent);
            }
        });

        Button trip2_button = (Button)findViewById(R.id.trip2_button);
        trip2_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Store_Trips.setI(1);
                Intent startIntent = new Intent (getApplicationContext(),View_Trip.class);
                startActivity(startIntent);
            }
        });

        Button trip3_button = (Button)findViewById(R.id.trip3_button);
        trip3_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Store_Trips.setI(2);
                Intent startIntent = new Intent (getApplicationContext(),View_Trip.class);
                startActivity(startIntent);

            }
        });

        Button trip4_button = (Button)findViewById(R.id.trip4_button);
        trip4_button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Store_Trips.setI(3);
                Intent startIntent = new Intent (getApplicationContext(),View_Trip.class);
                startActivity(startIntent);

            }
        });





        Button create_new_trip = (Button)findViewById(R.id.create_new_trip);
        create_new_trip.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(),Create_New_Trip.class);
                startActivity(startIntent);
            }
        });
    }
}
