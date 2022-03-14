package com.javaex.oop2;

public class RectangleApp {
    public static void main(String[] args) {
        Rectangle a = new Rectangle(6, 4);
        Rectangle b = new Rectangle(2, 12);
        Rectangle c = new Rectangle(3, 3);
        Rectangle d = c;

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equals(d));
        System.out.println(d.equals(c));

        System.out.println(a.equals(new Rectangle(2,12)));

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
    }
}
