package com.company;

public class Basement extends Home{
    private int sqft;
    private boolean isFinished;
    private String flooringType;

    public Basement(){

    }

    public int calculateArea(){
        return sqft;
    }

    public int countWindows(){
        return 0;
    }

    public int getSqft() {
        return sqft;
    }

    public void setSqft(int sqft) {
        this.sqft = sqft;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }

    public String getFlooringType() {
        return flooringType;
    }

    public void setFlooringType(String flooringType) {
        this.flooringType = flooringType;
    }
}
