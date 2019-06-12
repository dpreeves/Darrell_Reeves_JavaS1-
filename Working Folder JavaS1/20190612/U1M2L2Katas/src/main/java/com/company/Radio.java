package com.company;

public class Radio {
    private String manufacturer;
    private String model;
    private int numSpeakers;
    private String station;
    private int volume;
    private boolean powered;

    public Radio(String mfgIn, String modelIn, int speakerIn, String stationIn, int volumeIn, boolean poweredIn){
        this.manufacturer = mfgIn;
        this.model = modelIn;
        this.numSpeakers = speakerIn;
        this.station = stationIn;
        this.volume = volumeIn;
        this.powered = poweredIn;
    }

    public boolean togglePower(){
        if (powered = true){
            return false;
        } else return true;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public String getModel(){
        return model;
    }

    public int getNumSpeakers(){
        return numSpeakers;
    }

    public String getStation(){
        return station;
    }

    public int getVolume(){
        return volume;
    }

    public boolean isPowered(){
        return powered;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void setNumSpeakers(int numSpeakers) {
        this.numSpeakers = numSpeakers;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPowered(boolean powered) {
        this.powered = powered;
    }
}
