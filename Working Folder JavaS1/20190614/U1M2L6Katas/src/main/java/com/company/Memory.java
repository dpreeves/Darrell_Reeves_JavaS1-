package com.company;

public class Memory extends Laptop {
    private int storage;
    private String manufacturer;

    public boolean store() {
        return true;
    }

    public Memory() {
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}



