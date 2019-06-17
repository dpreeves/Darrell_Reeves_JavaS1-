package com.company;

public class Laptop {
    private String manufacturer;
    private String model;
    private String color;
    private Processor processor;
    private Memory memory;
    private Laptop laptop;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Laptop(){

    }

    public int runProgram(){
        return 1;
    }

    public boolean retriveFile(){
        return true;
    }
}
