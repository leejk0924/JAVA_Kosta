package com.javaex.oop.phone;

public class Telephone extends Phone{
    @Override
    public void call(String number) {
        System.out.println(number+"으로 전화를 걸었습니다.");
    }
    public void power(Boolean on){
        if(on == true){
            System.out.println("전원이 켜져있습니다.");
        }else {
            System.out.println("전원이 꺼져있습니다.");
        }
    }
}
