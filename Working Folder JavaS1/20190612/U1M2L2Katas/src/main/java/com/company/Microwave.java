package com.company;

public class Microwave {
    private String manufacturer;
    private String model;
    private int secondsLeft;
    private String time;
    private boolean running;

    public Microwave(String mfgIn, String modelIn, int secondLeftIn, String timeIn, boolean runningIn) {
        this.manufacturer = mfgIn;
        this.model = modelIn;
        this.secondsLeft = secondLeftIn;
        this.time = timeIn;
        this.running = runningIn;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public String getModel(){
        return model;
    }

    public int getSecondsLeft(){
        return secondsLeft;
    }

    public String getTime(){
        return time;
    }

    public boolean isRunning(){
        return running;
    }
}
