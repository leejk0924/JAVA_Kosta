package com.javaex.oop;

public class Account {

    private String accountNo;
    private int balance;

    // Constructor
    public Account() {
    }

    public Account(String accountNum){
        accountNo = accountNum;
        System.out.println(accountNum + " 계좌가 개설되었습니다.");
    }

     /*
        Getter / Setter
     */

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        if (balance < 0){
            System.out.println("값을 다시 입력하세요");
        } else {
            this.balance = balance;
        }
    }


    /*
     ***Methode
     * */

    // 예금액
    public void deposit(int money){
        if (money < 0){                                             // 예금액이 마이너스이면 예외처리
            System.out.println("입력이 틀렸습니다. 다시 입력하세요.");
        } else {
            balance += money;
        }
    }

    public void withdraw(int money){
        if (money <0){
            System.out.println("입력이 틀렸습니다. 다시 입력하세요.");
        } else {
            balance -= money;
        }
    }

    public void showBalance(){
        System.out.println(balance);
    }

    //생성자 작성
    
    //필요한 메소드 작성

}
