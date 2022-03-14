package com.javaex.oop2;

public class test {
    public static void main(String[] args) {
        String greet = "Hello";
        String name = " JAVA!";
        String greeting = greet.concat(name);
        System.out.println(greeting);
        System.out.println(greeting.charAt(0));
        System.out.println(greeting.charAt(10));
        System.out.println(greeting.substring(0,4));

        for (int i = 0; i < greeting.length(); i++) {
            System.out.println(greeting.charAt(i));
        }

        String str = "apple mango banna";
        System.out.println(str.replace(" ", ", "));
        System.out.println(str);
    }


}
