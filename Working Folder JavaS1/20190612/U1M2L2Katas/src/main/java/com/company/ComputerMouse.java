package com.company;

public class ComputerMouse {
    private String manufacturer;
    private String model;
    private int xPosition;
    private int yPosition;
    private int[] lastClickedLocation;

    public ComputerMouse(String mfgIn, String modelIn, int xPositionIn, int yPositionIn, int[] lastClickedLocationIn) {
        this.manufacturer = mfgIn;
        this.model = modelIn;
        this.xPosition = xPositionIn;
        this.yPosition = yPositionIn;
        this.lastClickedLocation = lastClickedLocationIn;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public String getModel(){
        return model;
    }

    public int getxPosition(){
        return xPosition;
    }

    public int getyPosition(){
        return yPosition;
    }

    public int[] getLastClickedLocation(){
        return lastClickedLocation;
    }

    public void move(int deltaX,int deltaY){
        this.xPosition += deltaX;
        this.yPosition += deltaY;
    }

    public void click(){
        this.lastClickedLocation[0] = xPosition;
        this.lastClickedLocation[1] = yPosition;
    }
}
