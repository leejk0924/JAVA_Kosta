package com.javaex.oop.shape;

public class Rectangle extends Shape implements Point{
    private double width;
    private double height;



    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void drawable() {

    }

    @Override
    public double area() {
        return this.width * this.height;
    }
}
