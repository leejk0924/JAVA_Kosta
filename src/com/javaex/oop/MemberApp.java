package com.javaex.oop;

public class MemberApp {
    public static void main(String[] args) {
        Member m = new Member("myId", "홍길동", 100);        // String id, String name, int point
        m.showInfo();
        System.out.println(m.toString());

    }
}
