package com.company;

public class Store {
    private String name;
    private String location;
    private int inventory;

    private Chips chips;
    private SodaPop sodaPop;
    private Chocolate chocolate;


    public Store(){

    }

    public boolean sellFood(){
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
