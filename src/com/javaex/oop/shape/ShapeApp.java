package com.javaex.oop.shape;

public class ShapeApp {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setWidth(3.0);
        r.setHeight(4.5);
        System.out.println("사각형의 넓이는 "+ r.area());

        Triangle t = new Triangle(3.0, 4.0);
        System.out.println("삼각형의 넓이는 " + t.area());

        Circle c = new Circle(5.0);
        System.out.println("원의 넓이는 " + c.area());
        System.out.println(c instanceof Circle);
        System.out.println(c instanceof Point);
        System.out.println( c instanceof Shape);
    }
}
