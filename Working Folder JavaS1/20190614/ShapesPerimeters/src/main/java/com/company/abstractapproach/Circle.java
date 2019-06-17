package com.company.abstractapproach;

public class Circle extends Shape{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void area() {
        double area = radius*radius*3.14;
    }

    public void perimeter() {
        double perimeter = 2*radius*3.14;
    }
}
