package com.javaex.oop;

public class Tv {
    private int channel;
    private int volume;
    private boolean power;

    public Tv() {
        this.channel = 7;
        this.volume = 20;
        this.power = false;
    }

    public Tv(int channel, int volume, boolean power) {
        this.channel = channel;
        this.volume = volume;
        this.power = power;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }
    void volume(int volume){
        if(volume>=0 && volume<=100){
            this.volume = volume;
        }else if(volume>100){
            System.out.println("volume 최대");
            this.volume = 100;
        } else if (volume < 0){
            System.out.println("volume 최소");
            this.volume = 0;
        }
    }

    void volume(boolean up){
        if(volume >= 0 && volume <= 100){
            if(up == true){
                this.volume++;
            }else if(up == false){
                this.volume--;
            }else{
                System.out.println("volume 값이 잘못 들어왔습니다.");
            }
        }
    }

    void channel(int channel){
        if(channel >0 && channel <256){
            this.channel = channel;
        }else{
            System.out.println("채널 영역에서 벗어났습니다.");
        }
    }
    void channel(boolean up){
        if(up == true){
            this.channel++;
        }else if (up == false){
            this.channel--;
        }else{
            System.out.println("다시 눌러주세요");
        }
    }

    public boolean getPower() {
        return power;
    }
    void power(boolean on){
        if(on == true){
            this.power = true;
        }else if (on == false){
            this.power = false;
        } else {
            System.out.println("채널이 없습니다.");
        }
    }
    void status(){
        String a = "";
        if(getPower() == true){
            a = "On";
        }else{
            a = "Off";
        }
        System.out.println("================= TV 상태 =================");
        System.out.println("power = "+ a +", channel = "+getChannel()+", volume = "+getVolume());
    }
}
