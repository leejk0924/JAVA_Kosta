package com.javaex.helloworld;

public class PracticeEx1 {
    public static void main(String[] args) {
//        GooGooDan test1 = new GooGooDan();
//        test1.Output();

        StarTree test2 = new StarTree();
        test2.Output();
//        StarTree2 test3 = new StarTree2();
//        test3.Input();
//        test3.Output();
    }
}

class GooGooDan {
    public GooGooDan() {
    }

    void Output() {
        for (int i = 2; i < 10; i++) {
            System.out.println("-----" + i + "단-----");
            for (int j = 1; j < 10; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}

class StarTree {
    public StarTree() {
    }
    void Output() {
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 5; j++) {
                if (j < i) {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
    }
}

class StarTree2{
    String[][] A = new String[5][6];
    public StarTree2(){}

    void Input(){
        for(int i = 1; i<6; i++){
            for(int j = 0; j < 5; j++){
                if(j < i){
                    A[j][i] = "*";
                }
                else{
                    A[j][i] = " ";
                }
            }
        }
    }
    void Output(){
        for(int i = 1; i<6; i++){
            for(int j = 0; j < 5; j++){
                System.out.print(A[j][i]);
            }
            System.out.println("");
        }
    }
}