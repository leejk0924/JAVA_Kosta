package com.javaex.helloworld;

public class arrayTest1 {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++){
            System.out.println(i+"번째 값:" + args[i]);
        }
    }
}
