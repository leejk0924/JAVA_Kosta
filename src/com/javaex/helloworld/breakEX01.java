package com.javaex.helloworld;

import java.util.Scanner;

public class breakEX01 {
    public static void main(String[] args) {
        TestWhile test = new TestWhile();
        test.cal();
    }
}

class TestWhile{
    int num;
    Scanner sc = new Scanner(System.in);
    void cal(){
        while(true){
            System.out.println("======================");
            System.out.print("정수값을 입력하세요 : ");
            num = sc.nextInt();
            sc.close();

            if(num == 0){
                System.out.println("프로그램이 종료됩니다.");
                System.out.println("======================\n");
                break;
            }
            else if (num %3 == 0){
                System.out.println("3의 배수입니다.");
                System.out.println("======================\n");
            }else{
                System.out.println("3의 배수가 아닙니다.");
                System.out.println("======================\n");
            }
        }
    }
}