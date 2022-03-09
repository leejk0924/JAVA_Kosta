package com.javaex.helloworld;

public class continueEx01 {
    public static void main(String[] args) {

        for(int i = 0; i < 20; i++){
            if (i %2 == 0 || i %3 == 0){
                continue;
            } else{
                System.out.println(i);
            }
        }
    }
}
