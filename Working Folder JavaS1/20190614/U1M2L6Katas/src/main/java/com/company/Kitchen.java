package com.company;

public class Kitchen {
    private int sqft;
    private boolean hasDishwasher;
    private String flooringType;

    public Kitchen(){

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

    public boolean isHasDishwasher() {
        return hasDishwasher;
    }

    public void setHasDishwasher(boolean hasDishwasher) {
        this.hasDishwasher = hasDishwasher;
    }

    public String getFlooringType() {
        return flooringType;
    }

    public void setFlooringType(String flooringType) {
        this.flooringType = flooringType;
    }
}
