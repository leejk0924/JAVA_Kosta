package com.javaex.sounapp;

public class Dog implements Soundable {
    public Dog() {
    }
    @Override
    public String sound(){
        return "멍멍";
    }
}
