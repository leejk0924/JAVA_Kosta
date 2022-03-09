package com.javaex.helloworld;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Problem {
    public static void main(String[] args) {
//        P1 p1 = new P1();
//        p1.result();
//        P2 p2 = new P2();
//        p2.result();
//        P3 p3 = new P3();
//        p3.result();
//        P4 p4 = new P4();
//        p4.result();
//        P5 p5 = new P5();
//        p5.result();
//        P6 p6 = new P6();
//        p6.result();
//        P7 p7 = new P7();
//        p7.result();
        P8 p8 = new P8();
        p8.result();
    }
}

class P1 {
    protected P1() {
    }

    void result() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0 && i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}

class P2 {
    protected P2() {
    }

    void result() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();
        sc.close();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}

class P3 {
    protected P3() {
    }

    void result() {
        for (int i = 1; i < 10; i++) {
            for (int j = 2; j < 10; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "\t");
            }
            System.out.println("");
        }
    }
}

class P4 {
    protected P4() {
    }

    void result() {
        Integer[] num = new Integer[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("숫자 : ");
            num[i] = sc.nextInt();
        }
        sc.close();
        Arrays.sort(num, Collections.reverseOrder());   // 내림차순
//        Arrays.sort(num);   // 오름차순
        System.out.println("최대값은 " + num[0] + "입니다.");
    }
}

class P5 {
    protected P5() {
    }

    void result() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print((j + i) + "\t");
            }
            System.out.println("");
        }
    }
}

class P6 {
    protected P6() {
    }

    void result() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.print("숫자를 입력하세요 : ");
        int num = sc.nextInt();
        sc.close();
        if (num % 2 == 0) {                        // 입력한 숫자가 짝수인 경우
            for (int i = 0; i <= num; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println("결과값 : " + sum);
        } else {                                  // 입력한 수가 홀수인 경우
            for (int i = 0; i <= num; i++) {
                if (i % 2 == 1) {
                    sum += i;
                }
            }
            System.out.println("결과값 : " + sum);
        }


    }
}

class P7 {
    protected P7() {
    }

    void result() {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean x = true;

        while (x) {

            int rNum = (int) (Math.random() * 100) + 1;
            System.out.println("임의의 정수 : "+rNum);
            System.out.println("============================");
            System.out.println("\t[숫자맞추기 게임 시작]");
            System.out.println("============================");
            while (true) {
                System.out.print("숫자를 입력해주세요. :");
                num = sc.nextInt();
                if (num == rNum) {
                    System.out.println("맞았습니다.");
                    break;
                } else if (num > rNum) {
                    System.out.println("더 낮게");
                } else {
                    System.out.println("더 높게");
                }
            }
            while(true){
                System.out.print("게임을 반복하시겠습니까? (\"Y\" or \"N\")");
                char a = sc.next().charAt(0);
                if(a =='Y' || a=='y'){
                    System.out.println("다시 게임을 시작하겠습니다.");
                    break;
                }else if (a == 'N'|| a=='n') {
                    System.out.println("============================");
                    System.out.println("\t게임을 종료합니다.");
                    System.out.println("============================");
                    x = false;
                    break;
                }else {
                    System.out.println("다시 입력해 주세요");
                }
            }
        }
        sc.close();
    }
}

class P8{
    int totalMoney = 0;

    void result(){
        Scanner sc = new Scanner(System.in);
        int plusMoney = 0;
        int minusMoney = 0;
        boolean control = true;

        while(control){
            System.out.println("------------------------------");
            System.out.println("1.예금|\t2.출금|\t3.잔고|\t4.종료");
            System.out.println("------------------------------");
            System.out.print("선택>");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.print("예금액>");
                    plusMoney = sc.nextInt();
                    if(plusMoney<0){
                        System.out.println("다시 입력하세요");
                        break;
                    }else{
                        totalMoney += plusMoney;
                        break;
                    }

                case 2:
                    System.out.print("출금액>");
                    minusMoney = sc.nextInt();
                    if(minusMoney<0){
                        System.out.println("다시 입력하세요");
                        break;
                    } else{
                        if(totalMoney-minusMoney < 0){
                            System.out.print("잔액이 부족합니다.");
                        }else{
                            totalMoney -= minusMoney;
                        }break;
                    }

                case 3:
                    System.out.println("잔고액>"+totalMoney);
                    break;
                case 4:
                    System.out.println("종료");
                    control = false;
                    break;
                default:
                    System.out.println("이외의 숫자입니다. 다시 입력해주세요");
            }
        }
    }
}
