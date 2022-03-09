package com.javaex.helloworld;

import java.util.Scanner;

public class IfEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("점수를 입력하세요");
        int score = sc.nextInt();
        sc.close();

        if (score < 60 && score >= 0){
            System.out.println("F등급");
        }else if (score <69){
            System.out.println("D등급");
        }else if (score < 79) {
            System.out.println("C등급");
        }else if (score < 89){
            System.out.println("B등급");
        }else if (score <= 100){
            System.out.println("A등급");
        }else{
            System.out.println("점수를 다시 입력하세요");
        }
    }
}
