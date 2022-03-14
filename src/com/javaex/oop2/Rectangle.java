package com.javaex.oop2;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

    }
    public int x(){
        return width * height;
    }

    public boolean equals(Object obj){
        Rectangle a = ((Rectangle) obj);
        if(this.hashCode() == a.hashCode()){
            return true;
        } else if (this.x() == a.x()) {
            return true;
        } else {
            return false;
        }
    }


}
