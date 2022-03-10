package com.javaex.oop;

public class TvApp {
    public static void main(String[] args) {
        Tv tv1 = new Tv(7, 20, false);
        tv1.status();
        tv1.power(true);
        tv1.volume(120);
        tv1.status();

        tv1.volume(false);
        tv1.status();
        tv1.volume(false);
        tv1.status();

        tv1.channel(0);
        tv1.status();

        tv1.channel(true);
        tv1.channel(true);
        tv1.channel(true);
        tv1.status();

        tv1.power(false);
        tv1.status();


    }
}
