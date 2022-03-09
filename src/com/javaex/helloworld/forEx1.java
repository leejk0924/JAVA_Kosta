package com.javaex.helloworld;

import java.util.Scanner;

public class forEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("단을 입력하세요");
        int dan = sc.nextInt();
        sc.close();
        System.out.println("단 : " + dan);

        for (int i = 1; i < 10; i++){
            System.out.println(dan + " * " + i + " = " + (dan * i));
        }
    }
}
