package com.javaex.oop;

public class BookApp {
    public static void main(String[] args) {
        Book book1 = new Book("삼국지", "이문열");
        book1.showInfo();
        Book book2 = new Book();
        book2.setAuthor("박경리");
        book2.setName("토지");

        book2.showInfo();
    }
}
