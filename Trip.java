package com.example.documems;

public class Trip {

    private String name;
    private String travelers;
    private String dates;
    private int num_days;
    private String memo;

    public Trip(String Name, String Travelers, String Dates, int Num_days, String Memo) {
        name = Name;
        travelers = Travelers;
        dates = Dates;
        num_days = Num_days;
        memo = Memo;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void setTravelers(String newTravelers) {
        travelers = newTravelers;
    }

    public void setDates(String newDates) {
        dates = newDates;
    }

    public void setNum_days(int newNum_days) {
        num_days = newNum_days;
    }

    public void setMemo(String newMemo) {
        memo = newMemo;
    }

    public String getName() {
        return name;
    }

    public String getTravelers() {
        return travelers;
    }

    public String getDates() {
        return dates ;
    }

    public int getNum_days() {
        return num_days;
    }

    public String getNum_days_String(){
        return "" +num_days;
    }

    public String getMemo() {
        return memo;
    }



}
