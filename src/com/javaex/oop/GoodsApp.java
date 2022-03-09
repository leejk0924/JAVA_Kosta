package com.javaex.oop;

public class GoodsApp {
    public static void main(String[] args) {
        Goods camera = new Goods("nikon", 400000);
        camera.showInfo();

        Goods cup = new Goods("머그컵", 2000);
        cup.showInfo();

        Goods test = new Goods(30000, "실험");
        test.showInfo();

    }
}
