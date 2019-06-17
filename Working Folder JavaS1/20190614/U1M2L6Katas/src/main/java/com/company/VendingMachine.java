package com.company;

public class VendingMachine {
    private int inventory;
    private String options;
    private String name;

    private Chips chips;
    private SodaPop sodaPop;
    private Chocolate chocolate;
    private Popcorn popcorn;
    private Mints mints;
    private Gum gum;

    public VendingMachine(){

    }

    public boolean sellFood(){
        return true;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
