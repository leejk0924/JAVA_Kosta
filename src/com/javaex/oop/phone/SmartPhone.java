package com.javaex.oop.phone;

public class SmartPhone extends Phone{
    private String number;

    @Override
    public void call(String number) {
        System.out.println(number+ "에 전화를 걸었습니다.");
    }

    public void turnOn(boolean on){
        if(on == true){
            System.out.println("전원이 켜져있습니다.");
        }else {
            System.out.println("전원이 꺼져있습니다.");
        }
    }

    public void searchInternet(String url){
        System.out.println(url+"으로 인터넷 검색");
    }
}
