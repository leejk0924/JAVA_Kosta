package com.javaex.helloworld;

import java.util.Scanner;

public class Test_Kiosk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 10000;
        int ame_price = 2000;
        int ban_price = 3000;
        int ade_price = 3500;
        int order;
        boolean i = true;
        boolean j = true;
        while (i) {
            System.out.println("==== KH 카페 키오스크====");
            System.out.println("주문할 메뉴를 선택해 주세요.");
            System.out.println("1. 아메리카노(2,000)");
            System.out.println("2. 바닐라라떼(3,000");
            System.out.println("3. 자몽에이드(3,500");
            System.out.println("현재 잔액 : " + balance + "원");
            System.out.print("메뉴 선택 >>");
            order = sc.nextInt();
            switch (order){
                case 1:
                    balance -= ame_price;
                    System.out.println("자몽에이드를 선택했습니다.");
                    System.out.println("남은 잔액 : " + balance);
                    break;
                case 2:
                    balance -= ban_price;
                    System.out.println("바닐라라뗴를 선택했습니다.");
                    System.out.println("남은 잔액 : " + balance);
                    break;
                case 3:
                    balance -= ade_price;
                    System.out.println("자몽에이드를 선택했습니다.");
                    System.out.println("남은 잔액 : "+ balance);
                    break;
                default:
                    System.out.println("없는 메뉴를 선택했습니다. 다시 선택해 주세요.");
                    break;
            }
            System.out.println("계속 주문하시려면 Y를 주문을 종료하려면 N을 입력하세요.");

            while(j){
                char A = sc.next().charAt(0);
                switch (A){
                    case 'Y':
                        i = true;
                        j = false;
                        break;
                    case 'N':
                        i = false;
                        j = false;
                        break;
                    default:
                        System.out.println("다시 입력해주세요.(Y or N)");
                        break;
                }
            }

        }
    }

}

