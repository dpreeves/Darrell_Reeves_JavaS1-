package com.company;

public class Processor extends Laptop {
    private double speed;
    private int cores;

    public boolean compute(){
        return true;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }
}
