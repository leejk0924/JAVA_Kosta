package com.javaex.helloworld;

import java.util.Scanner;

public class whileEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dan;
        int i = 1;

        System.out.println("단을 입력해주세요");
        dan = sc.nextInt();
        System.out.println("단 : "+ dan);
        sc.close();
        while(i < 10){
            System.out.println(dan+" * " +i+" = "+(dan*i));
            i++;
        }
    }
}
