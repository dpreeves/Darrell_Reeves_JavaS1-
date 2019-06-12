package com.company;

public class Car {
    private String make;
    private String model;
    private String type;
    private String color;
    private String engine;
    private String transmission;
    private int numDoors;
    private double mpg;
    private int milesDriven;

    public Car(String makeIn, String modelIn, String typeIn, String colorIn, String enginIn, String transmissionIn, int numDoorsIn, double mpgIn, int milesDrivenIn) {
        this.make = makeIn;
        this.model = modelIn;
        this.type = typeIn;
        this.color = colorIn;
        this.engine = enginIn;
        this.transmission = transmissionIn;
        this.numDoors = numDoorsIn;
        this.mpg = mpgIn;
        this.milesDriven = milesDrivenIn;
    }

    public String getMake(){
        return make;
    }

    public String getModel() { return model; }

    public String getType() { return type; }

    public String getColor() { return color; }

    public String getEngine() { return  engine; }

    public String getTransmission() { return transmission; }

    public int getNumDoors() { return numDoors; }

    public double getMpg() { return  mpg; }

    public int getMilesDriven() { return milesDriven; }

}
