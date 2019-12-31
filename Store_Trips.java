package com.example.documems;

//import java.util.ArrayList;
//import java.util.List;
import android.content.ContentValues;
import android.content.Context;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Store_Trips{

     public static ArrayList<Trip> storeTrips = new ArrayList<>();

     public static int i ;

     public static int lengt = 0;

     public static void setI (int num){
          i = num;
     }

     public static void setLengt (){
          lengt++;
     }


}

/* public class Store_Trips extends SQLiteOpenHelper {
    List<Trip> documentedTrips;

    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "MY_TRIPS";
    public static final String TABLE_TRIPS = "trips";
    public static final String COLUMN_TRIP_NUMBER = "trip_number";
    public static final String COLUMN_TRIP_NAME = "trip_name";
    public static final String COLUMN_TRIP_TRAVELERS = "trip_travelers";
    public static final String COLUMN_TRIP_DATES = "trip_dates";
    public static final int COLUMN_TRIP_DAYS = 0; //not sure if this will be written over?
    public static final String COLUMN_TRIP_MEMO = "trip_memo";


    //stores information about the table (Database)
    public Store_Trips(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {

        super (context, DATABASE_NAME, factory, DATABASE_VERSION);

        //documentedTrips = new ArrayList<Trip>();
        //Trip maui = new Trip("Maui", "Gavrilenkos","Spring Break",9,"Super fun");
        //documentedTrips.add(0,maui);
    }

    @Override

    public void onCreate (SQLiteDatabase db) {
        String query = "Create Table " + TABLE_TRIPS + "(" +
                COLUMN_TRIP_NUMBER + "INTEGER PRIMARY KEY AUTOINCREMENT " +
                COLUMN_TRIP_NAME + "TEXT" +
                COLUMN_TRIP_TRAVELERS + "TEXT" +
                COLUMN_TRIP_DATES + "TEXT" +
                COLUMN_TRIP_DAYS + "INTEGER" + //not sure if this is right
                COLUMN_TRIP_MEMO + "TEXT" +
                ");";
        db.execSQL(query);


    }

    @Override
    public void onUpgrade (SQLiteDatabase db, int oldVersion, int newVersion){
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TRIPS);
        onCreate(db);

    }

    //add row to the database
    public void addTripToDatabase(Trip trip) {
           ContentValues values = new ContentValues();
           values.put(COLUMN_TRIP_NAME, trip.getName()) ;
           SQLiteDatabase db = getWritableDatabase();
           db.insert(TABLE_TRIPS,null,values);
           db.close();
    }

    //delete a product from the datablase


    //print out the database as a string
    public String databaseToString() {
         String dbString = "";
         SQLiteDatabase db = getWritableDatabase();
         String query = "SELECT * FROM " + TABLE_TRIPS + " WHERE 1"; //selects every column and row

        //cursor points to a location in the results
        Cursor c = db.rawQuery(query,null);
        //move it to the first row
        c.moveToFirst();

        while (!c.isAfterLast()){
            if(c.getString(c.getColumnIndex("MY_TRIPS")) != null) {
                dbString += c.getString(c.getColumnIndex("MY_TRIPS"));
                dbString += "\n";
            }
         }
         db.close();
        return dbString;
        
    }
    */
