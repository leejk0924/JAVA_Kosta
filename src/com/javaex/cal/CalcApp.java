package com.javaex.cal;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean r = true;

        while (r) {
            System.out.print(">>");
            String text = sc.nextLine();
            String[] arr = text.split(" ");         // 배열로 받기

            if ("/q".equals(arr[0])) {
                System.out.println("종료합니다.");
                r = false;
            } else {
                int x = Integer.parseInt(arr[0]);
                int y = Integer.parseInt(arr[2]);
                switch (arr[1]) {
                    case "+":
                        Add add = new Add(x, y);
                        System.out.println(">>" + add.add());
                        break;
                    case "-":
                        Sub sub = new Sub(x, y);
                        System.out.println(">>" + sub.sub());
                        break;
                    case "*":
                        Mul mul = new Mul(x, y);
                        System.out.println(">>" + mul.mul());
                        break;
                    case "/":
                        Div div = new Div(x, y);
                        System.out.println(">>" + div.div());
                        break;
                    default:
                        System.out.println("알수 없는 연산입니다.");
                        break;
                }
            }


        }
    }
}

