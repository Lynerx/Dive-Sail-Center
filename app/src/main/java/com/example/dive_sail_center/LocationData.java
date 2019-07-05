package com.example.dive_sail_center;

public class LocationData {

    public double latitude;
    public double longitude;
    public String name;
    public String level;


    public LocationData(){

    }

    public LocationData(String name, String level, double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.level = level;
    }


//    public String getName() {
//        return name;
//    }
//    public void setName (String name) {
//        this.name = name;
//    }

//    public String getLevel() {
//        return level;
//    }
//    public void setLevel (String level) {
//        this.level = level;
//    }
//    public double getLongitude() {
//        return longitude;
//    }
//
//    public void setLongitude(double longitude) {
//        this.longitude = longitude;
//    }
//
//    public double getLatitude() {
//        return latitude;
//    }
//
//    public void setLatitude(double latitude) {
//        this.latitude = latitude;
//    }
}
