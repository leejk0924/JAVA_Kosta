package com.javaex.oop;

import java.util.Scanner;

public class FriendApp {
    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];                                   // Friend 타입의 배열 3개 생성

        Scanner sc = new Scanner(System.in);                                    // 친구 3명의 정보 입력받기 위해 Scanner 객체 생성
        System.out.println("친구를 3명 등록해 주세요");
        for (int i = 0; i < friendArray.length; i++) {                          // 3명의 친구 정보를 입력받기 위해 for 문
            String input = sc.nextLine();                                      // input 으로 친구 입력 받기
            String[] split = input.split(" ");                            // split[]에 input 으로 받은 값 자르기 (.split 으로 " " 마다 자르기
            friendArray[i] = new Friend(split[0], split[1], split[2]);          // friendArray[0] <- 참조 변수에  Friend 객체 생성해서 넣기
        }                                                                       // for문으로 반복

        for (int i = 0; i < friendArray.length; i++) {
            friendArray[i].showInfo();
        }

        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
            //친구정보 출력 메소드 호출
        }
        sc.close();
    }
}
