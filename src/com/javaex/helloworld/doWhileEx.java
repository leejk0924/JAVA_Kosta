package com.javaex.helloworld;

import java.util.Scanner;

public class doWhileEx {
    public static void main(String[] args) {
        int num;
        int total = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("숫자를 입력하세요.[0이면 종료]");
            num = sc.nextInt();
            total += num;
            System.out.println("합계 : " + total);
        } while (num != 0);
    }
}
