package com.javaex.oop;

public class Base{
    public Base(){}

    public void service(String state){
        //코드작성
        switch (state){
            case "낮":
                day();

                break;
            case "밤":
                night();
                break;
            case "오후":
                afternoon();
                break;
        }
        
//        if ("낮".equals(state)){         // 자바 개발자는 조건을 객체로 보고 이와 같이 코드 작성
//            day();
//        }else if ("밤".equals(state)){
//            night();
//        }else if("오후".equals(state)){
//            afternoon();
//        }
    }

    public void day(){
        System.out.println("낮에는 열심히 일하자");
    }

    public void night(){
        //코드 작성
        System.out.println("night");
    }

    public void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
    }
}
