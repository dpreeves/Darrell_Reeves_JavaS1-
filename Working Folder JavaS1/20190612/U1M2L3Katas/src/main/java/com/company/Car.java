package com.company;

public class Car {
    public static void main(String[] args) {}

//    public createCar(){
//        Car car = new Car("Honda", "Accord", "Sedan", "Blue", "2.6L V6", "CVT", 4, 31.1, 25218);
//        return car;
//        setMake("Honda");
//        setModel("Accord");
//        setType("Sedan");
//        setColor("Blue");
//        setEngine("2.6L V6");
//        setTransmission("CVT");
//        setNumDoors(4);
//        setMpg(31.7);
//        setMilesDriven(25218);

//    }


    private String make;
    private String model;
    private String type;
    private String color;
    private String engine;
    private String transmission;
    private int numDoors;
    private double mpg;
    private int milesDriven;

    public Car(String make, String model, String type, String color, String engine, String transmission, int numDoors, double mpg, int milesDriven) {
        this.make = make;
        this.model = model;
        this.type = type;
        this.color = color;
        this.engine = engine;
        this.transmission = transmission;
        this.numDoors = numDoors;
        this.mpg = mpg;
        this.milesDriven = milesDriven;
    }

    public void drive(int miles) {
        this.milesDriven += miles;
    }

    public void honk() {
        System.out.println("Honk Honk");
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public int getMilesDriven() {
        return milesDriven;
    }

    public void setMilesDriven(int milesDriven) {
        this.milesDriven = milesDriven;
    }
}
