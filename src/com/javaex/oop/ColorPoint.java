package com.javaex.oop;

public class ColorPoint extends Point{
    private String color;

    public ColorPoint(){
        super();
    }

    public ColorPoint(String color) {
        this.color = color;
    }

    public ColorPoint(int x, int y, boolean z, String color) {
        super(x, y, z);
        this.color = color;
    }

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void showInfo(){
        System.out.println("점 [x="+this.getX()+", y="+this.getY()+"]을 그렸습니다. 그리고 색상은 "+this.color+"입니다.");
    }
}
