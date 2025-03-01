package com.company;

public class App {
    public Car createCar(){
        return new Car("Honda", "Accord", "Sedan", "Blue", "2.6L V6", "CVT", 4, 31.1, 25218);
    }

    public TV createTV(){
        return new TV("Zenith", "U2121H", 83, "NBC", 55, false);
    }

    public Radio createRadio(){
        return new Radio("Sony", "V32", 2, "WUNV", 30, true);
    }

    public Microwave createMicrowave(){
        return new Microwave("Haier", "X1200w", 45, "12:00", false);
    }

    public CoffeeMaker createCoffeeMaker(){
        return new CoffeeMaker("Sunbeam", "C12", 12, 8, true);
    }

    public ComputerMouse createComputerMouse(){
        int[] location = new int[2];
        return new ComputerMouse("Razer", "Naga", 960, 540, location);
    }

}
