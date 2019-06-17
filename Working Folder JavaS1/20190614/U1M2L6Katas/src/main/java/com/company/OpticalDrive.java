package com.company;

public class OpticalDrive extends Laptop{
    private boolean canWrite;
    private double speed;

    public OpticalDrive(){

    }

    public boolean isCanWrite() {
        return canWrite;
    }

    public void setCanWrite(boolean canWrite) {
        this.canWrite = canWrite;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
