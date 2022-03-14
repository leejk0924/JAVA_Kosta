package com.javaex.oop.shape;

public class Triangle extends Shape{
    private double width;
    private double height;

    public Triangle() {
    }

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() {
        return (width * height / 2.0);
    }
}
