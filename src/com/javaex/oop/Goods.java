package com.javaex.oop;

public class Goods {
    private String name;
    private int price;

    public Goods(){}

    public Goods(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public Goods(int price, String name){
        this(name, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price <0){
            System.out.println("입력이 틀렸습니다. 다시 입력하세요");
        }else{
            this.price = price;
        }
    }
    public void showInfo(){
        System.out.println("name : "+this.getName() + "\nprice : "+this.getPrice());
        System.out.println("");
    }

}




