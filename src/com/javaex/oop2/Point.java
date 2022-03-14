package com.javaex.oop2;

import java.util.Objects;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj){
        Point p = ((Point) obj);
        if(this.hashCode() == p.hashCode()){
            return true;
        } else if (this.x == p.x && this.y == p.y) {
            return true;
        } else {
            return false;
        }
    }

}
