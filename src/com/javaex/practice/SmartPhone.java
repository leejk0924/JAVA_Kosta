package com.javaex.practice;

public class SmartPhone extends MusicPhone {
    public SmartPhone() {
    }

    public void execute(String str){
        if("앱".equals(str)){
            playApp();
        }else if ("음악".equals(str)){
            this.playMusic();
        }else{
            super.execute(str);
        }
    }

    public void playApp(){
        System.out.println("앱실행");
    }
    public void playMusic(){
        System.out.println("다운로드해서 음악재생");
    }
}
