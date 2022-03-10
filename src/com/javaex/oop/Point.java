package com.javaex.oop;

public class Point {
    private int x, y;
    private boolean z;

    public Point() {}

    public Point(int x, int y, boolean z) {
        if(z == true){
            System.out.println("점 [x="+x+", y="+this.y+"]을 그렸습니다.");
        }else if(z ==false){
            System.out.println("점 [x="+x+", y="+this.y+"]을 지웠습니다.");
        }else{
            System.out.println("입력이 틀렸습니다.");
        }
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    void draw(){
        System.out.println("점 [x="+x+", y="+this.y+"]을 그렸습니다.");
    }
    void draw(int x, int y){
        this.setX(0);
        this.setY(0);
        System.out.println("점 [x="+x+", y="+this.y+"]을 지웠습니다.");
    }
}

