package com.javaex.ks;

import com.javaex.exception.ArithException;

public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        }catch (ArithmeticException ae){
            System.out.println("Ae exception");
        } catch (Exception e) {
            System.out.println("Exception");

        }
        System.out.println(6);
    }
}