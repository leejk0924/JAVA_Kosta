package com.javaex.helloworld;

import java.util.Arrays;
import java.util.Collections;

public class MiniLotto {
    public static void main(String[] args) {
        Integer[] num = new Integer[6];
        for (int i = 0; i < 6; i++) {
            num[i] = (int) (Math.random() * 45) + 1;

            for (int j = 0; j<i; j++){
                if (num[i] == num[j]){
                    i--;
                }
            }
        }
        Arrays.sort(num);
        for(int i=0; i<num.length;i++){
            System.out.println(num[i]);
        }
    }
}
