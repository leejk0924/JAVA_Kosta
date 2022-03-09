package com.javaex.helloworld;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] leftArray = new int[]{10, 20, 30};
        int[] rightArray = new int[]{10, 20, 30};
        System.out.println(leftArray.equals(rightArray));
        System.out.println(leftArray[2] == rightArray[2]);


    }
}
