package com.javaex.practice;

public class Book {


    private int bookNo;
    private String title;
    private String author;
    private int stateCode = 1;              // 1이면 재고 있음 , 0이면 재고 없음

    public Book(){}

    public Book(int bookNo, String title, String author) {
        this.bookNo = bookNo;
        this.title = title;
        this.author = author;
    }

    public int getStateCode() {
        return stateCode;
    }

    public void setStateCode(int stateCode) {
        this.stateCode = stateCode;
    }

    public void print(){
        String s = "";
//         System.out.println(bookNo+" 책제목 :"+title+" 저자 : "+author+" 대여유무 : "+(this.stateCode==1?"재고있음":"대여중"));
        if(stateCode == 1){
            s = "재고 있음";
        } else if (stateCode == 0){
            s = "대여중";
        }
        System.out.println(bookNo+" 책제목 :"+title+" 저자 : "+author+" 대여유무 : "+ s);

    }


}
