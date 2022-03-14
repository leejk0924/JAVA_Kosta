package com.javaex.ks;

public class ToStringTest {
    public static void main(String[] args) {
        Car car = new Car();
        Car car2 = new Car();
        System.out.println(car.toString());
        System.out.println(car2.toString());
    }
}


class Car{
    private int carSize = 300;

    public int getCarSize() {
        return carSize;
    }

    public void setCarSize(int carSize) {
        this.carSize = carSize;
    }

    public void carDoor(){
        System.out.println("test");
    }
}