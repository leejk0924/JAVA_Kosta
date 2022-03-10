package com.javaex.oop;

import java.text.DecimalFormat;

public class CConverter {
    
    public static double rate;
    
    public static void setRate(double r){
        CConverter.rate = r;
    }
    
    public static double toDoller(double won){
        return won / rate;
    }

    public static double toKRW(double dollar){
        return dollar * rate;
    }
    
    public static void print(double result){
        DecimalFormat df = new DecimalFormat("###,###.##");
        String money = df.format(result);
        System.out.println(money);
    }
}
