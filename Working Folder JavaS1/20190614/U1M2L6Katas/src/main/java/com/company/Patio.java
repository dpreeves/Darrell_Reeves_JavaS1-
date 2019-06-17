package com.company;

public class Patio {
    private int sqft;
    private boolean hasGrill;
    private String flooringType;

    public Patio(){

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

    public boolean isHasGrill() {
        return hasGrill;
    }

    public void setHasGrill(boolean hasGrill) {
        this.hasGrill = hasGrill;
    }

    public String getFlooringType() {
        return flooringType;
    }

    public void setFlooringType(String flooringType) {
        this.flooringType = flooringType;
    }
}
