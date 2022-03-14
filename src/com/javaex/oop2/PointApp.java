package com.javaex.oop2;

public class PointApp {
    public static void main(String[] args) {
        Point p1 = new Point(2, 3);
        Point p2 = new Point(10, 5);
        Point p3 = new Point(2, 3);
        Point p4 = p1;

        System.out.println(p1.equals(p2));

        System.out.println(p1.equals(p3));

        System.out.println(p1.equals(p4));
    }



}
