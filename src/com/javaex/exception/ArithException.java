package com.javaex.exception;

import java.util.Scanner;

public class ArithException {
    public static void main(String[] args) {
        double result = 0.0;
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        //result = 100 / num;

        try{
            result = 100.0 / num;
        } catch (Exception e) {
            result =0;
        }

        System.out.println(result);
        sc.close();

    }
}
