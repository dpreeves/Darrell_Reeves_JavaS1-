package com.company;

public class Home {
    private int sqft;
    private int numWindows;
    private int numBathrooms;
    private int numBedrooms;
    private Basement basement;
    private Bathroom bathroom;
    private Kitchen kitchen;
    private Patio patio;

    public int getSqft() {
        return sqft;
    }

    public void setSqft(int sqft) {
        this.sqft = sqft;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    public int getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(int numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public Home(){

    }

    public int calculateArea(){
        return sqft;
    }

    public int countWindows(){
        return numWindows;
    }
}




