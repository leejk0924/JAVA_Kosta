package com.javaex.oop;


import java.text.DecimalFormat;

public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1229.70);
        System.out.println("백만원은 "+ CConverter.toDoller(1000000)+"달러 입니다.");
        System.out.println("백달러는 "+ CConverter.toKRW(100)+"입니다.");

        CConverter.print(CConverter.toDoller(1000000.0));
        CConverter.print(CConverter.toKRW(100));

    }

}
