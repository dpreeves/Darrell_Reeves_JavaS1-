package com.company;

public class Restaurant {
    private String name;
    private String menu;
    private int inventory;

    private SodaPop sodapop;

    public Restaurant(){

    }

    public boolean sellfood(){
        return true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }
}
