package com.javaex.oop;

public class PointApp {
    public static void main(String[] args) {
        Point point1 = new Point(5, 5);
        point1.draw();
        point1.draw(5,6);

        Point point2 = new Point(10, 20);
        point2.draw();
        point2.draw(10, 20);

        Point point3 = new Point(2,5, false);

    }
}
