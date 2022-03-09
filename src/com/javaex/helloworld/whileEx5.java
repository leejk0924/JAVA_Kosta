package com.javaex.helloworld;

public class whileEx5 {
    public static void main(String[] args) {
        test1 test1 = new test1();
        test1.result();

    }
}

class test1 {

    public test1() {
    }

    void result() {
        int i = 1;
        int a = 0;
        while (true) {
            if (i % 6 == 0 && i % 14 == 0) {
                System.out.println("6과 14의 배수인 가장 작은 정수는 : " + i);
                a++;
                if (a == 10) {
                    System.out.println("여기까지 test1");
                    break;
                }
            }
            i++;
        }
    }
}
