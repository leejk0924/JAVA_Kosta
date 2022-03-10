package com.javaex.oop;

import java.awt.*;

public class PointApp {
    public static void main(String[] args) {
        Point point1 = new Point(5, 5);
        point1.draw();
        point1.draw(5,6);

        Point point2 = new Point(10, 20);
        point2.draw();
        point2.draw(10, 20);

        Point point3 = new Point(2,5, false);

        Point p = new Point(4, 4);
        ColorPoint cp1 = new ColorPoint("red");
        ColorPoint cp2 = new ColorPoint(10, 10, "blue");
        cp1.showInfo();
        cp2.showInfo();

        cp2.draw();
    }
}
