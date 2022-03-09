package com.javaex.helloworld;

import java.util.Scanner;

public class switchCaseEx4 {
    public static void main(String[] args) {
        SwitchCase test1 = new SwitchCase();
        test1.input();
        test1.output();

//        IfElse test2 = new IfElse();
//        test2.input();
//        test2.output();
    }
}

class SwitchCase {
    int month = 0;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        month = sc.nextInt();
        sc.close();
    }
    void output() {
        System.out.print(month + "월이면 ");
        switch (month) {
            case 2:
                System.out.println("\"28일\"");
                break;
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("\"31일\"");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("\"30일\"");
                break;
            default:
                System.out.println("다시 입력하세요.");
                break;
        }
    }
}

class IfElse {
    int month = 0;
    public IfElse(){}

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요");
        month = sc.nextInt();
        sc.close();
    }

    void output() {
        System.out.print(month + "월이면 ");
        if (month == 2) {
            System.out.println("\"28일\"");
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("\"31일\"");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("\"30일\"");
        } else {
            System.out.println("다시 입력하세요.");
        }
    }
}
