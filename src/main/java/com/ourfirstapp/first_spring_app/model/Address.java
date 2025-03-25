package com.ourfirstapp.first_spring_app.model;

public class Address {
    private String city;
    private String place;
    private int pincode;

    public String getCity(){
        return city;
    }

    public void setCity(String city){
        this.city=city;
    }

    public String getPlace(){
        return place;
    }

    public void setPlace(String place){
        this.place=place;
    }

    public int getPincode(){
        return pincode;
    }

    public void setPincode(int pincode){
        this.pincode=pincode;
    }

    //Constructor Injection- defining values to the instance variables using Constructor.

    public Address() {
    }

    public Address(String city, String place, int pincode){
        this.city=city;
        this.place=place;
        this.pincode=pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", place='" + place + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}

