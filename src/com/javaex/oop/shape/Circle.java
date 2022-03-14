package com.javaex.oop.shape;

import com.javaex.oop.shape.Shape;

public class Circle extends Shape implements Point{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public void drawable() {
        System.out.println("그림 그림");
    }

    @Override
    public double area() {
        return this.radius * this.radius * 3.14;
    }
}
