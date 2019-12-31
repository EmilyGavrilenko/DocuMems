package com.example.documems;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

//import java.util.ArrayList;
//import java.util.List;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {
    //List<Trip> storedTrips = new ArrayList<Trip>();
    //Store_Trips st;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button click_to_start_button = (Button)findViewById(R.id.click_to_start_button);
        click_to_start_button.setOnClickListener(new View.OnClickListener() {

            @Override
            //currently creates a new database with each "click to begin"
            public void onClick(View v) {
                Intent startIntent = new Intent (getApplicationContext(),Home.class);
                startActivity(startIntent);
            }
        });


   // }public void create_Store_Trips(){
   //         st = new Store_Trips();
   // }

    //public void add_Trip(Trip trip){
            //st.newTrip(trip);
    }

}
