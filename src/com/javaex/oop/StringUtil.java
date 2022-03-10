package com.javaex.oop;

import java.util.ArrayList;

public class StringUtil {

    public static String concatString(String[] arr) {
//        ArrayList<String> a = new ArrayList<String>(3);
//        for (int i = 0; i < 3; i++) {
//            a.add(arr[i]);
        String a = "";
        for (int i = 0; i < arr.length; i++) {
            a += arr[i];
        }
        return a;
    }

}

